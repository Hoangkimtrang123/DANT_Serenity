package pages.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("/")
public class CartPage extends PageObject {
    public static Performable theCartPage() {
        return Task.where("{0} opens the Cart page",
                Open.url("https://comem.vn/cart"));
    }

}
