package ui;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderDemo {
    @DataProvider(name="Create")
    public Object[][] dataset1(Method m){
        Object[][] testdata=null;
        if(m.getName().equals("test")) {
            testdata=new Object[][]{
                    {"Username", "Password"},
                    {"User1", "pass1"},
                    {"User2", "pass2"},
                    {"User4", "pass4"}
            };
        } else if (m.getName().equals("test1")) {
            testdata=new Object[][]{
                    {"Username", "Password", "test"},
                    {"User1", "pass1", "test"},
                    {"User2", "pass2", "test"},
                    {"User3", "pass3", "test"},
                    {"User4", "pass4", "test"}
            };
        }return testdata;
    }

//    @DataProvider
//    public Object[][] dataset(){
//        Object[][] dataset=new Object[4][2];
//
//        //first row
//        dataset[0][0]="User1";
//        dataset[0][1]="Pass1";
//
//        //second row
//        dataset[1][0]="User2";
//        dataset[1][1]="Pass2";
//
//        //third row
//        dataset[2][0]="User3";
//        dataset[2][1]="Pass3";
//
//        //forth row
//        dataset[3][0]="User4";
//        dataset[3][1]="Pass4";
//
//        return dataset;
//    }
}