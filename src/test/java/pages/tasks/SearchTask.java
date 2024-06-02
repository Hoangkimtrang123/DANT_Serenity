package pages.tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import pages.search.LoginPageElements;
import pages.search.SearchForm;

public class SearchTask {

    public static Performable clickSearchButton(String keyword) {
        return Task.where("click buttun",
                Enter.theValue(keyword).into(SearchForm.SEARCH_FIELD),
                Click.on(SearchForm.CLICK_SEARCH)
        );
    }
}
