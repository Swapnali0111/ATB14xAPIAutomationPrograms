package Ex05_TestNG_AdvanceExample;

import org.testng.annotations.Test;

public class Lab16_TestNG_Priority {
    @Test(priority = 3)
    public void test_t1() {
        System.out.println("1");
    }

    @Test(priority = -1) // -1,-100, -2 == 0
    public void test_t4() {
        System.out.println("Devansh");
    }

    @Test(priority = 1)
    public void test_t2() {
        System.out.println("2");
    }

    @Test(priority = 2)
    public void test_t3() {
        System.out.println("3");
    }

    @Test(priority = 0) // -1,-100, -2 == 0
    public void test_t5() {
        System.out.println("Swapnali");
    }

    // 231
}
