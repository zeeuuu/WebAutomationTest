package TestA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver driver;

    protected static void getDriver() {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); //eksekusi secara headless dimana browser tidak tampil
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

//        WebDriverManager.chromedriver().create();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
    }
}
