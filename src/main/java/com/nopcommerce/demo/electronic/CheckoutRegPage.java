package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutRegPage extends Utility {
    By registerTextFeild=By.xpath("//h1[contains(text(),'Register')]");
    By firstNameFiedl=By.xpath("//input[@id='FirstName']");
    By lastName=By.xpath("//input[@id='LastName']");
    By email=By.xpath("//input[@id='Email']");
    By password=By.xpath("//input[@id='Password']");
    By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//button[@id='register-button']");

    public String gettextFromRegisterFeidl(){
        return getTextFormElement(registerTextFeild);
    }
    public void enterFirstName(String name){
        sendTextToElement(firstNameFiedl,name);
    }
    public void enterLastName(String lName){
        sendTextToElement(lastName,lName);
    }
    public void enterEmail(String eName){
        sendTextToElement(email,eName);
    }
    public void enterPassword(String passName){
        sendTextToElement(password,passName);
    }
    public void enterConfirmPassword(String confirmPassName){
        sendTextToElement(confirmPassword,confirmPassName);
    }
    public void clickOnregButton(){
        clickOnElement(registerButton);

    }

}
