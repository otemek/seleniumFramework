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


    @Test
    public void afterLoginShouldHaveSuccessMessage() {
        loginPage.login("tomsmith","SuperSecretPassword!");
        assertTrue(loginPage.getFlashMessage().contains("You logged into a secure area!"));
    }

    @Test
    public void afterLoginShouldHaveErrorPasswordMessage() {
        loginPage.login("tomsmith","WrongPassword");
        assertTrue(loginPage.getFlashMessage().contains("Your password is invalid!"));
    }

    @Test
    public void afterLoginShoudlHaveErrorLoginMessage() {
        loginPage.login("nonexistuser","SuperSecretPassword!");
        assertTrue(loginPage.getFlashMessage().contains("Your username is invalid!"));
    }

}