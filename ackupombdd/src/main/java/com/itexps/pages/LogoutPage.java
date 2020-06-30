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
public class LogoutPage extends BaseClass {
    
    //Page Factory
    @FindBy(xpath = "//b[@class='caret']")
    private WebElement acku;
    
    @FindBy(xpath = "//*[@id=\"navbar\"]/ul[2]/li[6]/ul/li[4]/a")
    private WebElement logout;
    
    
    //Intializing the Page Object:
    public LogoutPage(){PageFactory.initElements(driver,this);
        }
    
    //Actions
    public void LogoutPage() {
        acku.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[6]/ul/li[4]/a")));
        logout.click();
        driver.close();
        driver.quit();
        
    }
    
}
