package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

        By welcomeMessageField = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
        By guestRegField = By.xpath("//button[contains(text(),'Checkout as Guest')]");


        public String getTextFromWelcomeField() {
            return getTextFormElement(welcomeMessageField);
        }

        public void clickOnRegisterAsGuest() {
            clickOnElement(guestRegField);
        }
    }

