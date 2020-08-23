package chap015;

import Exceptions.InvalidPasswordException;

import static domainentities.User.*;
import static org.junit.Assert.*;

import domainentities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class regexTest {

    @Test
    public void checkDigitsRequiredWithUpperCase() {
        User user = new User();

        Assertions.assertThrows(InvalidPasswordException.class, () -> {
            user.setPassword("InvalidPassword");
        });
        assertFalse(user.getPassword().equals("InvalidPassword"));
    }

    @Test
    public void checkUpperCaseRequiredWithDigits() {
        User user = new User();
        Assertions.assertThrows(InvalidPasswordException.class, () -> {
            user.setPassword("invalidpassword1");
        });
        assertFalse(user.getPassword().equals("invalidpassword1"));
    }

    @Test
    public void checkBothDigitsAndUpperCaseRequired() throws InvalidPasswordException {
        User user = new User();

        user.setPassword("ValidPassword12");
        assertTrue(user.getPassword().equals("ValidPassword12"));
    }
}
