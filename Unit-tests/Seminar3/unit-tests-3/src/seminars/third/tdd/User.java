package seminars.third.tdd;

public class User {

    String name;
    String password;
    private boolean isAdmin;
    private boolean isAuthenticated;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isAuthenticated = false;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            this.isAuthenticated = true;
            return true;
        }
        return false;
    }

    public void logout() {
        this.isAuthenticated = false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}