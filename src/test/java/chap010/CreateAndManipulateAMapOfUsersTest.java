package chap010;

import domainentities.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.*;

public class CreateAndManipulateAMapOfUsersTest {
    private Map<String, User> map = new HashMap<>();
    private User user1, user2;

    @Test
    public void canInitiateMapOfUsers() {
        assertEquals("Map of users has a size of 0", 0, map.size());
        assertTrue("Map of users is empty", map.isEmpty());
    }

    @Test
    public void canInitializeTwoUsers() {
        user1 = new User("testName1", "testPass1");
        user2 = new User("testName2", "testPass2");

        assertEquals("user1 has a username of 'testName1'", "testName1", user1.getUsername());
        assertEquals("user2 has a username of 'testName2'", "testName2", user2.getUsername());
    }

    @Test
    public void canAddOnlyOneUserWithTheSameKey() {
        user1 = new User("testName1", "testPass1");
        user2 = new User("testName2", "testPass2");

        map.put("key1", user1);
        map.put("key1", user2);

        assertFalse("Map of users contains user1", map.containsValue(user1));
        assertTrue("Map of users contains user2", map.containsValue(user2));
        assertEquals("map only has 1 user object", 1, map.size());
        assertEquals("The object stored is 'user2'", user2, map.get("key1"));
    }
}
