package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.computer.*;
import com.nopcommerce.demo.testbase.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    Computer computer = new Computer();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage bulidYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmOrderPage confirmOrderPage  =new ConfirmOrderPage();
    OrderComplietPage orderComplietPage =new OrderComplietPage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computer.clickOnComputerTab();
        computer.clickOnDesktopTab();
        computer.clickOnSortBy();
        computer.selectNameZtoA();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computer.clickOnComputerTab();
        computer.clickOnDesktopTab();
        computer.clickOnSortBy();
        desktopPage.selectNameAtoZ();
        Thread.sleep(5000);
        desktopPage.clickOnAddToCart();
        Thread.sleep(5000);
        String expectedMessage = "Build your own computer";
        Assert.assertEquals(bulidYourOwnComputerPage.getText(), expectedMessage, "Text not Found");
        Thread.sleep(5000);
        bulidYourOwnComputerPage.clickOnProcessor();
        bulidYourOwnComputerPage.selectProcessor();
        bulidYourOwnComputerPage.selectRam();
        bulidYourOwnComputerPage.selectGb();
        bulidYourOwnComputerPage.selectHddRadio();
        bulidYourOwnComputerPage.selectOsRadio();
        Thread.sleep(5000);
        bulidYourOwnComputerPage.selectSoftware1();
        bulidYourOwnComputerPage.selectSoftware2();
        //String expectedPrice = "$1,470.00";
        //Assert.assertEquals(computer.verifyThePrice(),expectedPrice,"PriceText not Matched");
        bulidYourOwnComputerPage.clickOnAddToCart1();
        Thread.sleep(5000);
        //String expectedText= "The product has been added to your shopping cart";
        //Assert.assertEquals(computer.verifyTheText(),expectedText," not Matched");
        Thread.sleep(8000);
        //computer.clickOnCloseButton();
        Thread.sleep(5000);
        bulidYourOwnComputerPage.mouseHoverOnShoopingCart();
        bulidYourOwnComputerPage.clickOnGoToCart();
        String expectedMessage2 = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.gettextFromShoppingCartFeild(), expectedMessage2, "Text not Matched");
       // WebElement qty = driver.findElement(By.id("itemquantity11223"));
        ///qty.clear();
        shoppingCartPage.sendQtyIntoBox("2");
        shoppingCartPage.clickOnUpdateCartButton();
        //String expectedMessage3 = "$2,950.00";
        // Assert.assertEquals(shoppingCartPage.gettextfromTotalPriceField(),expectedMessage3,"Pricetext not Matched");
        shoppingCartPage.clickOnCheckBox();
        shoppingCartPage.clickOnCheckOut();
        String expactedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(checkOutPage.getTextFromWelcomeField(), expactedMessage, "Text not Matched");
        checkOutPage.clickOnRegisterAsGuest();
        Thread.sleep(5000);
        // Fill the all mandatory field
        billingAddressPage.enterfirstName("djhyd");
        billingAddressPage.enterLastName("djudd");
        billingAddressPage.enterEmail("ujufyh888@gmail.com");
        billingAddressPage.enterCompanyName("njdhbvg");
        billingAddressPage.selectCountry();
        billingAddressPage.selectState();
        billingAddressPage.enterCity("gujrat");
        billingAddressPage.enterAddress("34 ramnagar");
        billingAddressPage.enterCode("2345");
        billingAddressPage.enterPhonnumber("3456784356");
        Thread.sleep(2000);
        billingAddressPage.clickOnContinue();
        //selecting shipping method for next day
        shippingMethodPage.clickOnNextDayButton();
        shippingMethodPage.clickOnContinue();
        //Select Radio Button “Credit Card”
        paymentMethodPage.clickOnCreditCard();
        //paymnet info
        paymentInfoPage.selectCardType("MasterCard");
        paymentInfoPage.enterName("Upasna");
        paymentInfoPage.enterCardNumber("555555576879556");
        paymentInfoPage.selectenterExpiryMonth("10");
        paymentInfoPage.selectenterExpiryYear("2067");
        paymentInfoPage.enterCode("678");
        //verify payment method
        String actualMethod=confirmOrderPage.getPaymentMethodName();
        String ecpactedMethod="Payment Method: Credit Card";
        Assert.assertEquals(actualMethod,ecpactedMethod,"verify text ");
        //verify shipping method
        String actualShiping =confirmOrderPage.getShippingMethodName();
        String expactedShipping =   "Shipping Method:Next Day Air" ;
        Assert.assertEquals(actualShiping,expactedShipping,"verify text");
        //Verify Total is “$2,950.00”
        String expactedTotal1="$2,950.00";
        String actualTotal1= confirmOrderPage.gettinTotal();
        Assert.assertEquals(actualTotal1,expactedTotal1,"verify total");
        confirmOrderPage.clickOnConfirm();
        //verify thank you text
        String actualThankYouText=orderComplietPage.getTextFromThankYouField();
        String expactedThankYouText="Thank you";
        Assert.assertEquals(actualThankYouText,expactedThankYouText,"verify text");
        //
        String actualText3=orderComplietPage.getTextFromOrderComplitField();
        String expactedtext3="Your order has been successfully processed!";
        Assert.assertEquals(actualText3,expactedtext3,"verify text");
        //click on continue
        orderComplietPage.clickOnContinue();

    }

}
