package cotuba.application;

import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import cotuba.domain.FormatoEbook;
import cotuba.md.RenderizadorMDParaHTML;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.List;

@Component
public class Cotuba {

    private final List<GeradorEbook> geradoresEbooks;

    public Cotuba(List<GeradorEbook> geradoresEbooks) {
        this.geradoresEbooks = geradoresEbooks;
    }

    public void executa(ParametrosCotuba parametros){

        FormatoEbook formato = parametros.getFormato();
        Path diretorioDosMD = parametros.getDiretorioDosMD();
        Path arquivoDeSaida = parametros.getArquivoDeSaida();

        var renderuzadorMDParaHTML = new RenderizadorMDParaHTML();
        List<Capitulo> capitulos = renderuzadorMDParaHTML.renderiza(diretorioDosMD);

        Ebook ebook = new Ebook();
        ebook.setFormato(formato);
        ebook.setArquivoDeSaida(arquivoDeSaida);
        ebook.setCapitulos(capitulos);

        geradoresEbooks.stream()
                .filter(geradorEbook -> geradorEbook.aceita(formato))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Formato inválido: " + formato))
                .gera(ebook);

    }
}
