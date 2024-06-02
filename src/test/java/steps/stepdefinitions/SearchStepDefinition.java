package steps.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import pages.navigation.NavigateTo;
import pages.search.LookForInformation;
import pages.tasks.SearchTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchStepDefinition {
    @Given("the user is on the main search page on the internet")
    public void theUserIsOnTheMainSearchPageOnTheInternet(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("the user enters {string} into the search bar")
    public void theUserEntersIntoTheSearchBar(Actor actor,String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @And("the user clicks the search button")
    public void theUserClicksTheSearchButton(Actor actor,String searchParameter) {
        theActorInTheSpotlight().attemptsTo(SearchTask.clickSearchButton(searchParameter)
        );}

    @Then("the user should see information about {string}")
    public void theUserShouldSeeInformationAbout(String term ) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase(term)
        );
    }
    @Given("{actor} is on the main search page on the internet")
    public void IsOnTheMainSearchPageOnTheInternet(Actor actor) {
            actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }
    @When("{actor} looks up {string}")
    public void LooksUpString(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }
    @Then("{actor} should see information about {string}")
    public void actorShouldSeeInformationAboutString(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase(term)
        );
    }
}
