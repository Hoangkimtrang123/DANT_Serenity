package pages.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("/")
public class LoginPage extends PageObject {
    public static Performable theLoginPage() {   //đang ở trang  đăng nhaaoj
        return Task.where("{0} opens the login page",
                Open.url("https://comem.vn/account/login"));
    }
}
