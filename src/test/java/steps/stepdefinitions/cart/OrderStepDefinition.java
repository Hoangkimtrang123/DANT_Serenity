package steps.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import pages.navigation.NavigateTo;
import pages.navigation.OrderPage;
import pages.search.OrderPageElements;
import pages.tasks.CartTask;
import pages.tasks.OrderTask;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class OrderStepDefinition {
    private DataTable dataTable;

    @Given("the user has logged into their account")
    public void theUserHasLoggedIntoTheirAccount(Actor actor) {

        actor.attemptsTo(NavigateTo.theSearchHomePage());
    }

    @And("the user has selected products and added them to the cart")
    public void theUserHasSelectedProductsAndAddedThemToTheCart(Actor actor,DataTable productData) {
        List<Map<String, String>> products = productData.asMaps(String.class, String.class);
        for (Map<String, String> product : products) {
            String productName = product.get("productName");
            String quantity = product.get("quantity");
            actor.attemptsTo(CartTask.addToCart(productName, quantity));
        }
    }
    @Given("the user has navigated to the checkout page")
    public void theUserHasNavigatedToTheCheckoutPage(Actor actor,String expected) {
        actor.attemptsTo(
                OrderPage.theOrderPage());
        actor.should(
                seeThat("thong tin nhạn hang",
                        Text.of(OrderPageElements.Thong_tin_nhan_hang),
                        containsString(expected))
        );

    }
    @When("the user fills in the buyer's information and address as follows:")
    public void theUserFillsInTheBuyerSInformationAndAddressAsFollows(Actor actor,DataTable dataTable) {
        List<Map<String, String>> buyerInfoList = dataTable.asMaps(String.class, String.class);
        Map<String, String> buyerInfo = buyerInfoList.get(0); // Lấy hàng đầu tiên từ DataTable

        actor.attemptsTo(
                OrderTask.information(
                         buyerInfo.get("HO_TEN"),
                        buyerInfo.get("SDT"),
                        buyerInfo.get("GMAIL"),
                        buyerInfo.get("GHI_CHU"),
                        buyerInfo.get("TP_DROPDOW"),
                        buyerInfo.get("HUYEN_DROPDOW"),
                        buyerInfo.get("XA_DROPDOW")
                        //actor.attemptsTo(

                )
        );
    }
    @And("the user chooses the payment method")
    public void theUserChoosesThePaymentMethod(Actor actor) {
       actor.attemptsTo(OrderTask.choosesThePaymentMethod());
    }
    @And("the user checks the total payment {string}")
    public void theUserChecksTheTotalPayment(Actor actor,String expectedTotalAmount) {
        //actor.attemptsTo(ChecksTheTotalPayment.withAmount(expectedTotalAmount));
       actor.should(
                seeThat("The total payment",
                        Text.of(OrderPageElements.TOTAL_PAYMENT),
                        containsString(expectedTotalAmount))
        );
    }
    @And("the user confirms the payment policy") //xác nhận chin sách
    public void theUserConfirmsThePaymentPolicy(Actor actor) {

        actor.attemptsTo(OrderTask.confirmPaymentPolicy());
    }
    @And("the user confirms the order")  // xác nhận đơn
    public void theUserConfirmsTheOrder(Actor actor) {
        actor.attemptsTo(OrderTask.confirmsTheOrder());

    }
    @Then("the user should see the order success page")
    public void theUserShouldSeeTheOrderSuccessPage(Actor actor) {

        actor.attemptsTo(OrderPage.Successfully_order());
    }

    @Given("the user has navigated to the payment page") ///
    public void theUserHasNavigatedToThePaymentPage(Actor actor) {

        actor.attemptsTo(OrderPage.theOrderPage());
    }

    @When("the user fills in the buyer information incorrectly")
    public void theUserFillsInTheBuyerInformationIncorrectly(Actor actor,DataTable dataTable) {
        List<Map<String, String>> buyerInfoList = dataTable.asMaps(String.class, String.class);
        Map<String, String> buyerInfo = buyerInfoList.get(0);
        theActorInTheSpotlight().attemptsTo(
                OrderTask.information(
                        buyerInfo.get("HO_TEN"),
                        buyerInfo.get("SDT"),
                        buyerInfo.get("GMAIL"),
                        buyerInfo.get("GHI_CHU"),
                        buyerInfo.get("TP_DROPDOW"),
                        buyerInfo.get("HUYEN_DROPDOW"),
                        buyerInfo.get("XA_DROPDOW")
                )
        );
    }

    @And("the user tries to confirm the order") //xác nhận đơn hàng
    public void theUserTriesToConfirmTheOrder(Actor actor) {
        actor.attemptsTo(
                OrderTask.confirmsTheOrder());
    }

    @Then("the user will then see the error message {string}")
    public void theUserWillThenSeeTheErrorMessage(Actor actor,String expectedErrorMessage) {
        actor.should(
                seeThat("The error message", Text.of(OrderPageElements.ERROR_MESSAGE_FIELDd),
                        containsString(expectedErrorMessage))
        );
    }
}
