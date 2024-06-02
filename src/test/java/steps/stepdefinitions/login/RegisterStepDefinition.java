package steps.stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import pages.navigation.LoginPage;
import pages.navigation.NavigateTo;
import pages.navigation.RegisterPage;
import pages.search.LoginPageElements;
import pages.search.RegistrationPageElements;
import pages.tasks.LoginTask;
import pages.tasks.OrderTask;
import io.cucumber.datatable.DataTable;
import pages.tasks.RegisterTask;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class RegisterStepDefinition {
      private DataTable dataTable;
    @Given("the user is on the registration page")
    public void theUserIsOnTheRegistrationPage(Actor actor) {
        actor.wasAbleTo(RegisterPage.theRegisterPage());

    }
    @When("the user enters the following registration details:")
    public void theUserEntersTheFollowingRegistrationDetails(Actor actor) {
       // actor.attemptsTo(LoginTask.login(hoTen,sdt,email, pass,confirmPass));

        List<Map<String, String>> buyerInfoList = dataTable.asMaps(String.class, String.class);
        Map<String, String> buyerInfo = buyerInfoList.get(0); // Lấy hàng đầu tiên từ DataTable
        actor.attemptsTo(
                RegisterTask.information(
                        buyerInfo.get("HO_TEN"),
                        buyerInfo.get("SDT"),
                        buyerInfo.get("GMAIL"),
                        buyerInfo.get("PASSWORD"),
                        buyerInfo.get("CONFIRM PASSWORD")
                )
        );

    }
    @And("the user clicks the register button")
    public void theUserClicksTheRegisterButton(Actor actor) {
        theActorInTheSpotlight().attemptsTo(RegisterTask.ClicksTheRegisterButton(theActorInTheSpotlight()));
    }

    @Then("the user should see an error message {string}")
    public void theUserShouldSeeAnErrorMessage( Actor actor,String expectedErrorMessage) {
         actor.should(
                seeThat("The error message", Text.of(RegistrationPageElements.ERRORMESSAGE_FIELD), containsString(expectedErrorMessage))
        );
    }

    @Then("the user should the see the home page")
    public void theUserShouldTheSeeTheHomePage(Actor actor) {
         actor.attemptsTo(NavigateTo.theSearchHomePage());

    }
}
