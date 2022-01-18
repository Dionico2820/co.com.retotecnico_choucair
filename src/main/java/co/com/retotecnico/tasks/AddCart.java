package co.com.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retotecnico.userinterface.AddCartUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ADD_CART, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_ADD_CART),
                WaitUntil.the(BTN_PROCEDER_COMPRA_1, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_PROCEDER_COMPRA_1),
                Scroll.to(BTN_PROCEDER_COMPRA_2),
                WaitUntil.the(BTN_PROCEDER_COMPRA_2, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_PROCEDER_COMPRA_2),
                WaitUntil.the(BTN_PROCEDER_COMPRA_3, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_PROCEDER_COMPRA_3),
                WaitUntil.the(BTN_I_AGREE, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_I_AGREE),
                WaitUntil.the(BTN_PROCEDER_COMPRA_4, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_PROCEDER_COMPRA_4)


                );
    }
    public static AddCart enPagina() {
    return instrumented(AddCart.class);
    }
}
