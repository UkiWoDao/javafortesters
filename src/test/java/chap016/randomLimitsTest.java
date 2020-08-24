package chap016;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class randomLimitsTest {

    @Test
    public void checkNextIntIsWithinMinMaxRange() {
        Random generate = new Random();

        for (int i = 0; i < 1000; i++) {
            int randomInt = generate.nextInt();

            assertThat(randomInt > Integer.MIN_VALUE, is(true));
            assertThat(randomInt < Integer.MAX_VALUE, is(true));
        }
    }
    
    @Test
    public void checkNextBooleanGeneratesTrueOrFalse() {
        Random generate = new Random();

        for (int i = 0; i < 1000; i++) {
            boolean randomBoolean = generate.nextBoolean();

            assertThat(randomBoolean, either(is(true)).or(is(false)));
        }
    }

    @Test
    public void checkNextLongIsWithinMinMaxRange() {
        Random generate = new Random();

        for (int i = 0; i < 1000; i++) {
            Long randomLong = generate.nextLong();

            assertThat(randomLong > Long.MIN_VALUE, is(true));
            assertThat(randomLong < Long.MAX_VALUE, is(true));
        }
    }

    @Test
    public void checkNextFloatIsInRange() {
        Random generate = new Random();

        for(int i = 0; i < 1000; i++) {
            Float randomFloat = generate.nextFloat();

            assertThat(randomFloat > 0.0f, is(true));
            assertThat(randomFloat < 1.0f, is(true));
        }
    }

}
