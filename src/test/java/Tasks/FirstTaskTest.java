package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTaskTest {

    private WebDriver driver;

    /**
     * Open Google Chrome
     * Navigate to [<a href="https://duckduckgo.com/">duckduckgo</a>]
     * Assert that the page title is [Google]
     * Close Google Chrome
     */

    @Test
    public void test(){
        driver.get("https://duckduckgo.com/");
        String title = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(title, expectedTitle, "Title is not as expected");
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

