package pages.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import pages.search.CartPageElements;
import pages.search.LoginPageElements;
//import pages.search.Remove;
import pages.search.SearchForm;
import tasks.common.CommonWaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static pages.search.CartPageElements.SP_SON;

public class CartTask {
    public static Performable addToCart(String tenSP, String sl) {
        return Task.where("them san pham ",
//                Enter.theValue(tenSP)
//                        .into(SearchForm.SEARCH_FIELD)
//                        .thenHit(Keys.ENTER),  // nhập tên sản phẩm vào ô// tìm kiếm và sau đó nhấn Enter để tìm
//                WaitUntil.the(SearchResultsPage.PRODUCT_LIST, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds(),
//                Check.whether(SearchResultsPage.PRODUCT_LIST.contains(tenSP)).andIfSo(
//                        Click.on(SearchResultsPage.getProductByName(tenSP)) // Chọn sản phẩm
//                ),
//                WaitUntil.the(CartPageElements.BTN_THEM_VAO_GIO_HANG, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
//                Enter.theValue(sl).into(CartPageElements.QUANTITY_FIELD), // Nhập số lượng nếu có trường cụ thể cho nó
//                Click.on(CartPageElements.BTN_THEM_VAO_GIO_HANG) // Thêm vào giỏ hàng
//        );
////                Click.on(SP_SON) , //chọn sp
////                Click.on(CartPageElements.BTN_THEM_VAO_GIO_HANG)
                // Nhập tên sản phẩm vào ô tìm kiếm và nhấn Enter
                Enter.theValue(tenSP)
                        .into(SearchForm.SEARCH_FIELD)
                        .thenHit(Keys.ENTER),

                // Chờ cho trang chi tiết sản phẩm hiển thị
                WaitUntil.the(CartPageElements.BTN_THEM_VAO_GIO_HANG,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(15).seconds(),
                // Nhập số lượng
                Enter.theValue(sl).into(CartPageElements.Nhap_SL),
                // Nhấn nút thêm vào giỏ hàng
                Click.on(CartPageElements.BTN_THEM_VAO_GIO_HANG)
        );

    }
    public static Performable RemoveProductFromCart(String productName) {
        return Task.where("{0} xoa san pham : " + productName,
                Click.on(CartPageElements.BTN_REMOVE.of(productName)),
                WaitUntil.the(CartPageElements.HIEN_THI_SL, isVisible()).forNoMoreThan(10).seconds());
    }
//    public static Performable kt_gt_gio_hang() {
//        return Task.where("{0} tong gia tri trong gio hang",
//                Ensure.that(CartPageElements.TONG_TIEN).isDisplayed()
//        );
//    }
    public static Performable SearchedForTheProduct(String productName) {
        return Task.where("{0} searches for the product",
                Enter.theValue(productName).into(SP_SON),
                Click.on(SearchForm.CLICK_SEARCH)
        );
    }
    public static Performable GoToTheShoppingCart(String productName) {
        return Task.where("{0} searches for the product",
                Click.on(CartPageElements.GIO_HANG)
        );
    }
}





