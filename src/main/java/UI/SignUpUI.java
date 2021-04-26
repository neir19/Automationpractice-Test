package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignUpUI {
    public static Target GENER_CHECK= Target.the("checkBoxGener").located(By.id("id_gender1"));
    public static  Target NAME1_FIELD= Target.the("nameField").located(By.id("customer_firstname"));
    public static  Target LASTNAME1_FIELD= Target.the("lastnameField").located(By.id("customer_lastname"));
    public static  Target PASSWORD_FIELD= Target.the("passwordField").located(By.id("passwd"));
    public static  Target DAY_SELECT= Target.the("daySelect").located(By.id("days"));
    public static  Target MONTH_SELECT= Target.the("monthSelect").located(By.id("months"));
    public static  Target YEAR_SELECT= Target.the("yearSelect").located(By.id("years"));
    public static  Target ADDRESS_FIELD= Target.the("addressField").located(By.id("address1"));
    public static  Target CITY_FIELD= Target.the("cityField").located(By.id("city"));
    public static  Target STATE_SELECT= Target.the("stateSelect").located(By.id("id_state"));
    public static  Target POSTAL_FIELD= Target.the("postalField").located(By.id("postcode"));
    public static  Target COUNTRY_SELECT= Target.the("countrySelect").located(By.id("id_counter"));
    public static  Target PHONE_FIELD= Target.the("proneField").located(By.id("phone_mobile"));
    public static  Target ALIAS_FIELD= Target.the("aliasField").located(By.id("alias"));
    public static  Target REGISTER_BTN= Target.the("regiserBtn").located(By.id("submitAccount"));
}
