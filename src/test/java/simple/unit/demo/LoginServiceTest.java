package simple.unit.demo;

import simple.unit.testing.annotations.AfterEach;
import simple.unit.testing.annotations.BeforeEach;
import simple.unit.testing.annotations.Test;

public class LoginServiceTest {
    LoginService loginService;

    @BeforeEach
    public void beforeEach() {
        loginService = new LoginService();
    }

    @AfterEach
    public void afterEach() {
        loginService = null;
    }

    @Test
    public void testThatUserHasViewDocumentPermissions() throws Exception {
        loginService.viewDocument(new User("user1", "", true, false));
    }

    @Test
    public void testThatUserHasNotViewDocumentPermissions() throws Exception {
        loginService.viewDocument(new User("user1", "", false, false));
    }

    @Test
    public void testThatUserHasEditDocumentPermissions() throws Exception {
        loginService.viewDocument(new User("user1", "", true, true));
    }

    @Test
    public void testThatUserHasNotEditDocumentPermissions() throws Exception {
        loginService.viewDocument(new User("user1", "", false, false));
    }
}
