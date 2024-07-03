package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest {

    @Test
    public void VerifyTitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String ExpectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String ActualTitle=driver.getTitle();

        Assert.assertEquals(ActualTitle,ExpectedTitle);
    }
}
