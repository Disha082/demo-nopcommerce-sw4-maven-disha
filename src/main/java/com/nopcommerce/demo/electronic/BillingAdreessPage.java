package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingAdreessPage extends Utility {
    By firstName=By.id("BillingNewAddress_FirstName");
    By lastName=By.id("BillingNewAddress_LastName");
    By country=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city =By.xpath("//input[@id='BillingNewAddress_City']");
    By address=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By state=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By zipCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phonNumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton=By.xpath("//button[@class=\"button-1 new-address-next-step-button\" and @name=\"save\"]");
    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
    }
    public void enterLastName(String lName){
        sendTextToElement(lastName ,lName);
    }
    public void enterCountry(String countryName){
        sendTextToElement(country,countryName);
    }
    public void enterCity(String cityName){
        sendTextToElement(city,cityName);
    }
    public void enteraddress(String input){
        sendTextToElement(address,input);
    }
    public void enterState(String stateName){
        sendTextToElement(state,stateName);
    }
    public void enterZipCode(String codeName){
        sendTextToElement(zipCode,codeName);
    }
    public void enterPhonNumber(String number){
        sendTextToElement(phonNumber,number);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
