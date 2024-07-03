import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class Basic_Webdriver_Method {
    public static String browser="chrome";
    public static WebDriver driver;

    public static void main(String[] args) {
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

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title = driver.getTitle();
        System.out.println(title);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        List<WebElement> webelements=driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
        System.out.println("web element= "+webelements);

        driver.navigate().to("https://www.sugarcrm.com/");
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        String windowhandle = driver.getWindowHandle();
        System.out.println("window handle"+windowhandle);

        driver.findElement(By.xpath("//*[@id=\"slide-6647424b983f6\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        System.out.println("window handles"+windowhandles);
        driver.quit();
    }
}
