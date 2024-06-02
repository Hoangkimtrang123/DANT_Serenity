package steps.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import pages.navigation.OrderPage;
import pages.tasks.CartTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.not;
import static pages.search.CartPageElements.SP_SON;

public class CarStepDefinitions {

  @Given("the have searched for the product {string}")
    public void theHaveSearchedForTheProduct(Actor actor,String productName) {
       actor.attemptsTo(CartTask.SearchedForTheProduct(productName));
    }

    @When("the user select the {string} product")
    public void theUserSelectTheProduct(Actor actor, String tenSP, String sl) {
       actor.attemptsTo(CartTask.addToCart(tenSP, sl));
    }

    @And("the user add the product to the cart")
    public void theUserAddTheProductToTheCart(Actor actor) {

       actor.attemptsTo(CartTask.addToCart("Son","1"));
           }

    @Then("the user should see the {string} product in my cart")
    public void theUserShouldSeeTheProductInMyCart(Actor actor, String productName) {
       actor.should(seeThat(Text.of(SP_SON), containsString(productName)));
    }

    @Given("the user has added the {string} product to the shopping cart")
    public void theUserHasAddedTheProductToTheShoppingCart(Actor actor,String productName, String quantity) {
       actor.attemptsTo(CartTask.addToCart(productName, quantity));
    }
    @When("the user {actor} select the {string} product with quantity {string}")
    public void theUserSelectTheProductWithQuantity(Actor actor,String productName, String quantity) {
       actor.attemptsTo(CartTask.addToCart(productName, quantity));
    }

    @When("the user goes to the shopping cart")
    public void theUserGoesToTheShoppingCart(Actor actor) {

       actor.attemptsTo(OrderPage.theOrderPage());
    }
    @And("the user removes the {string} product from the shopping cart")
    public void theUserRemovesTheProductFromTheShoppingCart(Actor actor,String productName) {
       actor.attemptsTo(CartTask.RemoveProductFromCart(productName));
    }
    @Then("should not see the {string} product in the shopping cart")
    public void shouldNotSeeTheProductInTheShoppingCart(Actor actor, String productName) {
       actor.should(seeThat(Text.of(SP_SON), not(containsString(productName))));
    }



}
