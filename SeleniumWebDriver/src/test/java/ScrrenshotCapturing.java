import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ScrrenshotCapturing {
    public static String browser="chrome";
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
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

        Date currentDate=new Date();
        String screenShotName=currentDate.toString().replace(" ","-").replace(":","-");

        File ScreenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenshotFile,new File(".//screenshot//"+screenShotName+".png"));

    }
}
