package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {
    By cardTextField=By.xpath("//span[contains(text(),'Credit Card')]");
    By totalPayment=By.xpath("//tr[@class=\"order-total\"]//span[@class=\"value-summary\"]");
    By confirmButton=By.xpath("//button[contains(text(),'Confirm')]");
    public String gettextFromCardNameField(){
        return getTextFormElement(cardTextField);
    }
    public String getTextFromTotalPayment(){
        return getTextFormElement(totalPayment);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
}
