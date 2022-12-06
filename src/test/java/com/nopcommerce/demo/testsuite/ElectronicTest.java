package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.electronic.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CheckoutRegPage checkoutRegPage = new CheckoutRegPage();
    SuccessfulRegPage successfulRegPage = new SuccessfulRegPage();
    FinalShopingCartPage finalShopingCartPage = new FinalShopingCartPage();
    BillingAdreessPage billingAdreessPage = new BillingAdreessPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PayMentInfoPage payMentInfoPage = new PayMentInfoPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    OrderComplitedPage orderComplitedPage = new OrderComplitedPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        homePage.clickOnElectronicTab();
        homePage.clickOnCellPhone();
        homePage.verifyTextCellPhone();

    }



    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        homePage.clickOnElectronicTab();
        homePage.clickOnCellPhone();
        homePage.verifyTextCellPhone();
        Thread.sleep(2000);
        cellPhonePage.clickOnNokiaLumiaField();
        //verify prodct name text
        String expactedTex = "Nokia Lumia 1020";
        String actualText = nokiaLumiaPage.gettextFromNokiaLumiaField();
        Assert.assertEquals(actualText, expactedTex, "verify text");
        //verify price#
        String expactedPrice = "$349.00";
        String actualprice = nokiaLumiaPage.gettextFromPrice();
        Assert.assertEquals(actualprice, expactedPrice, "verify Price");
        //2.8 Change quantity to 2

        WebElement element = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        element.clear();
        element.sendKeys("2");
        Thread.sleep(3000);
        //click on add to cart feild
        nokiaLumiaPage.clickOnAddToCartField();

        //verify message added in cart field
        String expactedMEssage = "The product has been added to your shopping cart";
        String actualMessage = nokiaLumiaPage.getTextFromAddedCardFieldMessage();
        Assert.assertEquals(actualMessage, expactedMEssage, "verify text");
// click on close bar
        nokiaLumiaPage.clickOnCloseBarField();
        Thread.sleep(3000);
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        nokiaLumiaPage.clickOnGoToCartButton();
        // 2.12 Verify the message "Shopping cart"
        String expactedText1 = "Shopping cart";
        String actaulText1 = shoppingCartPage.getMessageFromShoppingCartFiled();
        Assert.assertEquals(actaulText1, expactedText1, "verify Text");
        //click on checkbox
        shoppingCartPage.clickOnCheckBox();
        // Click on checkout
        shoppingCartPage.clickOnCheckOutField();
        //verify welcomesignText
        String expactedMessage = "Welcome, Please Sign In!";
        String actualMessge = checkOutPage.GetTextFromWelcomeSignFeild();
        Assert.assertEquals(actualMessge, expactedMessage, "verify text");
        //click on register tab
        checkOutPage.clickOnRegisterTab();
        //verify text
        String expactedRegText = "Register";
        String actualtRegText = checkoutRegPage.gettextFromRegisterFeidl();
        Assert.assertEquals(actualtRegText, expactedRegText, "verify text");
        // 2.20 Fill the mandatory fields
        checkoutRegPage.enterFirstName("dhyani");
        checkoutRegPage.enterLastName("patel");
        checkoutRegPage.enterEmail("prime111@gmail.com");
        checkoutRegPage.enterPassword("prime123");
        checkoutRegPage.enterConfirmPassword("prime123");
        Thread.sleep(3000);
        checkoutRegPage.clickOnregButton();
        //verify successful register text
        String excpactedMessage = "Your registration completed";
        String actualMessage1 = successfulRegPage.getTextFromRegisterMessageField();
        Assert.assertEquals(actualMessage1, excpactedMessage, "verify text");
        //click on continue button
        successfulRegPage.clickOnContinueButton();
        //verify text
        String expactedShopingCartText = "Shopping cart";
        String actualShoppingCartText = finalShopingCartPage.gettextFromShopingCArtField();
        Assert.assertEquals(actualShoppingCartText, expactedShopingCartText, "verify text ");
        //click on check box
        finalShopingCartPage.clickOnCheckBox();
        finalShopingCartPage.clickOnContinue();
        //fill the mendotery detail
        billingAdreessPage.enterFirstName("hjdhd");
        billingAdreessPage.enterFirstName("jfhyd");
        billingAdreessPage.enterCountry("india");
        billingAdreessPage.enterCity("Ahamedabad");
        billingAdreessPage.enteraddress("6 Shilpalay Flats");
        billingAdreessPage.enterState("gujrat");
        billingAdreessPage.enterZipCode("12344");
        billingAdreessPage.enterPhonNumber("0996878636");
        billingAdreessPage.clickOnContinueButton();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        Thread.sleep(2000);
        shippingMethodPage.clickOn2DayShippingMehod();
        shippingMethodPage.clickOnContinueButton();
        paymentMethodPage.clickOnCreditCard();
        paymentMethodPage.clickOnConinueButton();
        //sleect visa card
        payMentInfoPage.selectCard("Visa");
        payMentInfoPage.enterCardNumber("4111111111111111");
        payMentInfoPage.selectExpiryMonth("06");
        payMentInfoPage.selectExpiryYear("2025");
        payMentInfoPage.enterCode("2344");
        payMentInfoPage.clickOnContiNueButton();
        // Verify “Payment Method” is “Credit Card”
        String actualCardText = confirmOrderPage.gettextFromCardNameField();
        String expactedCardText = "Credit Card";
        Assert.assertEquals(actualCardText, expactedCardText, "verify text ");
        //Verify Total is “$698.00”
        String expactedTotalPayment = "$698.00";
        String actualTotalPayment = confirmOrderPage.getTextFromTotalPayment();
        Assert.assertEquals(actualTotalPayment, expactedTotalPayment, "verify Text");
        // click on confirm
        confirmOrderPage.clickOnConfirmButton();
        //Verify the Text “Thank You”
        String expactedThankYouMessage = "Thank you";
        String actualThankYouMessage = orderComplitedPage.getTextFromThankYouField();
        Assert.assertEquals(actualThankYouMessage, expactedThankYouMessage, "verify text");
        //Verify the message “Your order has been successfully processed!”
        String expactedMessage2 = "Your order has been successfully processed!";
        String actualMessage2 = orderComplitedPage.getTextFromOrderComplitedFiedl();
        Assert.assertEquals(actualMessage2, expactedMessage2, "verify text");
        orderComplitedPage.clickOnContinueButton();
        String  expected = "Welcome to our store";
        Assert.assertEquals(homePage.getText(),expected,"Message Not Matched");
        homePage.clickOnLogOut();


    }
}
