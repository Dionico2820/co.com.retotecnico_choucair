package co.com.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.retotecnico.userinterface.ValidarCompraUSer.TXT_ORDER_COMPLETE;


public class ValidarCompra implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(TXT_ORDER_COMPLETE).viewedBy(actor).asBoolean();
    }

    public static ValidarCompra exitosa() {
        return new ValidarCompra();
    }
}
