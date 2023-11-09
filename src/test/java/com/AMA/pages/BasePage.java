package com.AMA.pages;

import com.AMA.utilities.ConfigurationReader;
import com.AMA.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='ama__sign-in-dropdown']")
    public WebElement SignInDropdown;
    @FindBy(xpath = "//ul[@class='ama__sign-in-dropdown__menu__group']/li/a[@title='Sign In']")
    public WebElement SignInLink;




}
