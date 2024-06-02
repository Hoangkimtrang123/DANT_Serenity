package pages.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.SelectedStatus;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import pages.search.OrderPageElements;
import tasks.common.CommonWaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

public class OrderTask extends OrderPageElements {

public static Performable information(String hoTen, String sdt, String email, String ghichu, String tinhThanh, String huyen, String xa) {
    return Task.where("{0} enters buyer information",
            CommonWaitUntil.isVisible(OrderPageElements.HO_TEN),
            Enter.theValue(hoTen).into(OrderPageElements.HO_TEN),
            Enter.theValue(sdt).into(OrderPageElements.SDT),
            Enter.theValue(email).into(OrderPageElements.GMAIL),
            Enter.theValue(ghichu).into(OrderPageElements.GHI_CHU),
            SelectFromOptions.byVisibleText(tinhThanh).from(OrderPageElements.TP_DROPDOWN.getCssOrXPathSelector()),
            SelectFromOptions.byVisibleText(huyen).from(OrderPageElements.HUYEN_DROPDOWN),
            SelectFromOptions.byVisibleText(xa).from(OrderPageElements.XA_DROPDOWN)
    );
}
    public static Performable choosesThePaymentMethod() {
        return Task.where("{0} chooses the payment method",
                Click.on(OrderPageElements.PT_THANH_TOAN)
        );
    }

    public static Performable confirmsTheOrder() {
        return Task.where("{0} confirms the order",
                Click.on(OrderPageElements.XAC_NHAN_CHECKBOX)
        );
    }

    public static Performable confirmPaymentPolicy() {
        return Task.where("{0} confirms the payment policy",
                Click.on(OrderPageElements.XAC_NHAN_CHECKBOX)
        );
    }
}
