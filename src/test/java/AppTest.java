import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AppTest {

    @Test
    public void testPrintHelloWorld(){
        Assertions.assertEquals(App.getHelloWorld(), "Hello World","A mensagem é: " + App.getHelloWorld());
    }
}
