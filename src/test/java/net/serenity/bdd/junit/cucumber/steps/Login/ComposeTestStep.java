package net.serenity.bdd.junit.cucumber.steps.Login;

import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenity.bdd.junit.cucumber.pages.AccountEmail;
import net.serenity.bdd.junit.cucumber.pages.ComposeEmail;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ComposeTestStep extends ScenarioSteps {

    AccountEmail aEmail_PO;
    ComposeEmail compose_PO;

    @Step
    public void composeEmailTo(ComposeData dataCompose) {
        aEmail_PO.clickCompose();
        compose_PO.sendCompose(dataCompose);
    }

    public void messageSuccesful() {
        compose_PO.messageSuccesful_PO();
    }
}
