package net.serenity.bdd.junit.cucumber.pages;

import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ComposeEmail extends GenericPageObject{

    @FindBy(xpath = "//li[@class='select2-search-field']/input[1]")
    private WebElementFacade inputToEmail;

    @FindBy(xpath = "//input[@class='mailobjectpanel-textfield_input']")
    private WebElementFacade inputSubject;

    @FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
    private WebElementFacade inputBody;

    @FindBy(xpath = "//*[@id='body']/div")
    private WebElementFacade inputBodyLine;

    @FindBy(id = "compose-send-button")
    private WebElementFacade btnSend;

    public void sendCompose(ComposeData dataCompose) {
        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame("thirdPartyFrame_mail");
        inputToEmail.click();
        inputToEmail.sendKeys(dataCompose.getToEmail());
        inputSubject.sendKeys(dataCompose.getSubject());
        inputBody.click();
        inputBody.click();
        inputBody.sendKeys(new String[] {dataCompose.getBody()});
        btnSend.click();

    }

    public void messageSuccesful_PO(){
        waitForAnyTextToAppear("E-mail sent successfully!");

    }
}
