package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {
    By dayshippingMehod=By.xpath("//input[@id='paymentmethod_1']");
    By continueButton=By.xpath("//div[@id=\"shipping-method-buttons-container\"]/descendant::button");
    public void clickOn2DayShippingMehod(){
        clickOnElement(dayshippingMehod);
    }
    public  void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
