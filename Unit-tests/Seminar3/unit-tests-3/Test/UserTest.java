import seminars.third.tdd.User;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @org.testng.annotations.Test
    public void testAuthenticate() {
        User user = new User("admin", "password", true);
        assertTrue(user.authenticate("admin", "password"));
    }

    @org.testng.annotations.Test
    public void testAuthenticateWrongName() {
        User user = new User("admin", "password", true);
        assertFalse(user.authenticate("user", "password"));
    }

    @org.testng.annotations.Test
    public void testAuthenticateWrongPassword() {
        User user = new User("admin", "password", true);
        assertFalse(user.authenticate("admin", "wrongpassword"));
    }

    @org.testng.annotations.Test
    public void testLogout() {
        User user = new User("admin", "password", true);
        user.authenticate("admin", "password");
        assertTrue(user.isAuthenticated());

        user.logout();
        assertFalse(user.isAuthenticated());
    }
}
