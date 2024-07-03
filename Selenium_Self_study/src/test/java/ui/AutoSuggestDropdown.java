package ui;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        driver.findElement(By.xpath("//span[text()='From']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("sydney");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}

