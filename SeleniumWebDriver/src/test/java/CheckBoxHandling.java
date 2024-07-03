import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.Set;

public class CheckBoxHandling {
    public static String browser="chrome";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.salesforce.com/ap/form/signup/freetrial-sales/?d=topnav2-btn-ft");

        Thread.sleep(2000);

        WebElement scrolldown=driver.findElement(By.linkText("All rights reserved"));
        Actions actions=new Actions(driver);
        actions.moveToElement(scrolldown);
        actions.perform();

        Thread.sleep(2000);

        driver.findElement(By.id("SubscriptionAgreement")).click();

        driver.quit();

    }
}
