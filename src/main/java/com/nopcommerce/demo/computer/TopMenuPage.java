package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    By computerField = By.linkText("Computers");
    By electronicField = By.linkText("Electronics");
    By apparelField = By.linkText("Apparel");
    By digitaDownload = By.linkText("Digital downloads");
    By books = By.linkText("Books");
    By jewelry = By.linkText("Jewelry");
    By giftCard = By.linkText("Gift Cards");

    public void clickOnComputer() {
        clickOnElement(computerField);
    }

    public String getTextForComputer() {
        return getTextFormElement(computerField);
    }

    public void clickOnElectronic() {
        clickOnElement(electronicField);
    }

    public String getTextFromElectronic() {
        return getTextFormElement(electronicField);
    }

    public void clickOnAppearl() {
        clickOnElement(apparelField);
    }

    public String gettextFromAppearl() {
        return getTextFormElement(apparelField);
    }

    public void clickOnDigitalDownLoad() {
        clickOnElement(digitaDownload);
    }

    public String getTextFromDigitalDownload() {
        return getTextFormElement(digitaDownload);
    }

    public void clickOnBooks() {
        clickOnElement(books);
    }
    public String getTextFromBook(){
        return getTextFormElement(books);
    }
    public void clickOnJewelry(){
        clickOnElement(jewelry);
    }
    public String getTextFromjewelry(){
        return getTextFormElement(jewelry);
    }
    public void clickOnGiftCard(){
        clickOnElement(giftCard);
    }
    public String getTextFromGiftCard(){
        return getTextFormElement(giftCard);
    }
}
