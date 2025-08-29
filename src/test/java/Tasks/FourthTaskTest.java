package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FourthTaskTest {
    WebDriver driver;

    /**
     * Open Mozilla Firefox
     * Navigate to [<a href="https://duckduckgo.com/">duckduckgo</a>]
     * Search for [TestNG]
     * Assert that the text of the fourth result is [TestNG Tutorial]
     * Close Mozilla Firefox
     */

    @Test
    public void testSearchTitle(){
        driver.get("https://duckduckgo.com/?q=TestNg&t=h_&ia=web");
        By fourthResult = By.xpath("(//div[@class='ikg2IXiCD14iVX7AdZo1']//span)[4]");
        String actualTitle = driver.findElement(fourthResult).getText();
        String expectedTitle = "TestNG Tutorial";
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Fourth result title is not as expected");
    }

    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
