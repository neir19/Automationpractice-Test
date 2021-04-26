package tasks;

import Pages.AutomationpracticePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPageAutomation implements Task {
    public static Performable open() {

        return instrumented(OpenPageAutomation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new AutomationpracticePage()));
    }
}
