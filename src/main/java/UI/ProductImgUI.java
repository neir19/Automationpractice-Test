package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductImgUI {
    public static Target PRODUCT_IMG= Target.the("productImg").located(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")) ;

}
