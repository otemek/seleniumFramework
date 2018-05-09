import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HoversPageTest extends BaseTest {

    HoversPageObject hoverPage;

    @Before
    public void testSetUp() {
        hoverPage = new HoversPageObject(driver);
        hoverPage.openPage();
    }

    @Test
    public void afterHoverShouldDisplayCaption() {
        int index = 1;
        hoverPage.hoverMouseOverAvatar(index);
        assertTrue(hoverPage.isCaptionDisplayed(index));
    }
}
