package tasks;

import UI.AddToCarBtnUI;
import UI.ProductImgUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddtoCar  implements Task {

    public static Performable presstoAdd(){
        return instrumented(AddtoCar.class);
    }

    @Override
    @Step("{0} presiona el boton para agregar al carrito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductImgUI.PRODUCT_IMG)
        );
        actor.attemptsTo(Click.on(AddToCarBtnUI.ADD_FIELD));

    }
}
