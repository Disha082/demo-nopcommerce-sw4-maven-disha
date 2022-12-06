package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {
    By creditCard=By.xpath("//input[@id='paymentmethod_1']");
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }
}
