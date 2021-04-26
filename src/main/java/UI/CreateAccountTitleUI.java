package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountTitleUI {
    public static Target TITLECREATE_FIELD= Target.the("title create").located(By.xpath(" //*[@id=\"noSlide\"]/h1"));
}
