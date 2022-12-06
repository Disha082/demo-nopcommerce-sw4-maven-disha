package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class OrderComplitedPage extends Utility {
    By thankYouMessField = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderComplitedField = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");


    public String getTextFromThankYouField() {
        return getTextFormElement(thankYouMessField);
    }

    public String getTextFromOrderComplitedFiedl() {
        return getTextFormElement(orderComplitedField);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

}
