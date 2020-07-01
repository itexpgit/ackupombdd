/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pages;

import com.itexps.util.BaseClass;
import static com.itexps.util.BaseClass.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Uma
 */
public class CartPage extends BaseClass {
    
    //Page Factory
    @FindBy(linkText ="Checkout")
    private WebElement checkout;
    
    //Intializing the Page Object:
    public CartPage(){PageFactory.initElements(driver,this);
        }
    
    //Actions
    public boolean verifyCheckoutbutton() {
        return checkout.isDisplayed();
    }
    
        public void ClickCart() {
        driver.get(prop.getProperty("url2"));
        
        
               
    }
        public CheckOutPage  ClickCheckout() {
        
        checkout.click();
        System.out.println("Check Out Started");
        return new CheckOutPage();
               
    }
    
    
   
    
}
