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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Uma
 */
public class ProductsPage extends BaseClass {
    
    //Page Factory
    @FindBy(xpath = ".//*[@id='all-categories']/ul/li[6]/a")
    private WebElement noodlessection;
    
    @FindBy(xpath = ".//*[@src='https://s3-us-west-2.amazonaws.com/www.gethomesome.com/productimages/ibg-noodles-hakka-mod.jpg']")
    private WebElement hakkanoodles;
        
    @FindBy(id="update-btn")
    private WebElement tocart;
    
    //Intializing the Page Object:
    public ProductsPage(){PageFactory.initElements(driver,this);
        }
    
         //Actions
    public boolean verifyCorrectProduct() {
    return noodlessection.isDisplayed();
  
    }
    
    
     
      public CartPage ProductsPage() {
        noodlessection.click();
        hakkanoodles.click();
        tocart.click();
        System.out.println("Item added to Cart");
        return new CartPage();
        
    }
    
}
