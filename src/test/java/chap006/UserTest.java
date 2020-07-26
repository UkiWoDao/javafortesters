package chap006;

import Exceptions.InvalidPasswordException;
import domainentities.User;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;

public class UserTest {
    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructUserWithUsernameAndPassword() throws InvalidPasswordException {
        User user = new User("admin", "test");

        assertEquals("default username expected", "admin", user.getUsername());
        assertEquals("default password expected", "test", user.getPassword());
    }

    @Test
    public void canResetUserPassword() throws InvalidPasswordException{
        User user = new User();
        user.setPassword("123456");

        assertEquals("setter password expected", "123456", user.getPassword());
    }


}
