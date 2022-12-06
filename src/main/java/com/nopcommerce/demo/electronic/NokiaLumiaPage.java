package com.nopcommerce.demo.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {
    By nokiaLumbiaTextField=By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By priceField=By.xpath("//span[@id='price-value-20']");
    By addCartFiled=By.xpath("//button[@id='add-to-cart-button-20']");
    By addedInCartMessageField=By.xpath("//div[@id='bar-notification']/div[1]/p[1]");
    By closeBareField=By.xpath("//div[@class=\"bar-notification success\"]/descendant::span");
    By shoppingCart=By.xpath("//li[@id='topcartlink']");
    By goToCartFiled=By.xpath("//button[contains(text(),'Go to cart')]");
    public String gettextFromNokiaLumiaField(){
        return getTextFormElement(nokiaLumbiaTextField);
    }
    public  String gettextFromPrice(){
        return  getTextFormElement(priceField);
    }
    public void clickOnAddToCartField(){
        clickOnElement(addCartFiled);
    }
    public String getTextFromAddedCardFieldMessage(){
        return getTextFormElement(addedInCartMessageField);
    }
    public void clickOnCloseBarField(){
        clickOnElement(closeBareField);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(goToCartFiled);
    }
}
