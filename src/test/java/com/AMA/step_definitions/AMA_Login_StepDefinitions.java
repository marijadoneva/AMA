package com.AMA.step_definitions;


import com.AMA.pages.LoginPage;
import com.AMA.utilities.BrowserUtils;
import com.AMA.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AMA_Login_StepDefinitions {


    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        BrowserUtils.sleep(3);
        loginPage.SignInDropdown.click();
        BrowserUtils.sleep(3);
        loginPage.SignInLink.click();
    }
    @When("user enters username")
    public void user_enters_username() {
       loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters password")
    public void user_enters_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks on Sign in Button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signIn.click();
    }
    @Then("the user should not be able to log in")
    public void the_user_should_not_be_able_to_log_in() {
        Assert.assertTrue(loginPage.errorMsg.isDisplayed());
    }
    @When("the user login with {string},{string}")
    public void the_user_login_with(String username, String password) {
        loginPage.usernameBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
    }
    @When("user leaves username box empty")
    public void user_leaves_username_box_empty() {
        loginPage.usernameBox.sendKeys("");
    }
    @Then("user is able to see message {string}")
    public void user_is_able_to_see_message(String expectedMsg) {
        Assert.assertTrue(loginPage.getErrorMsg(expectedMsg).isDisplayed());
    }
    @Then("{string} user is logged in")
    public void userIsLoggedIn(String expectedUserName) {
        String actualUserName = loginPage.userName.getText();
        Assert.assertEquals(expectedUserName, actualUserName);
    }
}
