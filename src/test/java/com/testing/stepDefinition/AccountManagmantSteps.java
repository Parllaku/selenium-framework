package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.LoginPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagmantSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create account page")
    public void iAmOnCreateAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.createAccount();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String firstname, String lastname, String email, String password, String confirmpassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(firstname);
        createAccountPagePO.enterLastName(lastname);
        createAccountPagePO.enterEmail(email);
        createAccountPagePO.enterPassword(password);
        createAccountPagePO.enterConfirmPassword(confirmpassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO.CreateAccountButton.click();
    }

    @Then("My account Page is displayed")
    public void myAccountPageIsDisplayed() {

    }

    @Then("error should pop up saying you already have account")
    public void errorShouldPopUpSayingYouAlreadyHaveAccount() {

    }


    @Then("Error message saying no account found")
    public void logInPageIsDisplayed(){

    }


    @Given("I am on Login page")
    public void iAmOnLoginPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.signIn();

    }

    @When("I enter {string} {string}")
    public void iEnter(String email, String password) {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterEmail(email);
        loginPagePO.enterPassword(password);


    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.signInButton();
    }

    @Then("error should pop up saying you dont have ann account with us")
    public void errorShouldPopUpSayingYouDontHaveAnnAccountWithUs() {
    }
}
