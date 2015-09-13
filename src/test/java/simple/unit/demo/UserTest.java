package simple.unit.demo;

import simple.unit.testing.annotations.Ignore;
import simple.unit.testing.annotations.Test;

import static simple.unit.testing.asserts.Assert.assertEquals;
import static simple.unit.testing.asserts.Assert.assertTrue;

public class UserTest {

    @Test
    public void testIfUsernameIsCorrect() {
        User user = new User("username", "pass", true, false);
        assertEquals("Username is not correct", "username", user.getUsername());
    }

    @Test
    public void testIfPasswordIsCorrect() {
        User user = new User("username", "pass", true, false);
        assertEquals("Username is not correct", "23432432", user.getPassword());
    }

    @Test
    @Ignore
    public void testIfUserViewPermissionsCorrect() {
        User user = new User("username", "pass", false, false);
        assertTrue("User view permissions is not correct", user.isHasViewPermissions());
    }
}
