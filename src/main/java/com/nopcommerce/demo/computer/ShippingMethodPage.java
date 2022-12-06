package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {
    By nextDayRadioButton=By.xpath("//input[@id='shippingoption_1']");
    By continueButton=By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    public void clickOnNextDayButton(){
        clickOnElement(nextDayRadioButton);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

}
