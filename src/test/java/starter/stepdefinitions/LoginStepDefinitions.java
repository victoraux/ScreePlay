package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.CreditAvailable;
import starter.dashboard.OverviewData;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


          @Given("^(.*) has an active account")
        public void has_an_active_account(String name){


            this.name = name;

    }
    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(NavigateTo.theDuckDuckGoHomePage(),
             DoLogin.withCredentials("Pepito","pass")
                        );

    }
    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {
         theActorInTheSpotlight().should(
                seeThat("The display credit available",OverviewData.creditAvaible(),equalTo("$17,800")),
                 seeThat("The display credit available",OverviewData.due_Today(),equalTo("$180")),
                seeThat("The display credit available",OverviewData.totalBalance(),equalTo("$350%7"))

        );

    }


}
