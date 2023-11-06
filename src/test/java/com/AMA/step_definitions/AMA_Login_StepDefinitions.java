package com.AMA.step_definitions;

import com.AMA.pages.BasePage;
import com.AMA.pages.LoginPage;
import com.AMA.utilities.BrowserUtils;
import com.AMA.utilities.ConfigurationReader;
import com.AMA.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AMA_Login_StepDefinitions {


    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        BrowserUtils.waitForVisibility(basePage.SignInDropdown, 2);
        basePage.SignInDropdown.click();
        BrowserUtils.waitForVisibility(basePage.SignInLink, 2);
        basePage.SignInLink.click();


    }
    @When("user enters username")
    public void user_enters_username() {

        //loginPage.signIn.click();
       //Driver.getDriver().switchTo().frame(loginPage.iFrame);
//       loginPage.usernameBox.click();
       loginPage.usernameBox.sendKeys("Marija");

    }
    @When("user enters password")
    public void user_enters_password() {
        //loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }



    @Given("user is on a {string} navigation menu window")
    public void user_is_on_a_navigation_menu_window(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
//    @When("user clicks on logo icon")
//    public void user_clicks_on_logo_icon() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user is not directed to {string} page")
//    public void user_is_not_directed_to_page(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


}
