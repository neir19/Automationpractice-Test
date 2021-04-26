package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddToCarBtnUI {
    public static Target ADD_FIELD= Target.the("addToCar button").located(By.xpath("//*[@id=\"add_to_cart\"]/button")) ;
}
