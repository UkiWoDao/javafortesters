package chap015;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class chap015exerciseTest {
    @Test
    public void findPositionOfAllOccurrencesInAString() {
        List<Integer> results;
        results = findAllOccurrences("na vrh brda vrba mrda", "r");

        // we know the char 'r' appears 4 times, so the list with all the occurrences will have the same size
        assertThat(results.size(), is(4));
    }

    private List<Integer> findAllOccurrences(String string, String substring) {
        List<Integer> list = new ArrayList<Integer>() {
            
        }
    }

}
