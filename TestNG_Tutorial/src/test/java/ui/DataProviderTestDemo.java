package ui;

import org.testng.annotations.Test;

public class DataProviderTestDemo {

    @Test(dataProvider = "Create",dataProviderClass = DataProviderDemo.class)
    public void test(String username,String password){
        System.out.println(username+"===="+password);
    }

    @Test(dataProvider = "Create",dataProviderClass = DataProviderDemo.class)
    public void test1(String username,String password,String testing){
        System.out.println(username+"===="+password+"===="+testing);
    }
}
