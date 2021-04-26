package tasks;

import UI.CreateAccountTitleUI;
import UI.MyAccountTitleUI;
import UI.SignInUI;
import UI.SignUpUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import questions.SignInQuestion;
import questions.SignUpQuestions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class SignUpShort implements Task {

    private final String email;
    private final String name;
    private final String lastname;
    private final String password;
    private final String day;
    private final String month;
    private final String year;
    private final String address;
    private final String city;
    private final String state;
    private final String postalcode;
    private final String number;
    private final String alias;




    public SignUpShort(String email, String name, String lastname, String password, String day, String month, String year, String address, String city, String state, String postalcode, String number, String alias) {
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalcode = postalcode;
        this.number = number;
        this.alias = alias;
    }

    public static Performable doRegister(String email, String name, String lastname, String password, String day, String month, String year, String address,String city, String state, String postalcode, String number,String alias ) {
        return  instrumented(SignUpShort.class,email,name,lastname,password,day,month,year,address,city,state,postalcode,number, alias);
    }

    @Override
    @Step("{0} el usuario se registra")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(email).into(SignInUI.EMAIL_CREATE_FIELD),
                Click.on(SignInUI.CREATE_BTN),
                WaitUntil.the(CreateAccountTitleUI.TITLECREATE_FIELD, isVisible())


        );
        actor.should(seeThat(SignUpQuestions.is(), equalTo("CREATE AN ACCOUNT")));




        actor.attemptsTo(
                Click.on(SignUpUI.GENER_CHECK),
                Enter.theValue(name).into(SignUpUI.NAME1_FIELD),
                Enter.theValue(lastname).into(SignUpUI.LASTNAME1_FIELD),
                Enter.theValue(password).into(SignUpUI.PASSWORD_FIELD),
                SelectFromOptions.byValue(day).from(SignUpUI.DAY_SELECT),
                SelectFromOptions.byValue(month).from(SignUpUI.MONTH_SELECT),
                SelectFromOptions.byValue(year).from(SignUpUI.YEAR_SELECT),
                Enter.theValue(address).into(SignUpUI.ADDRESS_FIELD),
                Enter.theValue(city).into(SignUpUI.CITY_FIELD),
                SelectFromOptions.byVisibleText(state).from(SignUpUI.STATE_SELECT),
                Enter.theValue(postalcode).into(SignUpUI.POSTAL_FIELD),
                Enter.theValue(number).into(SignUpUI.PHONE_FIELD),
                Enter.theValue(alias).into(SignUpUI.ALIAS_FIELD),
                Click.on(SignUpUI.REGISTER_BTN)
        );
        actor.should(seeThat((SignInQuestion.is() ), equalTo("MY ACCOUNT")));
    }
}
