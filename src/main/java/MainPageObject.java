import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.ArrayList;
import java.util.List;

public class MainPageObject extends BasePageObject {

    @FindBy(tagName = "h1")
    WebElement headerTitleElement;

    @FindBy(css = "li a")
    List<WebElement> linkElements;

    //konstruktor dziedziczaczy z BasePageObject
    MainPageObject(WebDriver driver) {
        super(driver);
    }


    public String getHeaderTitle() {
        return headerTitleElement.getText();
    }

    public List<String> getLinkTitles() {
        List<String> result = new ArrayList<String>();
        for (WebElement item : linkElements) {
            result.add(item.getText());
        }
        return result;
    }


}
