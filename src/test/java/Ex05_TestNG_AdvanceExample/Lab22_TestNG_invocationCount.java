package Ex05_TestNG_AdvanceExample;

import org.testng.annotations.Test;

public class Lab22_TestNG_invocationCount {
    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye");
    }
}
