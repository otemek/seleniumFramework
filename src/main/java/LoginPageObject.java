import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends BasePageObject {

    @FindBy(id = "username")
    WebElement userNameElement;

    @FindBy(id = "password")
    WebElement passwordElement;

    @FindBy(className = "button")
    WebElement loginButton;


    LoginPageObject(WebDriver driver) {
        super(driver);
        relativeUrl = "login";
    }

}
