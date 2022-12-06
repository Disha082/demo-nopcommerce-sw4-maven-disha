package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computer extends Utility {
    By computers = By.xpath("//div[@class='header-menu']//ul[1]//a[text() = 'Computers ']");
    By desktop = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
    By sortBy = By.xpath("//select[@id='products-orderby']");
    By nameZtoA = By.xpath("//select[@id='products-orderby']");
    //1.4 Verify the Product will arrange in Descending orde





    public void clickOnComputerTab(){
        clickOnElement(computers);
    }
    public void clickOnDesktopTab(){
        clickOnElement(desktop);
    }
    public void clickOnSortBy(){
        clickOnElement(sortBy);
    }
    public void selectNameZtoA(){
        selectByValueFromDropDown(nameZtoA,"6");
    }





}
