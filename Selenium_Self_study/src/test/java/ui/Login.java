package ui;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
//    public static String browser = "chrome";
    public static WebDriver driver;

    @Parameters({"browser"})
    @Test
    public void launchApplication(String browser) {
        if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret_sauce"});
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
    }
}

