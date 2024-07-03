package ui;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class CheckboxDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sugarcrm.com/au/request-demo/");
//        driver.manage().window().maximize();
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();

        WebElement scrolldown=driver.findElement(By.xpath("//a[@href='https://www.sugarcrm.com/au/solutions/sugar-sell/' and text()='Learn More']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrolldown);
        actions.perform();
        Thread.sleep(16000);

        WebElement scrollup= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[2]/div/div/div[1]/div/h2"));
        actions.moveToElement(scrollup);
        actions.perform();
        Thread.sleep(16000);

        driver.findElement(By.id("doi0")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("doi0")).click();
        Thread.sleep(4000);

    }
}

