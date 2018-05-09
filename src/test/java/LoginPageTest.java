import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginPageTest extends BaseTest {

    LoginPageObject loginPage;

    @Before
    public void testSetUp() {
        loginPage = new LoginPageObject(driver);
        loginPage.openPage();
    }

    String loginAndReadMessage(String username, String password) {
        return loginPage.login(username, password).getFlashMessage();
    }

    @Test
    public void afterLoginShouldHaveSuccessMessage() {
        String actual = loginAndReadMessage("tomsmith", "SuperSecretPassword!");
        assertTrue(actual.contains("You logged into a secure area!"));
    }

    @Test
    public void afterLoginShouldHaveErrorPasswordMessage() {
        String actual = loginAndReadMessage("tomsmith", "WrongPassword");
        assertTrue(actual.contains("Your password is invalid!"));
    }

    @Test
    public void afterLoginShoudlHaveErrorLoginMessage() {
        String actual = loginAndReadMessage("nonexistuser", "SuperSecretPassword!");
        assertTrue(actual.contains("Your username is invalid!"));
    }

}