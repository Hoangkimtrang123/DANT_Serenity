package pages.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {
    //button[@aria-label='Tìm kiếm']
    public static Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("//input[@id='spotlight-search']");
    public static Target CLICK_SEARCH = Target.the("search field").locatedBy(" //button[@aria-label='Tìm kiếm']");

}
