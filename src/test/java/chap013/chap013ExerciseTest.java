package chap013;

import Exceptions.InvalidPasswordException;
import domainentities.User;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class chap013ExerciseTest {
    @Test
    public void checkInvalidPasswordExceptionIsThrownOnSetPassword() {
        User user = new User();
        try {
            user.setPassword("bad");
            fail("Exception was not thrown where it should");
        } catch (InvalidPasswordException IPE) {
            assertTrue("Invalid password exception was thrown", true);
        }
    }

    @Test
    public void checkInvalidPasswordExceptionIsThrownInTheNonDefaultConstructor() {
        try {
            User user = new User("uros", "test");
            fail("The expected exception was not thrown");
        } catch (InvalidPasswordException e) {
            assertTrue("Invalid password exception was thrown",true);
        }
    }

    // junit5 version of asserting an exception was thrown
    @Test
    public void checkInvalidPasswordExceptionIsThrownInTheNonDefaultConstructorInJunit5() {
        Exception exception = assertThrows(InvalidPasswordException.class, () -> {
            User user = new User("uros", "bad");
        });
    }

    @Test
    public void checkInvalidPasswordExceptionIsNotThrownInDefaultConstructor() {
        try {
            User user = new User();
        } catch (Exception e) {
            fail("Should not throw any exceptions");
        }
    }

    @Test
    public void checkCorrectMessageIsReturnedWhenInvalidPasswordExceptionIsThrown() {
        User user = new User();
        try {
            user.setPassword("wrong");
        } catch (InvalidPasswordException IPE) {
            assertTrue("Exception message contains 'Password must be at least 6 characters of length'",
                    IPE.getMessage().contains("Password must be at least 6 characters of length"));
        }
    }

}

