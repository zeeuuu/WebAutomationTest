package TestA.StepDef;

import TestA.BaseTest;
import TestA.Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseTest {

    private LoginPage loginPage;

    @Given("user is on login page") //annotation
    public void userIsOnLoginPage() { //method
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }
    @And("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }
    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }
    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }
    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {
        loginPage.validateErrorAppear(errorMessage);
    }
}
