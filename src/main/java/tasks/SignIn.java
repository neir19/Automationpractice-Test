package tasks;


import UI.SignInUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import questions.SignInQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class SignIn implements Task {
    private final String username;
    private final String password;

    public SignIn(String username, String password) {

        this.username = username;
        this.password = password;
    }


    public static Performable loginWithAccout(String username, String password) {
        return instrumented(SignIn.class, username, password);
    }

    @Override
    @Step("{0} ingresa se loguea con su cuenta")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(username).into(SignInUI.USERNAME_FIELD),
                Enter.theValue(password).into(SignInUI.PASSWORD_FIELD),
                Click.on(SignInUI.SIGNIN_BTN)
        );
        actor.should(seeThat((SignInQuestion.is() ), equalTo("MY ACCOUNT")));
    }
}
