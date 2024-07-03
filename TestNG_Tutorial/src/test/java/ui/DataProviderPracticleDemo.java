package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPracticleDemo {
    @DataProvider(name="Create")
    public Object[][] provider(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"},
                {"error_user","secret_sauce"},
                {"visual_user","secret_sauce"}
        };
    }

    @Test(dataProvider = "Create")
    public void test(String username,String password){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}
