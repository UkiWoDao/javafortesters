package chap013;

import Exceptions.InvalidPasswordException;
import domainentities.User;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CheckInvalidPasswordExceptionTest {

    @Test
    public void canCreateDefaultUserWithoutHandlingException() {
        User aUser = new User();

        assertEquals("username", aUser.getUsername());
        assertEquals("password", aUser.getPassword());
    }

    @Test
    public void haveToCatchExceptionWithNonEmptyConstructor() {
        try {
            User user = new User("test", "oops");
            fail("An exception not thrown");
        } catch (InvalidPasswordException invalidPassword) {
           assertTrue("The exception was thrown", true);
        }

    }
}
