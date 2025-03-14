package TestA.StepDef;

import TestA.BaseTest;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BaseTest {
    @Before
    public void beforeTest() {
        getDriver();
        System.out.println("BeforeTest dijalankan");
    }
    @After
    public void afterTest() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        System.out.println("AfterTest dijalankan");
    }
}