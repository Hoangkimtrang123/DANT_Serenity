package pages.search;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageElements {
    public static final Target ICON_DANG_NHAP = Target.the("Account icon")
            .locatedBy("//a[@aria-label='Tài khoản']");
    public static final Target EMAIL = Target.the("Email field")
            .locatedBy("//input[@placeholder='Email của bạn']");
    public static final Target PASSWORD = Target.the("Password field")
            .locatedBy("//input[@placeholder='Nhập mật khẩu']");
    public static final Target BTN_DANG_NHAP = Target.the("Login button")
            .locatedBy("//button[@type='submit']");
//    public static final Target DANG_NHAP = Target.the("Login header")
//            .locatedBy("//h1[contains(text(),'Đăng nhập')]");
    public static final Target ERROR_MESSAGE_FIELD = Target.the("Error message field")
            .locatedBy("//p[contains(text(),'Mật khẩu không chính xác')]");
}
