package ui;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadiobuttonDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.singaporeair.com/en_UK/lk/home?ds_rl=1012408&gad_source=1&gclid=CjwKCAiArfauBhApEiwAeoB7qBIwBSSpfHbYhUbeBMLEvXs_qXKOv18ddbijQ0PE1M1dbGAVv39YxhoC5QkQAvD_BwE&gclsrc=aw.ds#/book/bookflight");
//        driver.manage().window().maximize();
        Thread.sleep(16000);

        WebElement bookFlight=driver.findElement(By.id("bookFlights"));
//        bookFlight.click();
        System.out.println(bookFlight.isSelected());

        WebElement redeemFlights=driver.findElement(By.id("redeemFlights"));
        redeemFlights.click();
        System.out.println(redeemFlights.isSelected());

    }
}

