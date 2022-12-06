package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By computers = By.xpath("//div[@class='header-menu']//ul[1]//a[text() = 'Computers ']");
    By desktop = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
    By sortBy = By.xpath("//select[@id='products-orderby']");
    By nameAtoZ = By.xpath("//select[@id='products-orderby']");
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");




    public void clickOnComputerTab(){
        clickOnElement(computers);
    }
    public void clickOnDesktopTab(){
        clickOnElement(desktop);
    }
    public void clickOnSortBy(){
        clickOnElement(sortBy);
    }
    public void selectNameAtoZ(){
        selectByValueFromDropDown(nameAtoZ,"5");
    }
    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToCart);
    }
}

