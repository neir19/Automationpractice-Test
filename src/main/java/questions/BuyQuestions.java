package questions;

import UI.CheckeToBuyUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("{0} ve en la interfaz ")
public class BuyQuestions implements Question<String > {

    public static BuyQuestions is(){
        return new BuyQuestions();
    }


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckeToBuyUI.TOTA_TEXTFIElD).viewedBy(actor).asString();
    }
}
