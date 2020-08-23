package chap015;

import org.junit.jupiter.api.Test;
import java.util.List;
import static chap015.FindAllOccurrences.findAllOccurrences;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class chap015exerciseTest {
    public List<Integer> results;

    @Test
    public void findPositionOfAllOccurrencesInAString() {
        results = findAllOccurrences("na vrh brda vrba mrda", "r");

        assertThat(results.size(), is(4));
        assertThat(results.contains(4), is(true));
        assertThat(results.contains(8), is(true));
        assertThat(results.contains(13), is(true));
        assertThat(results.contains(18), is(true));
        assertThat(results.contains(5), is(false));
    }

    @Test
    public void checkReturnedListOfExampleStringWithFiveOccurrences() {
        results = findAllOccurrences("oooooh", "o");

        assertThat(results.size(), is(5));
    }

    @Test
    public void checkReturnedListOfExampleStringWithNoOccurrences() {
        results = findAllOccurrences("lalalalala", "x");

        assertThat(results.isEmpty(), is(true));
    }

}
