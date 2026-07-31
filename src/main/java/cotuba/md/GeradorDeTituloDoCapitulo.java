package cotuba.md;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Heading;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public class GeradorDeTituloDoCapitulo extends AbstractVisitor {

    private String titulo;

    public String extraiTitulo(Node document) {
        document.accept(this);
        return this.titulo;
    }

    @Override
    public void visit(Heading heading) {
        // Pega apenas o primeiro título H1 encotrado
        if (heading.getLevel() == 1 && this.titulo == null) {
            if (heading.getFirstChild() instanceof Text text) {
                this.titulo = text.getLiteral();
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }
}
