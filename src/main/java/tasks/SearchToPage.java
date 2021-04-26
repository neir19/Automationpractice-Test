package tasks;

import UI.SearchUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchToPage implements Task {

    private final String word;

    public SearchToPage(String word) {
        this.word = word;
    }
    public static Performable search(String word){
        return  instrumented(SearchToPage.class,word);
    }

    @Override
    @Step("{0} busca el producto que desea comprar")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(word).into(SearchUI.SEARCH_FIELD),
                Click.on(SearchUI.SEARCH_BTN)
        );

    }
}
