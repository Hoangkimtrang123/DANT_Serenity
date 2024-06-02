package pages.search;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPageElements {
    public static final Target XAC_NHAN_DANG_KY = Target.the("Đăng ký tài khoản")
            .locatedBy("//h2[contains(text(),'Đăng Ký Tài khoản')]");
    public static final Target HO_TEN = Target.the("Họ tên field")
            .locatedBy("//input[@placeholder='Họ Tên (*)']");
    public static final Target SDT = Target.the("số điện thoại field")
            .locatedBy("//input[@placeholder='Số điện thoại (*)']");
    public static final Target EMAIL = Target.the("Email field")
            .locatedBy("//input[@placeholder='Email (*)']");
    public static final Target NHAP_MK = Target.the("Nhập mật khẩu field")
            .locatedBy("//input[@placeholder='Nhập mật khẩu (*)']");
    public static final Target NHAP_LAI_MK = Target.the("Nhập lại mật khẩu field")
            .locatedBy("//input[@placeholder='Nhập lại mật khẩu (*)']");
    public static final Target BUTTON_DK = Target.the("Đăng ký")
            .locatedBy("//button[@type='submit']");
    public static final Target ERRORMESSAGE_FIELD = Target.the("errormessage")
            .locatedBy("//p[contains(text(),'Email đã tồn tại')]");


    //p[contains(text(),'Email đã tồn tại')]
}

