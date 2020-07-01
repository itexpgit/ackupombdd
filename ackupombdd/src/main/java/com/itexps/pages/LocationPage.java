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
public class LocationPage extends BaseClass {
    
    //Page Factory
    @FindBy(xpath = ".//*[@id='location-list']/li[1]/h4/a")
    private WebElement location;
   
    @FindBy(xpath = ".//*[@id='price-list-0']/ul/li/h5")
    private WebElement mainmenu;
    
    //Intializing the Page Object:
    public LocationPage(){PageFactory.initElements(driver,this);
        }
    
    //Actions
    public ProductsPage LocationPage() {
        location.click();
        mainmenu.click();
        System.out.println("Location Selected");
        return new ProductsPage();
    }
    
}
