package simple.unit.demo;

public class User {
    private String username;
    private String password;
    private boolean hasViewPermissions;
    private boolean hasEditPermissions;

    public User(String username, String password, boolean hasViewPermissions, boolean hasEditPermissions) {
        this.username = username;
        this.password = password;
        this.hasViewPermissions = hasViewPermissions;
        this.hasEditPermissions = hasEditPermissions;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isHasViewPermissions() {
        return hasViewPermissions;
    }

    public boolean isHasEditPermissions() {
        return hasEditPermissions;
    }
}
