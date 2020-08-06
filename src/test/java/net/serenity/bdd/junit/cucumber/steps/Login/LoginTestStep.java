package net.serenity.bdd.junit.cucumber.steps.Login;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenity.bdd.junit.cucumber.pages.AccountEmail;
import net.serenity.bdd.junit.cucumber.pages.LogingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestStep extends ScenarioSteps {
    //con Serenity no necesitas instanciar!
    LogingPage Lp;
    AccountEmail Ae;

    @Step
    public void openHomePage(){
        Lp.openHomePage_PO();
    }

    public void performLogin(LoginData ld){
        Lp.performLogin_PO(ld);
    }

    public void isAccountPresent() {
        Ae.isEmailLinkPresent();
    }
}
