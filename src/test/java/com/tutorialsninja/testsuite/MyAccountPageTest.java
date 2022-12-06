package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountPageTest extends BaseTest {
    MyAccountPage myAccountPage=new  MyAccountPage();



@Test
 public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
   myAccountPage.clickOnMyAccount1();
   myAccountPage.clikcOnRegister();
    Assert.assertEquals(myAccountPage.verifyTextRegisterAccount(),"Register Account","Error message not displayed");

}
@Test
    public void  verifyUserShouldNavigateToLoginPageSuccessfully(){
    myAccountPage.clickOnMyAccount1();
    myAccountPage.clikOnLoginButton();
    Assert.assertEquals(myAccountPage.verifyTextReturningCustomer(),"Returning Customer","Error message not displayed");
}
@Test
    public void verifyThatUserRegisterAccountSuccessfully(){
    myAccountPage.clickOnMyAccount1();
    myAccountPage.clikcOnRegister();
    myAccountPage.EnterYourFirstName();
    myAccountPage.EnterYourLastName();
    myAccountPage.EnterYourEmailId();
    myAccountPage.EnterYourTelephoneNumber();
    myAccountPage.EnterYourPassword();
    myAccountPage.EnterYourConfirmPassword();
    myAccountPage.clikOnYesRadioButton();
    myAccountPage.clickOnPrivacyPolicy();
    myAccountPage.clickOnButtonContine();
    Assert.assertEquals(myAccountPage.verifyYourAccountCreatedText(),"Your Account Has Been Created!","Error message not displayed");
    myAccountPage.clickTheButtonContine3();
    myAccountPage.clickOnMyAccountLink();
    myAccountPage.clickOnLogout();
    Assert.assertEquals(myAccountPage.verifyAccountLogoutText(),"Account Logout","Error message not displayed");
    myAccountPage.clickOnContinueButton4();

}
@Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
    myAccountPage.clickOnMyAccount1();
    myAccountPage.clikOnLoginButton();
    myAccountPage.clearemailAddress();

    myAccountPage.enterYourRegisterPassword();
    myAccountPage.clickOnAccountLoginButton();
    Assert.assertEquals(myAccountPage.verifyMyaccountText1(),"My Account","Error message not displayed");
    myAccountPage.clickOnMyAccountLink1();
    myAccountPage.clickOnParameterLogout();
    Assert.assertEquals(myAccountPage.verifyMyaccountLogoutText1(),"Account Logout","Error message not displayed");
    myAccountPage.clickOnContinueButtonInEnd();


}
}
