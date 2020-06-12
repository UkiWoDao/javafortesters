import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo() {
        Integer answer = 2 + 2;
        assertEquals(4, answer);
    }
}
