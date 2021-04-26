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

@RunWith(SerenityRunner.class)
public class WhenUserDo {
    Actor actor;

    @Managed(driver = "chrome")
    WebDriver navegador;

    @Before
    public void loadPage(){
        actor=Actor.named("Sured");
        actor.can(BrowseTheWeb.with(navegador));
        navegador.manage().window().maximize();

    }
    @Test
    public  void doSignUp(){
        actor.has(OpenPageAutomation.open());
        actor.has(SignUp.doRegister(
                "neiderrestre11119@gmail.com",
                "Mauricio",
                "Restrepo",
                "5p44622W46cfQ5@",
                "19",
                "8",
                "1995",
                "madisson 48 A",
                "new York",
                "California",
                "55032",
                "3255454665",
                "nei"
        ));
    }


    @Test
    public  void doSignIn(){
        actor.has(OpenPageAutomation.open());
        actor.has(SignIn.loginWithAccout("neiderreestrepo1910@hotmail.com","99WLx@P5!zS3Qc!"));
    }

    @Test
    public void BuyToProduct(){
        actor.has(OpenPageAutomation.open());
        actor.has(SearchToPage.search("Shirt"));
        actor.has(AddtoCar.presstoAdd());
        actor.has(OpenToCar.open());
        actor.has(CheckToBuy.click(
                "neiderreestrepo1910@hotmail.com",
                "99WLx@P5!zS3Qc!"));
    }




}
