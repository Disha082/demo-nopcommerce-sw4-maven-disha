package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {
    By creditcardradioButton=By.xpath("//input[@id='paymentmethod_1']");
    By continueButton=By.xpath("//div[@id='payment-method-buttons-container']/descendant::button");
    public void clickOnCreditCard(){
        clickOnElement(creditcardradioButton);
    }
    public void clickOnConinueButton(){
        clickOnElement(continueButton);
    }
}
