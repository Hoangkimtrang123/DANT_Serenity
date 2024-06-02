package steps.stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import pages.navigation.LoginPage;
import pages.navigation.NavigateTo;
import pages.search.LoginPageElements;
import pages.tasks.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class LoginStepDefinition {


    @Given("the user {actor} is on the login page")
    public void theUserIsOnTheLoginPage(Actor actor) {
        actor.wasAbleTo(LoginPage.theLoginPage());
    }

    @When("the user enters the correct email:{string} and password:{string}")
    public void theUserEntersTheCorrectEmailAndPassword(String email, String pass) {
        theActorInTheSpotlight().attemptsTo(LoginTask.login(email,pass));
    }

    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        theActorInTheSpotlight().attemptsTo(LoginTask.clickLoginButton()
        );
    }
    @Then("the user should see the homepage")
    public void theUserShouldSeeTheHomepage() {
        theActorInTheSpotlight().attemptsTo(NavigateTo.theSearchHomePage());

    }
    @Given("the user on the login page")
    public void theUserOnTheLoginPage() {
        theActorInTheSpotlight().wasAbleTo(LoginPage.theLoginPage());
    }
    @When("the user enters an incorrect email:{string} and password:{string}")
    public void theUserEntersAnIncorrectEmailAndPassword(Actor actor,String email, String pass) {
        actor.attemptsTo(LoginTask.login(email, pass));
    }

    @Then("the user shouldd see an error message {string}")
    public void theUserShoulddSeeAnErrorMessage(Actor actor,String expectedErrorMessage) {
        actor.should(
                seeThat("The error message", Text.of(LoginPageElements.ERROR_MESSAGE_FIELD),
                        containsString(expectedErrorMessage))
        );
    }
}
