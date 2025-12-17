package Ex06_TestValidations_OR_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab25_TestNG_Assertions {
    @Test
    public void test_Hard(){
        System.out.println("start");
        Assert.assertEquals("SWAPNALI","swapnali");
        System.out.println("end");
    }
    @Test
    public void test_Soft(){
        System.out.println("start");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("SWAPNALI","swapnali");
        System.out.println("end");
        softAssert.assertAll();
    }
}
