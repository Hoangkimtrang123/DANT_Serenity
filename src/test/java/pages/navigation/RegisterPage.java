package pages.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class RegisterPage {
    public static Performable theRegisterPage() {
        return Task.where("{0} opens the register page",
                Open.url("https://comem.vn/account/register"));
    }
}
