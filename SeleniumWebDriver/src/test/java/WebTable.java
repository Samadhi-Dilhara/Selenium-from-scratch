import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class WebTable {
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

        driver.get("https://www.asx.com.au/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/h5[2]")).click();

        List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr"));
        int rowSize= rows.size();
        System.out.println("No of Rows = "+rowSize);

        List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[1]/th"));
        int columnSize= columns.size();
        System.out.println("No of Rows = "+columnSize);

        for(int i=1;i<=rowSize;i++){
            for (int j=1;j<=columnSize;j++){
                if(i==1){
                    System.out.print(driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr["+i+"]/th["+j+"]")).getText()+" ");
                }
                else{
                    System.out.print(driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr["+i+"]/td["+j+"]")).getText()+" ");
                }
            }
            System.out.println();
        }
    }
}
