package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenity.bdd.junit.cucumber.steps.Login.LoginTestStep;
import net.thucydides.core.annotations.Steps;

public class LoginTestStepDef extends GenericDeclarationClass{
    LoginData dataUser = new LoginData();

    @Steps
    LoginTestStep LT_steps;

    @When("^perform Login action$")
    public void perform_Login_action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LT_steps.openHomePage();
        LT_steps.performLogin(dataUser);
    }

    @Then("^I should see my email accounts$")
    public void i_should_see_my_email_accounts() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LT_steps.isAccountPresent();

    }

    @Given("^I use \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_use_and(String username, String password) throws Throwable {
        dataUser.setAll(username,password);

    }

}
