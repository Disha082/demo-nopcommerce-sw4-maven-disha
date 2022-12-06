package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By textVerify = By.xpath("//h1[text() = 'Build your own computer']");
    By selectProcessor = By.id("product_attribute_1");
    By selectGhz = By.xpath("//select[@id='product_attribute_1']");
    By ram= By.id("product_attribute_2");
    By selectGb = By.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.id("product_attribute_3_7");
    By osRadio = By.id("product_attribute_4_9");
    By software1 = By.id("product_attribute_5_10");
    By software2 = By.id("product_attribute_5_12");
    By price = By.xpath("//span[@id='price-value-1']");
    By clickOnAddToCart1 = By.id("add-to-cart-button-1");
    By verifyText = By.xpath("//p[@class='content']");
    By closePopupFiled=By.xpath("//p[@class=\"content\"]/following-sibling::span");
    By shoppingCart=By.xpath("//span[contains(text(),'Shopping cart')]");
    By goCartFiled=By.xpath("//button[contains(text(),'Go to cart')]");


    public String getText(){
        return getTextFormElement(textVerify);
    }
    public void clickOnProcessor(){
        clickOnElement(selectProcessor);
    }
    public void selectProcessor(){
        selectByValueFromDropDown(selectGhz,"1");
    }
    public void selectRam (){
        clickOnElement(ram);
    }
    public void selectGb(){
        selectByValueFromDropDown(selectGb,"5");
    }
    public void selectHddRadio(){
        clickOnElement(hddRadio);
    }
    public void selectOsRadio(){
        clickOnElement(osRadio);
    }
    public void selectSoftware1(){
        clickOnElement(software1);
    }
    public void selectSoftware2(){
        clickOnElement(software2);
    }
    public String verifyThePrice(){
        return getTextFormElement(price);
    }
    public void clickOnAddToCart1(){
        mouseHoverToElementAndClick(clickOnAddToCart1);
    }
    public String verifyTheText(){
        return getTextFormElement(verifyText);
    }
    public void clickOnCloseButton(){
        clickOnElement(closePopupFiled);
    }
    public void mouseHoverOnShoopingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCart(){
        clickOnElement(goCartFiled);
    }

}
