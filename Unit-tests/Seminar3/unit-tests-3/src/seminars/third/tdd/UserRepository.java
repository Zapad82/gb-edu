package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    private List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user); // добавление юзера
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAllUsersExceptAdmin() {
        for (User user : data) {
            if (!user.isAdmin()) {
                user.logout();
            }
        }
    }


}