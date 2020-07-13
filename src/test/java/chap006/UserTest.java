package chap006;

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
    public void canConstructUserWithUsernameAndPassword(){
        User user = new User("admin", "test");

        assertEquals("default username expected", "admin", user.getUsername());

        assertEquals("default password expected", "test", user.getPassword());
    }

    @Test
    public void canResetUserPassword(){
        User user = new User();

        user.setPassword("reset");

        assertEquals("setter password expected", "reset", user.getPassword());
    }


}
