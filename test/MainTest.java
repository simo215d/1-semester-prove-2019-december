import junit.framework.TestCase;
import opgaver12345.Main;

public class MainTest extends TestCase {


    public void testHelloAndras() {

        Main m = new Main();

        assertEquals("Hello András!", m.hello("András"));

    }


    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}