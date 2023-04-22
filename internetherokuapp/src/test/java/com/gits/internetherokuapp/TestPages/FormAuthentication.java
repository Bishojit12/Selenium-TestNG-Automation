package com.gits.internetherokuapp.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class FormAuthentication extends BasePage{
    public FormAuthentication(WebDriver driver){
        super(driver);
    }
    //Form Authentication Header1
    @FindBy(css = "#content > div > h2")
    public WebElement formAuthenticationHeader1;
    public WebElement getFormAuthenticationHeader1(){
        return formAuthenticationHeader1;
    }
    //Form Authentication Header2
    @FindBy(css = "#content > div > h4")
    public WebElement formAuthenticationHeader2;
    public WebElement getFormAuthenticationHeader2(){
        return formAuthenticationHeader2;
    }
    //UserNameField
    @FindBy(css = "#username")
    public WebElement usernameField;
    public WebElement getUsernameField(){
        return usernameField;
    }
    //PasswordInputField
    @FindBy(css = "#password")
    public WebElement passwordInputField;
    public WebElement getPasswordInputField(){
        return passwordInputField;
    }
    //Login Button
    @FindBy(css = "#login > button > i")
    public WebElement LoginButton;
    public WebElement getLoginButton(){
        return LoginButton;
    }
    //Alert
    @FindBy(css = "#flash")
    public WebElement alert;
    public WebElement getAlert(){
        return alert;
    }
}
