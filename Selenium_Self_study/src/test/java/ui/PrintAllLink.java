package ui;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PrintAllLink {
    public static String browser = "chrome";
    public static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();

        List<WebElement> allTags=driver.findElements(By.tagName("a"));
        System.out.println("Total tags are: "+allTags.size());

        for(int i=0;i<allTags.size();i++){
            System.out.println("Links on page are "+allTags.get(i).getAttribute("href"));
            System.out.println("Links on page are "+allTags.get(i).getText());
        }
    }
}

