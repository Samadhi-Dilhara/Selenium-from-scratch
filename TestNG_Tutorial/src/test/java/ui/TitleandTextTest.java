package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleandTextTest {

    @Test
    public void VerifyTitle(){
        SoftAssert softassert=new SoftAssert();
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");

        System.out.println("Verifying Title");
        String ExpectedTitle="Eectronics, Cars, Fashion, Collectibles & More | eBay";
        String ActualTitle=driver.getTitle();
        softassert.assertEquals(ActualTitle,ExpectedTitle);

        System.out.println("Verifying Text");
        String ExpectedText="Search";
        String ActualText=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        softassert.assertEquals(ActualText,ExpectedText,"Text Verification Failed");
        softassert.assertAll();
    }
}
