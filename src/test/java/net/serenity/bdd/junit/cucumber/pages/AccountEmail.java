package net.serenity.bdd.junit.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountEmail extends GenericPageObject{

    @FindBy(xpath = "//a[@class='mail']")
    private WebElementFacade inboxEmail;

    @FindBy(xpath = "//div[@id='navigation']//a[@class= 'iac mail_compose']")
    private WebElementFacade btnCompose;

    // extends PageObject = serenitybddcore import
    //private WebElementFacade btnCompose = $(By.xpath("//div[@id='navigation']//a[@class= 'iac mail_compose']"));

    public void isEmailLinkPresent(){
        getDriver().switchTo().frame("thirdPartyFrame_home");
        inboxEmail.isCurrentlyVisible();

    }


    public void clickCompose() {
        btnCompose.click();
    }
}
