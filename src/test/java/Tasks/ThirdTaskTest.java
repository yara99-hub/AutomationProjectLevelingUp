package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThirdTaskTest {
    WebDriver driver;

    /**
     * Open Google Chrome.
     * Navigate to [<a href="https://duckduckgo.com/">duckduckgo</a>].
     * Search for [Selenium WebDriver].
     * Assert that the link of the first result is [<a href="https://www.selenium.dev/documentation/webdriver/">SeleniumWebdriverDoc</a>].
     * Close Google Chrome.
     */

    @Test
    public void testSearch(){
        driver.get("https://duckduckgo.com/?t=h_&q=selenium+webdriver&ia=web");
        By firstResultLink = By.xpath("(//div[@class='ikg2IXiCD14iVX7AdZo1']//a)[1]");
        String actualLink = driver.findElement(firstResultLink).getAttribute("href");
        String expectedLink = "https://www.selenium.dev/documentation/webdriver/";
        Assert.assertEquals(actualLink, expectedLink, "First result link is not as expected");

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
