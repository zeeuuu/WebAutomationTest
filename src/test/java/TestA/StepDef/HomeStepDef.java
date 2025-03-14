package TestA.StepDef;

import TestA.Page.HomePage;
import io.cucumber.java.en.Then;
import TestA.BaseTest;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
