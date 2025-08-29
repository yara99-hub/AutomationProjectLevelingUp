package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTaskTest {

    private WebDriver driver;

    /**
     * Open Google Chrome
     * Navigate to [<a href="https://duckduckgo.com/">...</a>]
     * Assert that the DuckDuckGo logo is displayed
     * Close Google Chrome
     */

    @Test
    public void testLogo(){
        driver.get("https://duckduckgo.com/");
        By logo = By.xpath("//div[contains(@class,'Desktop')]//img");
        boolean isLogoDisplayed = driver.findElement(logo).isDisplayed();
        Assert.assertTrue(isLogoDisplayed, "Logo is not displayed");
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
