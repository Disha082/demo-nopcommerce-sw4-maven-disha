package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentInfoPage extends Utility {
    By cardDropDown=By.xpath("//select[@id='CreditCardType']");
    By Fname=By.xpath("//input[@id='CardholderName']");
    By cardNumberField=By.xpath("//input[@id='CardNumber']");
    By expireMonthDropDown=By.xpath("//select[@id='ExpireMonth']");
    By expireYear=By.xpath("//select[@id='ExpireYear']");
    By code=By.xpath("//input[@id='CardCode']");
    By continueButton=By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    public void selectCardType(String name){
        selectByVisibleTextFromDropDown(cardDropDown,name);
    }
    public void enterName(String name){
        sendTextToElement(Fname,name);
    }public void enterCardNumber(String num){
        sendTextToElement(cardNumberField,num);
    }
    public void selectenterExpiryMonth(String month){
        selectByVisibleTextFromDropDown(expireMonthDropDown, month);
    }public void selectenterExpiryYear(String year){
        selectByVisibleTextFromDropDown(expireYear, year);
    }
    public void enterCode(String num){
        sendTextToElement(code,num);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}
