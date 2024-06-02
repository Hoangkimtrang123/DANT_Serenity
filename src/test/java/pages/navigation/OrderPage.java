package pages.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class OrderPage extends PageObject {
    public static Performable Successfully_order() {
        return Task.where("{0} Successfully the order page",
                Open.url("https://comem.vn/checkout/success?success=1&name=cc&price=95000&text_method=COD&order_code=664731f6d7761945ac094e9c"));
    }
    public static Performable theOrderPage() {
        return Task.where("{0} Successfully the order page",
                Open.url("https://comem.vn/cart"));
    }
}
