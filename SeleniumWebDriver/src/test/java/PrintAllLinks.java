import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class PrintAllLinks {
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

        driver.get("https://www.salesforce.com/ap/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        List<WebElement> alllinks=driver.findElements(By.tagName("a"));
        System.out.println("Total Tags are "+alllinks);

        System.out.println("All links thi web page have are ");
        for (int i=0;i< alllinks.size();i++){
            System.out.println(alllinks.get(i).getAttribute("href"));
            System.out.println(alllinks.get(i).getText());
        }
        driver.quit();
    }
}
