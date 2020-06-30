/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.stepDefinitions;

import com.itexps.pages.CartPage;
import com.itexps.pages.CheckOutPage;
import com.itexps.pages.LocationPage;
import com.itexps.pages.LoginPage;
import com.itexps.pages.LogoutPage;
import com.itexps.pages.ProductsPage;
import com.itexps.util.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 *
 * @author Uma
 */
public class StepDefinitions extends BaseClass {
    LoginPage loginpage;
    LocationPage locationpage;
    ProductsPage productspage;
    CartPage cartpage;
    CheckOutPage checkoutpage;
    LogoutPage logoutpage;
    
    @Given("^user opens browser$")
public void user_opens_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    BaseClass.initialization();
}

@When("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    loginpage = new LoginPage();
    String loginpagetitle = loginpage.validateLoginPageTitle();
    Assert.assertEquals(prop.getProperty("title"), loginpagetitle);
}

@Then("^user enters emailid password and submit button$")
public void user_enters_emailid_password_and_submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    loginpage.login(prop.getProperty("emailid"), prop.getProperty("password"));
}

@Then("^user selects location and mainmenu$")
public void user_selects_location_and_mainmenu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    locationpage = new LocationPage();
    locationpage.LocationPage();
}

@When("^products page is displayed$")
public void products_page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    productspage = new ProductsPage();
    Boolean producttitle = productspage.verifyCorrectProduct();
    Assert.assertTrue(producttitle);
}

@Then("^user clicks noodles section and add hakka noodles to cart$")
public void user_clicks_noodles_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    productspage.ProductsPage();
}

@Then("^user clicks cart$")
public void user_clicks_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    cartpage = new CartPage();
    cartpage.ClickCart();
}

@When("^cart page is displayed$")
public void cart_page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Boolean cartflag = cartpage.verifyCheckoutbutton();
    Assert.assertTrue(cartflag);
    
}

@Then("^user clicks checkout$")
public void user_clicks_checkout() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    cartpage.ClickCheckout();
}

@Then("^user clicks pickup$")
public void user_clicks_pickup() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    checkoutpage = new CheckOutPage();
    checkoutpage.ClickPickup();
}

@When("^checkout page is displayed$")
public void checkout_page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Boolean checkflag = checkoutpage.verifyCheckout();
    Assert.assertTrue(checkflag);
}

@Then("^user enters credit card and phone information to place order$")
public void user_enters_credit_card_and_phone_information() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    checkoutpage.CheckOutPage(prop.getProperty("ccNumber1"), prop.getProperty("ccExpiry1"), prop.getProperty("ccCvc1"), prop.getProperty("phoneUS1"));
}

@When("^verify order successful$")
public void verify_order_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Boolean successflag = checkoutpage.verifyCheckoutError();
    Assert.assertTrue(successflag);
}

@Then("^user logoff web application$")
public void user_logoff_web_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    logoutpage = new LogoutPage();
    logoutpage.LogoutPage();
}
    
}

    

