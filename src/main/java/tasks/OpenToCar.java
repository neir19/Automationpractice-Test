package tasks;

import UI.OpenToCarBtnUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenToCar implements Task {
    public static Performable  open() {
        return instrumented(OpenToCar.class);
    }

    @Override
    @Step("{0} abre la pagina del carrito")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OpenToCarBtnUI.OPENCAR_BTN)
        );
    }
}
