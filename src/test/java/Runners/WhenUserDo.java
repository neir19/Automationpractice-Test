package Runners;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tasks.*;

import static Constants.ConstansToInpunts.*;

@RunWith(SerenityRunner.class)
public class WhenUserDo {
    Actor actor;

    @Managed(driver = "chrome")
    WebDriver navegador;

    @Before
    public void loadPage(){
        actor=Actor.named(ACTOR_NAMED);
        actor.can(BrowseTheWeb.with(navegador));
        navegador.manage().window().maximize();

    }
    @Test
    public  void SignUpShort(){
        actor.has(OpenPageAutomation.open());
        actor.has(SignUpShort.doRegister(
                EMAIL_SIGNUPSHORT,
                NAME,
                LASTNAME,
                PASSWD_SIGNUP,
                DAY,
                MONTH,
                YEAR,
                ADDRESS_1,
                CITY,
                STATE,
                POSTAL_CODE,
                PHONE_NUMBER,
                ALIAS
        ));
    }
    @Test
    public void SignUpFull(){
        actor.has(OpenPageAutomation.open());
        actor.has(SignUpFull.doRegister(
                EMAIL_SIGNUPFULL,
                NAME,
                LASTNAME,
                PASSWD_SIGNUP,
                DAY,
                MONTH,
                YEAR,
                ADDRESS_1,
                CITY,
                STATE,
                POSTAL_CODE,
                PHONE_NUMBER,
                ALIAS,
                COMPANY,
                ADDRES_2,
                INFO,
                HOME_PONE
        ));

    }


    @Test
    public  void SignIn(){
        actor.has(OpenPageAutomation.open());
        actor.has(SignIn.loginWithAccout(EMAIL_SIGNIN,PASSWD_SIGNIN));
    }

    @Test
    public void aPurchaseWithoutLogin(){
        actor.has(OpenPageAutomation.open());
        actor.has(SearchToPage.search(WORD_SEARCH));
        actor.has(AddtoCar.presstoAdd());
        actor.has(OpenToCar.open());
        actor.has(CheckToBuyWithoutLogin.click(
                EMAIL_SIGNIN,
                PASSWD_SIGNIN));
    }
    @Test
    public void aPurchaseWithLogin(){
        actor.has(OpenPageAutomation.open());
        actor.has(SignIn.loginWithAccout(EMAIL_SIGNIN,PASSWD_SIGNIN));
        actor.has(SearchToPage.search(WORD_SEARCH));
        actor.has(AddtoCar.presstoAdd());
        actor.has(OpenToCar.open());
        actor.has(CheckToBuyWithLogin.click());



    }




}
