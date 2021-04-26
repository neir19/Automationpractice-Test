package tasks;

import UI.CheckeToBuyUI;
import UI.SignInUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import questions.BuyQuestions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class CheckToBuyWithoutLogin implements Task {
    private final String username;
    private final String password;

    public CheckToBuyWithoutLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable click(String username, String password) {
        return  instrumented(CheckToBuyWithoutLogin.class,username,password);
    }

    @Override
    @Step("{0} hace la compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckeToBuyUI.CHECK_SUMMARY_BTN),
                Enter.theValue(username).into(SignInUI.USERNAME_FIELD),
                Enter.theValue(password).into(SignInUI.PASSWORD_FIELD),
                Click.on(SignInUI.SIGNIN_BTN),
                Click.on(CheckeToBuyUI.CHECK_ADDRESS_BTN),
                Click.on(CheckeToBuyUI.TERMS_CHECKBOX),
                Click.on(CheckeToBuyUI.CHECK_ADDRESS_SHIPPING_BTN_)
        );
        actor.should(seeThat((BuyQuestions.is() ), equalTo("TOTAL")));

    }
}
