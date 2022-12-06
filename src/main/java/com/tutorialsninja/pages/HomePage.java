package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By desktopClick=By.linkText("Desktops");
    By showAllTheDesktopsClick=By.linkText("Show All Desktops");
    By verifyText=By.xpath("//h2[contains(text(),'Desktops')]");

    By laptopsAndNotebooksClick=By.linkText("Laptops & Notebooks");
    By showAllLaptopsAndNotebooksClick=By.linkText("Show All Laptops & Notebooks");
    By verifyText1=By.xpath("//h2[text()='Laptops & Notebooks']");
    By Componentsclick = By.linkText("Components");
    By showallComponents = By.linkText("Show All Components");

    By verifytext2 = By.xpath("//h2[contains(text(),'Components')]");


    public void mouseHoverOnDesktop(){
        mouseHoverToElementAndClick(desktopClick);
    }
    public void clickOnShowAllTheDesktops(){
        clickOnElement(showAllTheDesktopsClick);
    }
    public String verifyText(){
        return getTextFromElement(verifyText);

    }
    public void mouseHoverOnLaptopAndNoteBooks(){
        mouseHoverToElementAndClick(laptopsAndNotebooksClick);
    }
    public void clickOnShowAllLaptopsAndNoteBooksClick(){
        clickOnElement(showAllLaptopsAndNotebooksClick);
    }
    public String verifyText1(){
        return getTextFromElement(verifyText1);
    }
    public void mouseHoverOnComponents() {
        mouseHoverToElementAndClick(Componentsclick);

    }

    public void clickOnShowAllComponents() {
        clickOnElement(showallComponents);
    }

    public String VerifyText2() {
        return getTextFromElement(verifytext2);
    }
}
