package chap009;

import Exceptions.InvalidPasswordException;
import domainentities.User;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;

import java.lang.reflect.Array;

public class UserArrayTest {
    @Test
    public void canCreateAnArrayOfUsers() throws InvalidPasswordException {
        // initialize empty array of required size
        User[] arrayOfUsers = new User[100];

        for(int i = 0; i < 100; i++) {
            // initialize suffix variable
            int j = i + 1;
            // initialize new user
            User user = new User("user" + j, "password" + j);
            // store user to array
            arrayOfUsers[i] = user;
        }

        // assertEquals("The size of the array is 100", arrayOfUsers.length, 100);
        assertEquals("The password of the User with index 5 is 'password6'", arrayOfUsers[5].getPassword(), "password6");
    }
}
