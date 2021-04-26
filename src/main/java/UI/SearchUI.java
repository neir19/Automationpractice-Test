package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchUI {
    public static Target SEARCH_FIELD= Target.the("search field").located(By.id("search_query_top")) ;
    public static Target SEARCH_BTN= Target.the("search button").located(By.xpath("//*[@id=\"searchbox\"]/button"));
}
