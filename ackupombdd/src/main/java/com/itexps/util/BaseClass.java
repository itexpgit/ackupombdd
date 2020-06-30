/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Uma
 */

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;
    
    public BaseClass() {
        try {
            prop = new Properties();
            
            FileInputStream fis = new FileInputStream(new File("src/main/java/com/itexps/config/config.properties"));
            
            prop.load(fis);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void initialization(){
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(BaseUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(BaseUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url1"));
    }
    
    
    
    
}
