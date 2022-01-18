package co.com.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retotecnico.userinterface.SelectVestidoStep.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectVestido implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                MoveMouse.to(BTN_DRESS),
                Scroll.to(BTN_DRESS_CASUAL),
                WaitUntil.the(BTN_DRESS_CASUAL, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_DRESS_CASUAL),
                WaitUntil.the(BTN_SELEC_DRESS_CASUAL, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_SELEC_DRESS_CASUAL)

                );
    }

    public static SelectVestido enPagina() {
    return instrumented(SelectVestido.class);
    }
}
