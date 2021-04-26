package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OpenToCarBtnUI {

    public static Target OPENCAR_BTN= Target.the("addToCar").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")) ;

}
