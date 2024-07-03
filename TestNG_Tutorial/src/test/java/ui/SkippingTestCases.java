package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTestCases {
    Boolean datasetup=true;
    @Test(enabled = false)
    public void skipTest1(){
        System.out.println("Skipping this test as it id not completed");
    }
    @Test
    public void skipTest2(){
        System.out.println("Skipping this test forcefully");
        throw new SkipException("Skipping this test");
    }
    @Test
    public void skipTest3(){
        System.out.println("Skipping this test base on condition");
        if(datasetup==true){
            System.out.println("Execute the Test");
        }
        else {
            System.out.println("Don't execute the Test");
            throw new SkipException("Don't execute further Test");
        }
    }
}
