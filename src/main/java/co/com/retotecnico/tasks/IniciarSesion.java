package co.com.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retotecnico.userinterface.IniciarSesionUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGNIN),
                Click.on(BOX_USER),
                Enter.theValue(usuario).into(BOX_USER),
                Click.on(BOX_PASS),
                Enter.theValue(clave).into(BOX_PASS),
                WaitUntil.the(BOX_PASS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_IN)

        );
    }
    public static IniciarSesion enPagina(String usuario, String clave) {
        return instrumented(IniciarSesion.class, usuario, clave);
    }

}
