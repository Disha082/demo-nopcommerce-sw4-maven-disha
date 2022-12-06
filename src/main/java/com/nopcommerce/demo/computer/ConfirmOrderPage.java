package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {
    By paymentmethodfield=By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethodFiedl=By.xpath("//span[contains(text(),'Shipping Method:')]");
    By total=By.xpath("//span[@class=\"value-summary\"]/child::strong");
    By confirm=By.xpath("//button[contains(text(),'Confirm')]");
    public String getPaymentMethodName(){
        return  getTextFormElement(paymentmethodfield);
    }public String getShippingMethodName(){
        return getTextFormElement(shippingMethodFiedl);
    }
    public String gettinTotal(){
        return  getTextFormElement(total);
    }
    public void clickOnConfirm(){
        clickOnElement(confirm);
    }

}
