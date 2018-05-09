import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainPageTest extends BaseTest {

    MainPageObject page;

    @Before
    public void testSetUp() {
        page = new MainPageObject(driver);
        page.openPage();
    }


    @Test
    public void headerShouldContainInternet() {
        assertEquals("Welcome to the-internet", page.getHeaderTitle());
    }

    @Test
    public void shouldContainAtLeast10Links() {
        List<String> actual = page.getLinkTitles();
        assertTrue(actual.size()>=10);
    }

}
