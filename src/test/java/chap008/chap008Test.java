package chap008;

import org.junit.jupiter.api.Test;

import static chap008.SwitchShortCode.shortCodeSorting;
import static junit.framework.TestCase.*;

public class chap008Test {
    @Test
    public void ternaryOperatorTest() {
        assertEquals("2 == cats", "cats", catOrCats(2));
    }

    public String catOrCats(int numberOfCats){
        return numberOfCats > 1 ? "cats" : "cat";
    }

    @Test
    public void assertWithConditionals() {
        boolean truthy = false;

        if(truthy) assertTrue(truthy); else assertFalse(truthy);
    }

    @Test
    public void checkShortCodeString() {
        String shortCode = shortCodeSorting("uK");
        assertEquals("shortCode equals United Kingdom", "United Kingdom", shortCode);;
    }

}
