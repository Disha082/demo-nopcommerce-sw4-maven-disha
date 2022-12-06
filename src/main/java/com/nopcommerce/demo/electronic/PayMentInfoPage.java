package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PayMentInfoPage extends Utility {
    By dropDownField = By.xpath("//select[@id='CreditCardType']");
    By nameField=By.xpath("//input[@id='CardholderName']");
    By cardNumber=By.xpath("//input[@id='CardNumber']");
    By expiryMonth=By.xpath("//select[@id='ExpireMonth']");
    By expiryYear=By.xpath("//select[@id='ExpireYear']");
    By code=By.xpath("//input[@id='CardCode']");
    By continueButton=By.xpath("//div[@id=\"payment-info-buttons-container\"]/descendant::button");
    public void selectCard(String name) {
        selectByVisibleTextFromDropDown(dropDownField, name);
    }
    public void enterName(String fName){
        sendTextToElement(nameField,fName);
    }
    public  void enterCardNumber(String number){
        sendTextToElement(cardNumber,number);
    }
    public void selectExpiryMonth(String month){
        selectByVisibleTextFromDropDown(expiryMonth,month);
    }
    public void selectExpiryYear(String year){
        selectByVisibleTextFromDropDown(expiryYear, year);
    }
    public void enterCode(String number){
        sendTextToElement(code,number);
    }
    public void clickOnContiNueButton(){
        clickOnElement(continueButton);
    }
}
