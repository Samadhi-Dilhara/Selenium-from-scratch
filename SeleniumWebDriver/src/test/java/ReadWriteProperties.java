import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream inputStream=new FileInputStream("C:\\Users\\ASUS\\Desktop\\Selenium Tutorial\\SeleniumWebDriver\\src\\test\\resources\\testdata.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));

        FileOutputStream outputStream=new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Selenium Tutorial\\SeleniumWebDriver\\src\\test\\resources\\testdata.properties");
        properties.setProperty("testdate","5/23/2024");
        properties.store(outputStream,"New data will be added");
    }
}
