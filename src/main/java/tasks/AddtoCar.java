package tasks;

import UI.AddToCarBtnUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddtoCar  implements Task {

    public static Performable presstoAdd(){
        return instrumented(AddtoCar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AddToCarBtnUI.ADD_FIELD));

    }
}
