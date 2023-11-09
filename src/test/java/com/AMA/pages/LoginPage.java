package com.AMA.pages;


import com.AMA.utilities.BrowserUtils;
import com.AMA.utilities.ConfigurationReader;
import com.AMA.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    /**
     * Method takes string as parameter and returns a webelement.
     *
     * @param Msg
     * @return
     */
    public WebElement getErrorMsg(String Msg) {
        BrowserUtils.waitForPageToLoad(5);
        return Driver.getDriver().findElement(By.xpath("//mat-error[.=' " + Msg + " ']"));
    }

    @FindBy(xpath = "//a[@title='marijadoneva ']/span")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordBox;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-submit']")
    public WebElement signIn;

    @FindBy(xpath = "//mat-error[starts-with(@id, 'mat-error-')]")
    public WebElement errorMsg;


    public void login() {
        this.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        this.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        this.signIn.click();
    }

    public void login(String username, String password) {
        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.signIn.click();
    }

}
