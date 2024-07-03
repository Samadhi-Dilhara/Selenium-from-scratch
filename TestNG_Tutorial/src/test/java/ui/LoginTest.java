package ui;

import org.testng.annotations.*;

public class LoginTest {
    @BeforeTest
    public void LoginToApplication(){
        System.out.println("Login to application");
    }
    @AfterTest
    public void LogOutFromApplication(){
        System.out.println("Logout from Application");
    }
    @Test(priority = 1,description = "This is the login Test")
    public void LoginTest(){
        System.out.println("Login is Successfull");
    }

    @Test(priority = 2)
    public void LogOutTest(){
        System.out.println("LogOut is Successfull");
    }
    @BeforeMethod
    public void connectToDB(){
        System.out.println("DB Connected");
    }
    @AfterMethod
    public void disconnectedFromDB(){
        System.out.println("DB Disconnected");
    }
}
