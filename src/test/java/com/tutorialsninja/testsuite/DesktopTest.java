package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {

    DesktopsPage deskTopsPage = new DesktopsPage();
    HomePage homePage=new HomePage();
    DesktopsPage desktopsPage=new DesktopsPage();



@Test
   public void verifyProductArrangeInAlphaBaticalOrder() {

    homePage.mouseHoverOnDesktop();
    homePage.clickOnShowAllTheDesktops();
    deskTopsPage.sortByNameZtoA();
    deskTopsPage.sortByNameAtoZ();
}
       //2
    @Test
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
    deskTopsPage.mouseHoverOnDesktops();
    deskTopsPage.mouseHoverOnShowAllDesktops();
    deskTopsPage.sortByNameAtoZ();
    deskTopsPage.selectHPLaptop();//2.4 Select product “HP LP3065”
    deskTopsPage.verifyTheTextForHpLaptop(); //2.5 Verify the Text "HP LP3065
        Assert.assertEquals(deskTopsPage.verifyTheTextForHpLaptop(),"HP LP3065","Error message not displayed");
        deskTopsPage.selectDeliveryDate();//2.6 select delivery date
    deskTopsPage.sendQty();//select Qty 1
    //deskTopsPage.clickOnAddTOcartBtton();//2.8 click on add to cart button
        clickOnElement(By.xpath("//button[@id='button-cart']"));
        Thread.sleep(2000);
        Assert.assertTrue(deskTopsPage.verifYMessageSuceessfullyAdded()
                .contains("Success: You have added HP LP3065 to your shopping cart!"), "Product not added to cart");
        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        Thread.sleep(2000);
        Assert.assertEquals(deskTopsPage.verifyTxtShopingCart(),"Shopping Cart","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyProductNamee(),"HP LP3065","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyDelviertDate(),"Delivery Date: 2011-04-22","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyModel(),"Product 21","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyTotalPrice(),"$122.00","Error message not displayed");
    }

}
