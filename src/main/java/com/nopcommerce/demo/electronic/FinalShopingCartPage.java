package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class FinalShopingCartPage extends Utility {
    By finalShoppingCartMassage=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By checkBoxField=By.xpath("//input[@id=\"termsofservice\"]");
    By checkout=By.id("checkout");
    public String gettextFromShopingCArtField(){
        return getTextFormElement(finalShoppingCartMassage);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBoxField);
    }
    public  void clickOnContinue(){
        clickOnElement(checkout);
    }
}
