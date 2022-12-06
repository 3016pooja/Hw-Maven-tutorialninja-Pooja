package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage=new LaptopsAndNotebooksPage();




    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverOnDesktop();
        homePage.clickOnShowAllTheDesktops();
        Assert.assertEquals(homePage.verifyText(),"Desktops","Verify the Text");

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.mouseHoverOnLaptopAndNoteBooks();
        homePage.clickOnShowAllLaptopsAndNoteBooksClick();
        Assert.assertEquals(homePage.verifyText1(),"Laptops & Notebooks","Verify the Text");

    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
      homePage.mouseHoverOnComponents();
        homePage.clickOnShowAllComponents();
        Assert.assertEquals(homePage.VerifyText2(),"Components","Verify the Text");
    }
}
