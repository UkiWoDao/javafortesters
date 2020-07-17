package chap010;

import domainentities.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.TestCase.*;

public class CreateAndManipulateACollectionOfUsersTest {
    @Test
    public void canCreateAndManipulateACollectionOfUsers() {
        // create empty collection of Users
        Collection<User> arrayListOfUsers = new ArrayList<>();

        assertEquals("arrayListOfUsers has a size of 0", 0, arrayListOfUsers.size());
        assertTrue(arrayListOfUsers.isEmpty());

        // create 2 Users
        User user1 = new User("testUsername1", "testPassword1");
        User user2 = new User("testUsername2", "testPassword2");
        assertEquals("user1 is created with username 'testUsername1'", "testUsername1", user1.getUsername());
        assertEquals("user2 is created with username 'testUsername2'", "testUsername2", user2.getUsername());

        // add those 2 users to the empty collection
        arrayListOfUsers.add(user1);
        arrayListOfUsers.add(user2);

        assertEquals("arrayListOfUsers has a size o 2", 2, arrayListOfUsers.size());
        assertFalse("arrayListOfUsers2 is empty", arrayListOfUsers.isEmpty());

        // create a second collection with two different users
        Collection<User> arrayListOfUsers2 = new ArrayList<User>();

        assertEquals("arrayListOfUsers2 has a size of 0", 0, arrayListOfUsers2.size());
        assertTrue("arrayListOfUsers2 is empty", arrayListOfUsers2.isEmpty());

        User user3 = new User("testUsername3", "testPassword3");
        User user4 = new User("testUsername4", "testPassword4");

        assertEquals("user3 is created with username 'testUsername3'", "testUsername3", user3.getUsername());
        assertEquals("user4 is created with username 'testUsername4'", "testUsername4", user4.getUsername());

        arrayListOfUsers2.add(user3);
        arrayListOfUsers2.add(user4);

        // addAll the second collection to the first collection
        arrayListOfUsers.addAll(arrayListOfUsers2);

        assertTrue("arrayListOfUsers contains all the elements from arrayListOfUsers2", arrayListOfUsers.containsAll(arrayListOfUsers2));

        // removeAll the Users from the second collection
        arrayListOfUsers2.removeAll(arrayListOfUsers2);
        assertEquals("arrayListOfUsers2 has a size of 0", 0, arrayListOfUsers2.size());
        assertTrue("arrayListOfUsers2 is empty", arrayListOfUsers2.isEmpty());

        // clear the first collection
        arrayListOfUsers.clear();
        assertEquals("arrayListOfUsers has a size of 0", 0, arrayListOfUsers.size());
        assertTrue("arrayListOfUsers is empty", arrayListOfUsers.isEmpty());
    }



}
