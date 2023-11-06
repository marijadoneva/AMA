package com.AMA.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage {



    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameBox;
//
//
//    @FindBy(xpath = "//div[@class='form-container']")
//    public WebElement iFrame;
//
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    public WebElement passwordBox;
//
//    @FindBy(xpath = "//button[@data-test='submit']")
//    public WebElement loginBtn;
//
//
//
//    @FindBy(xpath = "//button[@class='btn btn-secondary']")
//    public WebElement signIn;


//    public void login(){
//        this.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
//        this.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
//        this.loginBtn.click();
//    }

}
