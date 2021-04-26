package questions;

import UI.MyAccountTitleUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("{0} ve en la interfaz ")
public class SignInQuestion implements Question<String> {

    public static SignInQuestion is(){
        return  new SignInQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MyAccountTitleUI.TITLE_TEXTFIELD).viewedBy(actor).asString();
    }
}
