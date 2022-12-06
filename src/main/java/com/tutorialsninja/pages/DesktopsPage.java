package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {

    By desktopClick = By.linkText("Desktops");
    By showAllTheDesktopsClick = By.linkText("Show All Desktops");

    By desktopSortBy = By.id("input-sort");
    By selectHPProduct = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyTextHP = By.xpath("//h1[contains(text(),'HP LP3065')]");

    By sendQty=By.name("quantity");
    By clikOnAddToCart=By.id("button-cart");
    By verifyMessage=By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By closeSideButton=By.xpath("//body/div[2]/div[1]/div[1]/div[1]/button[1]");
    By ShoppingCart=By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText=By.xpath("//a[contains(text(),'Shopping Cart')]");
    By productName=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateTxt=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By modelTxt=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By totalPriceText=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");


    public void sortByNameZtoA() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(desktopSortBy, "Name (Z - A)");

        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals(originalProductsName, afterSortByZToAProductsName,"Product not sorted into Z to A order");
    }


    //2.1Mouse hover on Desktops
    public void mouseHoverOnDesktops() {
        mouseHoverToElementAndClick(desktopClick);
    }

    //2.2 Click on “Show All Desktops
    public void mouseHoverOnShowAllDesktops() {
        mouseHoverToElementAndClick(showAllTheDesktopsClick);
    }

    //2.3 Select Sort By position "Name: A to Z"
    public void sortByNameAtoZ() {
        selectByVisibleTextFromDropDown(desktopSortBy, "Name (A - Z)");
    }

    //  2.4 Select product “HP LP3065”
    public void selectHPLaptop() {
        clickOnElement(selectHPProduct);
    }

    //2.5 Verify the Text "HP LP3065"
    public String verifyTheTextForHpLaptop() {
        return getTextFromElement(verifyTextHP);
    }

    //2.6 Select Delivery Date "2022-11-30"
    public void selectDeliveryDate() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
    }
    //2.7  Enter Qty "1” using Select class.
    public void sendQty(){
        sendTextToElement(sendQty," ");
    }
   // 2.8	Click on “Add to Cart” button
    public void clickOnAddTOcartBtton(){
        clickOnElement(clikOnAddToCart);
    }
    public String verifYMessageSuceessfullyAdded(){
       // Assert.assertTrue("Product not added to cart",
               // getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"))
                        //.contains("Success: You have added HP LP3065 to your shopping cart!");
       // clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        return getTextFromElement(verifyMessage);
    }
    public void clickOncloseButton(){
        clickOnElement(closeSideButton);
    }

public void clikconShoppinCart(){//2.10
        clickOnElement(ShoppingCart);
}
public String verifyTxtShopingCart(){//2.11
        return getTextFromElement(shoppingCartText);
}
//2.12Verify the Product name "HP LP3065"
public String verifyProductNamee() {
    return getTextFromElement(productName);
}
    // 2.13	Verify the Delivery Date "2022-11-30"
    public String verifyDelviertDate(){
        return getTextFromElement(deliveryDateTxt);
    }
    // 2.14	Verify the Model "Product21"
    public String verifyModel(){
        return getTextFromElement(modelTxt);
    }
    // 2.15	Verify the Todat "£74.73"
    public String verifyTotalPrice(){
        return getTextFromElement(totalPriceText);
    }


}
