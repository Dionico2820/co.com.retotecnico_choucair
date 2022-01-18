package co.com.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retotecnico.userinterface.SelectMedioPagoUser.BTN_CONFIRM_ORDER;
import static co.com.retotecnico.userinterface.SelectMedioPagoUser.BTN_SELECT_MEDIO_PAGO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectMedioPago implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SELECT_MEDIO_PAGO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SELECT_MEDIO_PAGO),
                WaitUntil.the(BTN_CONFIRM_ORDER, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_CONFIRM_ORDER)



        );
    }
    public static SelectMedioPago enPagina() {
    return instrumented(SelectMedioPago.class);
    }
}
