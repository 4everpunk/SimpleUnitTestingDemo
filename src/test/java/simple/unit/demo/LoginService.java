package simple.unit.demo;

public class LoginService {

    public void viewDocument(User user) throws Exception {
        if (!user.isHasViewPermissions()) {
            throw new Exception("User do not have view permissions, user - " + user.getUsername());
        }
    }

    public void updateDocument(User user) throws Exception {
        if (!user.isHasEditPermissions()) {
            throw new Exception("User do not have edit permissions, user - " + user.getUsername());
        }
    }
}
