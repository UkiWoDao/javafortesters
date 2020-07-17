package chap010;

import domainentities.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.TestCase.*;

public class CreateAndManipulateACollectionOfUsersTest {
    private Collection<User> arrayListOfUsers = new ArrayList<>();
    private Collection<User>arrayListOfUsers2 = new ArrayList<>();
    private User user1, user2, user3, user4;

    @Test
    public void canVerifyCollectionOfUsersIsInitialized() {
        assertEquals("arrayListOfUsers has a size of 0", 0, arrayListOfUsers.size());
        assertTrue(arrayListOfUsers.isEmpty());
    }

    @Test
    public void canInitializeTwoUsers() {
        user1 = new User("testUsername1", "testPassword1");
        user2 = new User("testUsername2", "testPassword2");
        assertEquals("user1 is created with username 'testUsername1'", "testUsername1", user1.getUsername());
        assertEquals("user2 is created with username 'testUsername2'", "testUsername2", user2.getUsername());
    }

    @Test
    public void canAddTwoUsersToFirstCollection() {
        user1 = new User("testUsername1", "testPassword1");
        user2 = new User("testUsername2", "testPassword2");

        arrayListOfUsers.add(user1);
        arrayListOfUsers.add(user2);

        assertEquals("arrayListOfUsers has a size of 2", 2, arrayListOfUsers.size());
        assertFalse("arrayListOfUsers2 is empty", arrayListOfUsers.isEmpty());
    }

    @Test
    public void canVerifyAnotherCollectionOfUsersIsInitialized() {
        assertEquals("arrayListOfUsers2 has a size of 0", 0, arrayListOfUsers2.size());
        assertTrue("arrayListOfUsers2 is empty", arrayListOfUsers2.isEmpty());
    }

    @Test
    public void canInitializeAnotherTwoUsers() {
        user3 = new User("testUsername3", "testPassword3");
        user4 = new User("testUsername4", "testPassword4");

        assertEquals("user3 is created with username 'testUsername3'", "testUsername3", user3.getUsername());
        assertEquals("user4 is created with username 'testUsername4'", "testUsername4", user4.getUsername());
    }

    @Test
    public void canAddTwoUsersToSecondCollection() {
        arrayListOfUsers2.add(user3);
        arrayListOfUsers2.add(user4);

        assertEquals("arrayListOfUsers2 has a size of 2", 2, arrayListOfUsers2.size());
        assertFalse("arrayListOfUsers2 is not empty", arrayListOfUsers2.isEmpty());
    }

    @Test
    public void canAddSecondCollectionToTheFirstOne() {
        arrayListOfUsers.addAll(arrayListOfUsers2);

        assertTrue("arrayListOfUsers contains all the elements from arrayListOfUsers2", arrayListOfUsers.containsAll(arrayListOfUsers2));
    }

    @Test
    public void canRemoveAllUsersFromSecondCollection() {
        arrayListOfUsers2.removeAll(arrayListOfUsers2);

        assertEquals("arrayListOfUsers2 has a size of 0", 0, arrayListOfUsers2.size());
        assertTrue("arrayListOfUsers2 is empty", arrayListOfUsers2.isEmpty());
    }

    @Test
    public void canClearTheFirstCollection() {
        arrayListOfUsers.clear();

        assertEquals("arrayListOfUsers has a size of 0", 0, arrayListOfUsers.size());
        assertTrue("arrayListOfUsers is empty", arrayListOfUsers.isEmpty());
    }

}
