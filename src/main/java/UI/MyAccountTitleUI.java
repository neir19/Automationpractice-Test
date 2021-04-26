package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MyAccountTitleUI {
    public static Target TITLE_TEXTFIELD= Target.the("title ").located(By.xpath("//*[@id=\"center_column\"]/h1"));


}
