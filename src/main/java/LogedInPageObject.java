import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogedInPageObject extends BasePageObject {

    @FindBy(id = "flash")
    WebElement flashMessage;

    LogedInPageObject(WebDriver driver) {
        super(driver);
        relativeUrl = "secure";
    }

    public String getFlashMessage() {
        return flashMessage.getText();
    }

}
