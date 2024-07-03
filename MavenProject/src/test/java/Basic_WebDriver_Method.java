import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

        String page=driver.getPageSource();
        System.out.println(page);

        driver.navigate().to("https://www.google.co.uk/");

        driver.close();
    }
}
