package pages.tasks;

import com.google.common.reflect.ClassPath;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.WebDriver;
import pages.navigation.LoginPage;
import pages.search.LoginPageElements;
import tasks.common.CommonWaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

//import static pages.search.LoginPageElements.ERRORMESSAGE;

public class LoginTask {
    private static WebElementFacade heading;
    public static Performable login(String email, String pass) {
        return Task.where("Login",
                CommonWaitUntil.isVisible(LoginPageElements.EMAIL),
                Enter.theValue(email).into(LoginPageElements.EMAIL),
                Enter.theValue(pass).into(LoginPageElements.PASSWORD),
                Click.on(LoginPageElements.BTN_DANG_NHAP)
        );
    }
    public static Performable IsOnTheLoginPage(Actor actor){
        return Task.where("TheLoginPage",
                        Click.on(LoginPageElements.ICON_DANG_NHAP)
                //assertThat(LoginPageElements.isOnLoginPage()).isTrue()

        );
    }
    public static Performable clickLoginButton() {
        return Task.where("click buttun",
                Click.on(LoginPageElements.BTN_DANG_NHAP)
        );
    }
//    public Boolean answeredBy(Actor actor) {
//        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
//        String currentUrl = driver.getCurrentUrl();
//        return currentUrl.endsWith("//comem.vn/");
//    }

    private static class VerifyHomePage {
    }




}
