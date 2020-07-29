package chap013;

import Exceptions.InvalidPasswordException;
import domainentities.User;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class InvalidPasswordExceptionTest {

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
            // fail line executed only if line 24 finished, which we expect because the password is invalid
            fail("An exception not thrown");
        } catch (InvalidPasswordException invalidPassword) {
           assertTrue("The exception was thrown", true);
        }

    }

    @Test
    public void checkInvalidPasswordIsThrownOnSetPassword() {
        User user = new User();
        try {
            user.setPassword("wrong");
            fail("Exception not thrown");
        } catch (InvalidPasswordException IPE) {
            IPE.printStackTrace();
        }
    }

}
