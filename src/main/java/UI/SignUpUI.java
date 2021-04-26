package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignUpUI {
    public static Target GENER_CHECK= Target.the("check box gener male").located(By.id("id_gender1"));
    public static  Target NAME1_FIELD= Target.the("name field").located(By.id("customer_firstname"));
    public static  Target LASTNAME1_FIELD= Target.the("lastname field").located(By.id("customer_lastname"));
    public static  Target PASSWORD_FIELD= Target.the("password field").located(By.id("passwd"));
    public static  Target DAY_SELECT= Target.the("day select").located(By.id("days"));
    public static  Target MONTH_SELECT= Target.the("month select").located(By.id("months"));
    public static  Target YEAR_SELECT= Target.the("year select").located(By.id("years"));
    public static  Target ADDRESS_FIELD= Target.the("address dield").located(By.id("address1"));
    public static  Target CITY_FIELD= Target.the("city field").located(By.id("city"));
    public static  Target STATE_SELECT= Target.the("state select").located(By.id("id_state"));
    public static  Target POSTAL_FIELD= Target.the("postal field").located(By.id("postcode"));
    public static  Target COUNTRY_SELECT= Target.the("country select").located(By.id("id_counter"));
    public static  Target PHONE_FIELD= Target.the("phone field").located(By.id("phone_mobile"));
    public static  Target ALIAS_FIELD= Target.the("alias field").located(By.id("alias"));
    public static  Target REGISTER_BTN= Target.the("regiser Buttonn").located(By.id("submitAccount"));
    public static  Target NEWLETTER_CHECKBOX= Target.the("newsletter check").located(By.id("newsletter"));
    public static  Target OFFERS_CHECKBOX= Target.the("offers check").located(By.id("optin"));
    public static  Target COMPANY_FIELD= Target.the("company field").located(By.id("company"));
    public static  Target ADDRESS_FIELD2= Target.the("secound address field").located(By.id("address2"));
    public static  Target INFO_FIELD= Target.the("info field").located(By.id("other"));
    public static  Target HOMEPHONE_FIELD= Target.the("homePhone number field").located(By.id("phone"));
}
