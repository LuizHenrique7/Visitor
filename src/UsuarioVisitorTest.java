import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioVisitorTest {

    @Test
    void deveExibirComputador() {
        Computador computador = new Computador("Dell", "Dell XPS 13", new Loja("Best Buy"));

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Computador{marca=Dell, modelo='Dell XPS 13', loja=Best Buy}", visitor.exibirComputador(computador));
    }

    @Test
    void deveExibirNotebook() {
        Notebook notebook = new Notebook("Samsung", "Galaxy book", new Loja("Samsung"));

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Notebook{marca=Samsung, modelo='Galaxy book', loja=Samsung}", visitor.exibirNotebook(notebook));
    }
    @Test
    void deveExibirCelular() {
        Celular celular = new Celular("Apple", "iPhone 12",  new Loja("Apple Store"));

        UsuarioVisitor visitor = new UsuarioVisitor();
            assertEquals("Celular{marca=Apple, modelo='iPhone 12', loja=Apple Store}", visitor.exibirCelular(celular));
    }

}