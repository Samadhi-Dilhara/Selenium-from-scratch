import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowsHandlingWithIteration {
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

        driver.get("https://www.salesforce.com/ap/?ir=1");
        driver.findElement(By.xpath("//*[@id=\"1707962206997_xa6\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
        Thread.sleep(4000);
        Set<String> windowHandles=driver.getWindowHandles();
        System.out.println(windowHandles);

        Iterator<String> iterator=windowHandles.iterator();
        String parentWindow=iterator.next();
        System.out.println(parentWindow);
        String childWindow=iterator.next();
        System.out.println(childWindow);

        driver.switchTo().window(childWindow);

        driver.findElement(By.name("UserFirstName")).sendKeys("Samadhi");
        driver.findElement(By.name("UserLastName")).sendKeys("Dilhara");

        Thread.sleep(4000);
        driver.switchTo().window(parentWindow);
    }
}
