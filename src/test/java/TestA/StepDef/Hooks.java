package TestA.StepDef;

import TestA.BaseTest;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BaseTest {
    @BeforeAll
    public static void beforeTest() {
        getDriver();
        System.out.println("BeforeTest dijalankan");
    }

    @AfterAll
    public static void afterTest() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        System.out.println("AfterTest dijalankan");
    }
}