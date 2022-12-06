package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends Utility {

   By myAccount=By.xpath("//span[contains(text(),'My Account')]") ;
   By register=By.xpath("//a[contains(text(),'Register')]");
 By  registerText=By.xpath("//h1[contains(text(),'Register Account')]");
 By loginButton=By.xpath("//a[contains(text(),'Login')]");
 By returningCustomerText=By.xpath("//h2[contains(text(),'Returning Customer')]");
By firstNameRegister=By.id("input-firstname");
By lastNameRegister=By.id("input-lastname");
By emailIdRegister=By.id("input-email");
By telephoneNumberRegister=By.id("input-telephone");
By passwordRegister=By.id("input-password");
By confirmPasswordRegister=By.id("input-confirm");
By radioButtonYes=By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]");
By privacyPolicyChekcBox= By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");

By continueButtonclick=By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");
By accontCreatedText=By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
By continueButton3=By.xpath("//a[contains(text(),'Continue')]");
By MyAccountLink=By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
By logoutButton=By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");
By accountLogoutText=By.xpath("//h1[contains(text(),'Account Logout')]");
By continueButton4=By.xpath("//a[contains(text(),'Continue')]");
By clearEmailField=By.id("input-email");

By yourPassword=By.id("input-password");
By loginButton16=By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
By myAccountText1=By.xpath("//h2[contains(text(),'My Account')]");
By myAccountLinkClick1=By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
By accountLogout1= By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");
By accountLogoutText1=By.xpath("//h1[contains(text(),'Account Logout')]");
By continueButtonLast=By.xpath("//a[contains(text(),'Continue')]");




   // 1.1 Clickr on My Account Link.
    public void clickOnMyAccount1(){
        clickOnElement(myAccount);
    }
    public void clikcOnRegister(){
        clickOnElement(register);
    }
    //1.3 Verify the text “Register Account”.
    public String verifyTextRegisterAccount(){
        return getTextFromElement(registerText);
    }
    //2.2 click on login
    public void clikOnLoginButton(){
        clickOnElement(loginButton);
    }
    //2.3 Verify the text “Returning Customer”.
    public String verifyTextReturningCustomer(){
        return getTextFromElement(returningCustomerText);
    }
   //3. 3 Enter First Name
   public void EnterYourFirstName() {
       sendTextToElement(firstNameRegister,"siddharth");
   }
   //3.4 Enter Last Name
    public void EnterYourLastName() {
       sendTextToElement(lastNameRegister,"kaif");
    }
 //3.5 Enter Email
 public void EnterYourEmailId() {
    sendTextToElement(emailIdRegister,"citylondon123@gmail.com");
 }
//3.6 Enter Telephone
public void EnterYourTelephoneNumber() {
    sendTextToElement(telephoneNumberRegister,"0750024589");
}
//3.7 Enter Password
public void EnterYourPassword() {
    sendTextToElement(passwordRegister,"myname12356");
}
//3.8 Enter Password Confirm
public void EnterYourConfirmPassword() {
    sendTextToElement(confirmPasswordRegister,"myname12356");
}
//3.9 Select Subscribe Yes radio button
public void clikOnYesRadioButton() {
    clickOnElement(radioButtonYes);
}

//3.10 Click on Privacy Policy check box
public void clickOnPrivacyPolicy() {
    clickOnElement(privacyPolicyChekcBox);
}
//3.11 Click on Continue button
public void clickOnButtonContine() {
    clickOnElement(continueButtonclick);
}
//3.12 Verify the message “Your Account Has Been Created!”
    public String verifyYourAccountCreatedText(){
        return getTextFromElement(accontCreatedText);
    }
    //3.13 Click on Continue button
            public void clickTheButtonContine3() {
                clickOnElement(continueButton3);
            }

    // 3.14 Clickr on My Account Link.
    public void clickOnMyAccountLink() {
        clickOnElement(MyAccountLink);
    }
//3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    public void clickOnLogout(){
        clickOnElement(logoutButton);
    }
           // 3.16 Verify the text “Account Logout”
    public String verifyAccountLogoutText(){
        return getTextFromElement(accountLogoutText);
    }
            //3.17 Click on Continue button
    public void clickOnContinueButton4() {
        clickOnElement(continueButton4);
    }
    public void clearemailAddress(){
        WebElement emailaddress = driver.findElement(clearEmailField);
        emailaddress.clear();
        emailaddress.sendKeys("citylondon123@gmail.com");


    }

    //4.3 Enter Email address
    //public void EnterEmailAdress(){
      //  sendTextToElement(emailAddress,"citylondon123@gmail.com");
    //}
    //4.4 enter password
    public void enterYourRegisterPassword(){
        sendTextToElement(yourPassword,"myname12356");
    }
    //4.6 Click on Login button
    public void clickOnAccountLoginButton(){
        clickOnElement(loginButton16);
    }
    //4.7 Verify text “My Account”
    public String verifyMyaccountText1(){
        return getTextFromElement(myAccountText1);
    }
    // //4.8 Click on My Account Link.
    public void clickOnMyAccountLink1(){
        clickOnElement(myAccountLinkClick1);
    }
//4.9 pass the parameter “Logout”
    public void clickOnParameterLogout(){
        clickOnElement(accountLogout1);
    }
    // 4.10 Verify the text “Account Logout”
           public String verifyMyaccountLogoutText1(){
               return getTextFromElement(accountLogoutText1);
           }
           //4.11 Click on Continue button
    public void clickOnContinueButtonInEnd(){
        clickOnElement(continueButtonLast);
    }

}