package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartField = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantityBox = By.id("itemquantity11223");
    By updatecartButton = By.xpath("//button[@id='updatecart']");
    By totalPriceField = By.xpath("//tr[@class=\"order-total\"]/child::td//following::td/child::span");
    By checkBox=By.xpath("//input[@id=\"termsofservice\"]");
    By checkOut=By.xpath("//button[@id='checkout']");



    public String gettextFromShoppingCartFeild() {
        return getTextFormElement(shoppingCartField);
    }

    public void sendQtyIntoBox(String quanity){
        sendTextToElement(quantityBox,quanity );
    }

    public void clickOnUpdateCartButton() {
        clickOnElement(updatecartButton);
    }
    public String gettextfromTotalPriceField(){
        return getTextFormElement(totalPriceField);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }


}
