import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    @Test
    public void testPrintHelloWorld(){
        assertEquals(App.getHelloWorld(), "Hello World");
    }
}