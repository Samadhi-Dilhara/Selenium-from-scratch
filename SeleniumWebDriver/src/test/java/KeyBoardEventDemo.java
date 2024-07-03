import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventDemo {
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

        driver.get("https://extendsclass.com/text-compare.html");
        WebElement SourceTextArea=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[4]/pre/span"));
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.keyDown(SourceTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

        WebElement DestinationTextArea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
        Thread.sleep(2000);
        actions.keyDown(DestinationTextArea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
    }
}
