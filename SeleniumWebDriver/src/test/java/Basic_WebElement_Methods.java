import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_WebElement_Methods {
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

        driver.get("https://practice.expandtesting.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("practice");
        driver.findElement(By.name("username")).clear();
        System.out.println(driver.findElement(By.name("username")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).getCssValue("bs-btn-color"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/button")).isSelected());
    }
}
