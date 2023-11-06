package teste.poo;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void tentefalarOi() {
        Pessoa pessoa = new Pessoa();
        assertEquals("Oi mundo", pessoa.falarOi());
    }
}
