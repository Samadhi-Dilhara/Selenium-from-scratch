import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
