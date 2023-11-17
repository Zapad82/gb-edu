import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRepositoryTest {
    @org.testng.annotations.Test
    public void testLogoutAllUsersExceptAdmin() {
        UserRepository userRepository = new UserRepository();
        User admin = new User("admin", "password", true);
        User user1 = new User("user1", "password", false);
        User user2 = new User("user2", "password", false);

        userRepository.addUser(admin);
        userRepository.addUser(user1);
        userRepository.addUser(user2);

        admin.authenticate("admin", "password");
        user1.authenticate("user1", "password");
        user2.authenticate("user2", "password");

        assertTrue(admin.isAuthenticated());
        assertTrue(user1.isAuthenticated());
        assertTrue(user2.isAuthenticated());

        userRepository.logoutAllUsersExceptAdmin();

        assertTrue(admin.isAuthenticated());
        assertFalse(user1.isAuthenticated());
        assertFalse(user2.isAuthenticated());
    }
}
