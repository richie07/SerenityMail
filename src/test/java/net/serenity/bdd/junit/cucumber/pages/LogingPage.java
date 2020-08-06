package net.serenity.bdd.junit.cucumber.pages;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogingPage extends GenericPageObject{

    @FindBy(id = "login-button")
    private WebElementFacade btnLogin;

    @FindBy(id = "login-email")
    private WebElementFacade txtEmail;

    @FindBy(id = "login-password")
    private WebElementFacade txtPassword;

    //
    @FindBy(xpath = "//button[@class='btn btn-block login-submit']//span[contains(text(),'Log in')]")
    private WebElementFacade btnLoginIn;

    @FindBy(xpath = "//button[contains(@class,'mailcom')]")
    private WebElementFacade btnContinue;

    public void openHomePage_PO(){

        open();
    }

    public void performLogin_PO(LoginData ld) {
        btnLogin.click();
        txtEmail.sendKeys(ld.getUserName());
        txtPassword.sendKeys(ld.getPassword());
        btnLoginIn.click();
    }
}
