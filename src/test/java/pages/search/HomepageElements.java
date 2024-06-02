package pages.search;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class HomepageElements {
    @DefaultUrl("https://comem.vn/account/login") // Đây là trang đăng nhập
    public class LoginPage extends PageObject {
        public LoginPage(WebDriver driver) {
            super(driver);
        }
    }
}