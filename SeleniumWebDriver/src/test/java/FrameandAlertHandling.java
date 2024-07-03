import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class FrameandAlertHandling {
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

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("/html/body/button")).click();

        driver.switchTo().alert().sendKeys("RCV Acedamy");
        driver.switchTo().alert().accept();

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }
}
