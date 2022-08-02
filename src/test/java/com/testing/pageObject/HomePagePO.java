package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    //Element Locators
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAnAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    //Initialise WebElements using Selenium Webdriver
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //Page Specific Method
    public void createAccount(){
        CreateAnAccountLink.click();
    }

    public void signIn(){
        SignInLink.click();
    }


























}
