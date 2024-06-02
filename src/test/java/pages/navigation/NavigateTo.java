package pages.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the  Co Mem home page",
                Open.browserOn().the(LoginPage.class));
    }
    public static Performable thecoMemhomepage() {  // trang chủ
        return Task.where("{0} opens the page",
                Open.url("https://comem.vn/"));
    }


}
