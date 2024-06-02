package pages.search;

import net.serenitybdd.screenplay.targets.Target;

public class OrderPageElements {
    public static Target Thong_tin_nhan_hang = Target.the("Confirmation heading")
            .locatedBy("//h2[contains(text(),'Thông tin nhận hàng')]");
    public static Target HO_TEN = Target.the("Full name field")
            .locatedBy("//input[@placeholder='Họ tên']");
    public static Target SDT = Target.the("Phone number field")
            .locatedBy("//input[@placeholder='Số điện thoại']");
    public static Target GMAIL = Target.the("Email field")
            .locatedBy("//input[@placeholder='Để lại email để nhận thông tin đơn hàng']");
    public static Target GHI_CHU = Target.the("Address field")
            .locatedBy("//input[@placeholder='Địa chỉ (Ví du: 123 Hoàng Cầu)']");
    public static Target TP_DROPDOWN = Target.the("City dropdown")
            .locatedBy("//span[@aria-expanded='true']");
    public static Target HUYEN_DROPDOWN = Target.the("District dropdown")
            .locatedBy("//span[@aria-expanded='true']");
    public static Target XA_DROPDOWN = Target.the("Ward dropdown")
            .locatedBy("//span[@aria-expanded='true']");
    public static Target PT_THANH_TOAN = Target.the("Payment method")
            .locatedBy("//body/div[@id='site-wrapper']/div[2]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/label[1]/span[1]");

    public static Target BTN_DAT_HANG = Target.the("Order confirmation button")
            .locatedBy("//button[contains(text(),'Xác nhận đặt hàng')]");
    public static Target XAC_NHAN_CHECKBOX = Target.the("search field")
            .locatedBy("//label[contains(text(),'n vào nút thanh toán t')]");

    public static Target PTTT_RadioButton = Target.the("search field")
        .locatedBy("//body/div[@id='site-wrapper']/div[@class='cart-site']/div[@class='container']/div[@class='checkout-content']/div[@class='checkout-content__form seven-twelfths mobile--one-whole']/form[@class='form form--simple checkout-form']/div[@class='checkout-form__payment']/div[@class='payment-method']/label[1]/span[1]");
    public static Target TOTAL_PAYMENT = Target.the("Total payment amount")
            .locatedBy("//div[@class='total-price']");
    public static Target ERROR_MESSAGE_FIELDd = Target.the("mess")
            .locatedBy("//span[contains(text(),'Họ tên không được để trống.')]");
    public static Target gio_hang = Target.the("giỏ hàng")
            .locatedBy("//a[@class='header-custom_item__icon icon-cart']");
    public static Target button_tiep_tuc_mua_hang = Target.the("giỏ hàng")
            .locatedBy("//a[@class='header-custom_item__icon icon-cart']");
//a[contains(text(),'Tiếp tục mua hàng')]
}

