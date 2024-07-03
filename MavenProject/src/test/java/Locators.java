import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Locators {
    public static String browser="chrome";
    public static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriverManager.chromedriver().clearResolutionCache();
            driver=new ChromeDriver();
        }
        driver.get("https://www.saucedemo.com");

        WebElement password =driver.findElement(By.id("password"));
        By UserNameLocator=RelativeLocator.with(By.tagName("input")).above(password);
        driver.findElement(UserNameLocator).sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
//        driver.close();
    }
}
