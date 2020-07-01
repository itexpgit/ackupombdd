/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pages;

import com.itexps.util.BaseClass;
import static com.itexps.util.BaseClass.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Uma
 */
public class LoginPage extends BaseClass {
    
    //Page Factory
    @FindBy(name="email")
    private WebElement emailid;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement submitBtn;

    
    
    
    //Intializing the Page Object:
    public LoginPage(){PageFactory.initElements(driver,this);
        }
    
    //Actions
    public String validateLoginPageTitle() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        return driver.getTitle();
    }
    
    public LocationPage login(String em, String pwd) {
        emailid.sendKeys(em);
        password.sendKeys(pwd);
        submitBtn.click();
        System.out.println("Login Completed");
        return new LocationPage();
        
    }
    
    
}
