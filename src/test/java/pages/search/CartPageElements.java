package pages.search;

import net.serenitybdd.screenplay.targets.Target;

public class CartPageElements {  ////img[@title='Giỏ hàng Cỏ Mềm']
    public static Target GIO_HANG = Target.the("search field")
            .locatedBy("//img[@title='Giỏ hàng Cỏ Mềm']");

    public static Target BTN_THEM_VAO_GIO_HANG = Target.the("search field")
            .locatedBy("//button[contains(text(),'Thêm vào giỏ hàng')]");
    public static Target SP_SON = Target.the("search field")
            .locatedBy("//body/div[@id='site-wrapper']/div[2]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]");

    public static Target xoa_sp = Target.the("search field")
            .locatedBy("//button[@class='remove']");

    public static Target SO_LUONG_GIO = Target.the("search field")
           .locatedBy("//a[@class='header-custom_item__icon icon-cart']//span[@class='header-cart__count'][normalize-space()='9']");
    public static Target BTN_REMOVE = Target.the("search field")
            .locatedBy("//button[@class='remove']");
    public static Target HIEN_THI_SL = Target.the("search field")
            .locatedBy("//div[@class='checkout-content__widget']//div[1]//div[2]//div[2]//div[1]//form[1]//div[1]");

    public static Target TONG_TIEN = Target.the("search field")
            .locatedBy("//div[@class='total-price']");
    public static Target Nhap_SL = Target.the("search field")
            .locatedBy("//div[@class='quantity product-quantity-change']");
    public static Target SP_Mat_na = Target.the("San Pham")
            .locatedBy("//body/div[@id='site-wrapper']/div[@class='site-page']/div[@class='container']/div[@class='search__container']/div[@class='search__content']/div[@class='grid']/div[6]/div[1]");

    //body/div[@id='site-wrapper']/div[@class='site-page']/div[@class='container']/div[@class='search__container']/div[@class='search__content']/div[@class='grid']/div[6]/div[1]
} //div[@class='quantity product-quantity-change']



