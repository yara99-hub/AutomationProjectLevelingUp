package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FirstTaskTest {

    WebDriver driver = new ChromeDriver();
    @Test
    public void test(){
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}

