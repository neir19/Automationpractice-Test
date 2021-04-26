package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class SignInUI {
    public static Target USERNAME_FIELD= Target.the("email field").located(By.id("email"));
    public static Target PASSWORD_FIELD= Target.the("password field").located(By.id("passwd")) ;
    public static Target SIGNIN_BTN= Target.the("sign in button").located(By.id("SubmitLogin"));
    public static Target EMAIL_CREATE_FIELD= Target.the("email Create Field").located(By.id("email_create")) ;
    public static Target CREATE_BTN= Target.the("Create button").located(By.id("SubmitCreate"));
}
