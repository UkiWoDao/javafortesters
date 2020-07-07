package chap004;// import org.junit.Test; wrong import
import org.junit.jupiter.api.Test;

import static java.lang.Integer.toHexString;
import static junit.framework.TestCase.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExplorationTest() {
        Integer two = 2;
        assertEquals("intValue returns int 2", 2, two.intValue());
    }

    @Test
    public void integerToHexTest() {
        Integer eleven = 11;
        assertEquals("11 becomes b", "b", toHexString(eleven));
    }
}
