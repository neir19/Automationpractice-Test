package tasks;

import UI.CheckeToBuyUI;
import UI.SignInUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import questions.BuyQuestions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class CheckToBuyWithLogin implements Task {

    public static Performable click() {
        return  instrumented(CheckToBuyWithLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckeToBuyUI.CHECK_SUMMARY_BTN),
                Click.on(CheckeToBuyUI.CHECK_ADDRESS_BTN),
                Click.on(CheckeToBuyUI.TERMS_CHECKBOX),
                Click.on(CheckeToBuyUI.CHECK_ADDRESS_SHIPPING_BTN_)
        );
        actor.should(seeThat((BuyQuestions.is() ), equalTo("TOTAL")));
    }
}
