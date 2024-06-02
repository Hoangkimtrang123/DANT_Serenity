package pages.tasks;

import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pages.search.OrderPageElements;
import pages.search.RegistrationPageElements;
import tasks.common.CommonWaitUntil;

public class RegisterTask {
    public static Performable information(String hoTen, String sdt, String email, String password, String confirmPassword) {
        return Task.where("{0} thong tin ",
                CommonWaitUntil.isVisible(OrderPageElements.HO_TEN),
                Enter.theValue(hoTen).into(RegistrationPageElements.HO_TEN),
                Enter.theValue(sdt).into(RegistrationPageElements.SDT),
                Enter.theValue(email).into(RegistrationPageElements.EMAIL),
                Enter.theValue(password).into(RegistrationPageElements.NHAP_MK),
                Enter.theValue(confirmPassword).into(RegistrationPageElements.NHAP_LAI_MK),
                Click.on(RegistrationPageElements.BUTTON_DK)
        );
    }
    public static Performable ClicksTheRegisterButton(Actor actor){
        return Task.where("{0} click dk ",
                Click.on(OrderPageElements.PT_THANH_TOAN)
        );
    }
    public static Performable ErrorMessage(Actor actor){
        return Task.where("{0} click dk ",
                Click.on(OrderPageElements.PT_THANH_TOAN)
        );
    }
}