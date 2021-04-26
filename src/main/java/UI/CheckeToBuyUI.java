package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckeToBuyUI {
    public static Target CHECK_SUMMARY_BTN= Target.the("sumary button").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")) ;
    public static Target CHECK_ADDRESS_BTN= Target.the("address button").located(By.xpath("//*[@id=\"center_column\"]/form/p/button")) ;
    public static Target CHECK_ADDRESS_SHIPPING_BTN_= Target.the("SHIPPING button").located(By.xpath("//*[@id=\"form\"]/p/button")) ;
    public static Target TOTA_TEXTFIElD= Target.the("TOTAL").located(By.xpath("//*[@id=\"cart_summary\"]/tfoot/tr[5]/td[1]/span")) ;
    public static Target TERMS_CHECKBOX= Target.the("Terms check").located(By.id("cgv"));
}
