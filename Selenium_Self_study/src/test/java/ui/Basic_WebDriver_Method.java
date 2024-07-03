package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class Basic_WebDriver_Method {
    public static String browser="chrome";
    public static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title=driver.getTitle();
        System.out.println(title);

        String page_src=driver.getPageSource();
        System.out.println(page_src);

        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();

        List<WebElement> webelements =driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
        System.out.println(webelements);

        driver.navigate().to("https://www.sugarcrm.com/au/?utm_source=sugarcrm.com&utm_medium=referral");
        String windowhandle=driver.getWindowHandle();
        System.out.println(windowhandle);

        driver.findElement(By.xpath("//*[@id=\"slide-65da82b8dc831\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        System.out.println(windowhandles);

        driver.quit();
    }
}
