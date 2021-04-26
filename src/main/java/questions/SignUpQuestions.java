package questions;

import UI.CreateAccountTitleUI;
import UI.MyAccountTitleUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SignUpQuestions implements Question<String> {
    public static SignUpQuestions is(){
        return  new SignUpQuestions();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CreateAccountTitleUI.TITLECREATE_FIELD).viewedBy(actor).asString();
    }
}
