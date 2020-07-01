/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pages;

import com.itexps.util.BaseClass;
import static com.itexps.util.BaseClass.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Uma
 */
public class CheckOutPage extends BaseClass {
    
    //Page Factory
    @FindBy(xpath = "//li/div/h3")
    private WebElement pickup;
    
    @FindBy(name="ccNumber")
    private WebElement ccNumber;
    
    @FindBy(name="ccExpiry")
    private WebElement ccExpiry;
    
    @FindBy(name="ccCvc")
    private WebElement ccCvc;
    
    @FindBy(name="phoneUS")
    private WebElement phoneUS;
    
    @FindBy(linkText="Place Order")
    private WebElement placeorder;

    @FindBy(css = "#checkout-error")
    private WebElement error;
    
    //Intializing the Page Object:
    public CheckOutPage(){PageFactory.initElements(driver,this);
        }
    
    //Actions
    
        public boolean verifyCheckout() {
        return ccNumber.isDisplayed();
        }
        
        public boolean verifyCheckoutError() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#checkout-error")));
        return error.isDisplayed();
        }
        
        public void ClickPickup() {
            
            pickup.click();
        }
    
        public LogoutPage CheckOutPage(String cc, String exp, String cv, String phone) {
        
        ccNumber.sendKeys(cc);
        ccExpiry.sendKeys(exp);
        ccCvc.sendKeys(cv);
        phoneUS.sendKeys(phone);
        placeorder.click();
        System.out.println("Order Placed");
        return new LogoutPage();
        
        
        
    }
    
}
