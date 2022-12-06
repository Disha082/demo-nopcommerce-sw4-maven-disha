package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By electronicTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellPhone = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By verifyTextCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By verifyTextWelcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logout = By.xpath("//a[contains(text(),'Log out')]");

    public void clickOnElectronicTab(){
        mouseHoverToElement(electronicTab);
    }
    public void clickOnCellPhone(){
        mouseHoverToElementAndClick(cellPhone);
    }
    public String verifyTextCellPhone(){
        return getTextFormElement(verifyTextCellPhone);
    }
    public String getText(){
        return getTextFormElement(verifyTextWelcomeToOurStore);
    }
    public void clickOnLogOut(){
        clickOnElement(logout);
    }


    }

