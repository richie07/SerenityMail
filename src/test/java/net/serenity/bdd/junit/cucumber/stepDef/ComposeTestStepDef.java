package net.serenity.bdd.junit.cucumber.stepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenity.bdd.junit.cucumber.steps.Login.ComposeTestStep;
import net.thucydides.core.annotations.Steps;

public class ComposeTestStepDef {

    ComposeData dataCompose = new ComposeData();

    @Steps
    ComposeTestStep cTestStep;

     @Given("^I have \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" for compose email$")
     public void i_have_for_compose_email(String usuario, String password, String toEmail, String subject, String body) throws Throwable {
         dataCompose.setAll(usuario, password, toEmail, subject, body);

     }

    @When("^Compose email to \"([^\"]*)\"$")
    public void compose_email_to(String toEmail) throws Throwable {
        cTestStep.composeEmailTo(dataCompose);

    }

    @Then("^I should see my succesfull mail sent$")
    public void i_should_see_my_succesfull_mail_sent() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cTestStep.messageSuccesful();
    }
}
