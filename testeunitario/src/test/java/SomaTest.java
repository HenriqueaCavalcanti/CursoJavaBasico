import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class SomaTest {

    @Mock
    private Soma soma;


    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
//        soma = new Soma();
    }

    @Test
    public void somaTest() throws Exception {
        int soma = this.soma.soma(2, 4);
       Assertions.assertEquals(6, soma);
       Assertions.assertTrue(soma > 4);
    }

    @Test
    public void numero1AcimaDeTresRecebe1() throws Exception {
        int valor = this.soma.soma(4, 4);
        Assertions.assertEquals(9, valor);
    }

    @Test
    public void somaTestWithException() {
        Assertions.assertThrows(Exception.class, () -> {
            this.soma.soma(0, 4);
        });
    }
}
