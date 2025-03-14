package TestA.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {
    By productTitle = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        System.out.println("productElement: " + productElement.getText());
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
}
