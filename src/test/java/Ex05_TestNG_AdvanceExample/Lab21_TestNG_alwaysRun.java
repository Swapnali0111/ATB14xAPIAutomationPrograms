package Ex05_TestNG_AdvanceExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab21_TestNG_alwaysRun {
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }

}
