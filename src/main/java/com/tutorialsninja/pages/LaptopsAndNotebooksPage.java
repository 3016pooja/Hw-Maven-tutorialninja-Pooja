package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

By laptopsandNotebooksclick = By.linkText("Laptops & Notebooks");
By showAllLaptopsandBooksclick=By.linkText("Show All Laptops & Notebooks");

By shortAllPrice=By.id("input-sort");
By verifyTextofPrice=By.linkText("Price (High > Low)");
By macBookselect=By.xpath("//a[text()='MacBook']");
By macbookText=By.xpath("//h1[contains(text(),'MacBook')]");
By addtoCart=By.id("button-cart");
By verifyMessage=By.xpath("//div[@class='alert alert-success alert-dismissible']");
By shoppingCartClic=By.xpath("//a[contains(text(),'shopping cart')]");
By shopingCartText=By.xpath("//a[contains(text(),'Shopping Cart')]");
By prodcutNameMacbook=By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
By changeQty=By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
By updateclick=By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]");
By verifyTextForUpadte=By.xpath("div[@class='alert alert-success alert-dismissible']");
By totalPrice=By.xpath("//tbody/tr[1]/td[6]");
By checkOut=By.xpath("//a[contains(text(),'Checkout')]");
By checkOutTxt=By.xpath("//h1[contains(text(),'Checkout')]");
By NewCustomer=By.xpath("//h2[contains(text(),'New Customer')]");
By gusestCheckOut=By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]");
By continueTab=By.xpath("//input[@id='button-account']");
By firstName=By.id("input-payment-firstname");
By lastName=By.id("input-payment-lastname");
By emailIdField=By.id("input-payment-email");
By telePhoneNumberField=By.id("input-payment-telephone");
By addressField=By.id("input-payment-address-1");
By cityField=By.id("input-payment-city");
By posrcodeField=By.id("input-payment-postcode");
By countryFromDeopdown=By.id("input-payment-country");
By zone=By.id("input-payment-zone");
By continueButton=By.id("button-guest");
By addComment=By.name("comment");
By tearmsAndCondition=By.name("agree");
By continueButton2=By.id("button-payment-method");
By warningMeassage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");


//1.1 Mouse hover on Laptops & Notebooks Tab.and click
public void mouseHoverOnLaptopandNotebook(){
    mouseHoverToElementAndClick(laptopsandNotebooksclick);
}
//1.2 Click on “Show All Laptops & Notebooks”
    public void showallLaptopsAndBook(){
    mouseHoverToElementAndClick(showAllLaptopsandBooksclick);
    }

    //1.3 Select Sort By "Price (High > Low)"
    public void sortByHighTOLow(){
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(shortAllPrice, "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
    }
      //   1.4 Verify the Product price will arrange in High to Low order.
    public String verifyTextofPriceArranged(){
    return getTextFromElement(verifyTextofPrice);
    }
   //2. 4 Select Product “MacBook”
    public void selectMacbook(){
    mouseHoverToElementAndClick(macBookselect);
    }
   // 2.5 Verify the text “MacBook”
    public String verifyTxtMacBook(){
    return getTextFromElement(macbookText);
    }
           // 2.6 Click on ‘Add To Cart’ button
    public void clikconAddToCart(){
    clickOnElement(addtoCart);
    }
   // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”

    public String verifytextMessage(){
    return getTextFromElement(verifyMessage);
    }

    public void clickonShoppingCart(){ // 2.8 Click on link “shopping cart” display into success message
        clickOnElement(shoppingCartClic);
    }
//2.9 Verify the text "Shopping Cart"
    public String verifyShoppingCart1(){
    return getTextFromElement(shopingCartText);
    }

           // 2.10 Verify the Product name "MacBook"
    public String verifyProdcutNameMacbook() {
        return getTextFromElement(prodcutNameMacbook);
    }
    //2.11 Change Quantity "2"
    public void sendTextToChangeQty(){
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).clear();
        sendTextToElement(changeQty, "2");
    }
          //  2.12 Click on “Update” Tab
public void clickOnUpdateBtton(){
    clickOnElement(updateclick);
}
           // 2.13 Verify the message “ Success: You have modified your shopping cart!”
    public String verifyMessageForShoppingCart(){
    return getTextFromElement(verifyTextForUpadte);
    }

           /// 2.14 Verify the Total £737.45
    public String verifyTotal(){
    return getTextFromElement(totalPrice);
    }

           // 2.15 Click on “Checkout” button
    public void clickOnCheckout(){
    clickOnElement(checkOut);
    }
   // 2.16 Verify the text “Checkout”
   public String verifyTextCheckOut(){
       return getTextFromElement(checkOutTxt);
   }
            //2.17 Verify the Text “New Customer”
            public String verifyTextNewCustomer() {
                return getTextFromElement(NewCustomer);
            }
           // 2.18 Click on “Guest Checkout” radio button
    public void clickOnGusetCheckOut(){
    clickOnElement(gusestCheckOut);
    }

//2.19 Click on “Continue” tab
    public void clickonContinueTab(){
    clickOnElement(continueTab);
    }
//2.20 Fill the mandatory fields
public void sendTextOnFirstNameField(){
    sendTextToElement(firstName,"Riyab");
}
    public void sendTextOnLastNameField() {
        sendTextToElement(lastName, "shyed");
    }
public void sendTextToEmailField(){
    sendTextToElement(emailIdField,"mysyedname45@gmail.com");
}
public void sendTextToTelephoneNumber(){
    sendTextToElement(telePhoneNumberField,"07541280086");
}
public void sendTextToAdress(){
    sendTextToElement(addressField,"21,Mannat");
}
public void sendTextToCityField(){
    sendTextToElement(cityField,"Mumbai");
}
public void sendTextToPostCode(){
    sendTextToElement(posrcodeField,"ha38gr");
}
   public void selectCountry(){
    selectByVisibleTextFromDropDown(countryFromDeopdown,"Aaland Islands");
   }
   public void selectZone(){
    selectByVisibleTextFromDropDown(zone,"--- None --- ");
   }
   //2.21 Click on contiue Button
    public void clikcOnContiuneBtton(){
    clickOnElement(continueButton);
    }
    //2.22 Add Comments About your order into text area
    public void addingCommentOnOrder(){
    sendTextToElement(addComment,"Please consider my order ASAP");
    }
    //2.23 Check the Terms & Conditions check box
   public void checkOnTearmsAndConditions(){
    clickOnElement(tearmsAndCondition);
   }
    //2.24 Click on Continue button
    public void clikcOnContinueButton2(){
    clickOnElement(continueButton2);
    }
    //2.25 Verify the message Warning: Payment method required!"
    public String verifyWarningMessage(){
    return getTextFromElement(warningMeassage);
    }


}
