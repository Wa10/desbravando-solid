package cotuba.application;

import cotuba.domain.Ebook;
import cotuba.domain.FormatoEbook;

public interface GeradorEbook {

    void gera(Ebook ebook);
    boolean aceita(FormatoEbook formato);
}
