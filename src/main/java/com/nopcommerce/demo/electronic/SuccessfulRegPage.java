package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class SuccessfulRegPage extends Utility {
    By registerMessageFeild=By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton=By.xpath("//a[contains(text(),'Continue')]");
    public String getTextFromRegisterMessageField(){
        return getTextFormElement(registerMessageFeild);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
