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

public class WorkingWithWebElements {
    public static String browser="chrome";
    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='field0']/div/input")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id='field0']/div/input")).clear();
        System.out.println(driver.findElement(By.xpath("//*[@id='field0']/div/input")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("text-transform"));
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getSize());
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getText());
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getTagName());
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isSelected());
        driver.close();
    }
}
