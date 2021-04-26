package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddToCarBtnUI {
    public static Target ADD_FIELD= Target.the("addToCar").located(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")) ;
}
