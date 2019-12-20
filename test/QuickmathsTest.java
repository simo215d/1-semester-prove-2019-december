import opgaver12345.QuickMaths;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void testSum() {
        QuickMaths qm = new QuickMaths();
        assertEquals(10,qm.sum(5,5));
        assertEquals(5,qm.sum(-3,8));
        assertEquals(7,qm.sum(0,7));
    }

    @Test
    public void testGennemsnit() {
        QuickMaths qm = new QuickMaths();
        assertEquals(8,qm.gennemsnit(6,10));
        assertEquals(0,qm.gennemsnit(-3,3));
        assertEquals(3,qm.gennemsnit(3,4));
    }

}