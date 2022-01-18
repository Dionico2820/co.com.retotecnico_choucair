package co.com.retotecnico.stepdefinitions;



import co.com.retotecnico.interactions.AbrirHome;
import co.com.retotecnico.questions.ValidarCompra;
import co.com.retotecnico.tasks.AddCart;
import co.com.retotecnico.tasks.IniciarSesion;
import co.com.retotecnico.tasks.SelectMedioPago;
import co.com.retotecnico.tasks.SelectVestido;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComprarVestidoStep {

    @Managed
    WebDriver myDriver;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("Dionicio").can(BrowseTheWeb.with(myDriver));
    }

    @Dado("^que (.*) abre pagina$")
    public void queDionicioCuandoAbreLaPagina(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirHome.enPagina()

        );
    }

    @Cuando("^realiza compra de vestido Printed Dress con usuario (.*) y clave (.*)$")
    public void realizaCompraDeVestidoPrintedDressMod(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enPagina(usuario, clave)
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectVestido.enPagina()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                AddCart.enPagina()

        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectMedioPago.enPagina()
        );

    }

    @Entonces("^se vera mensaje de Store is complete$")
    public void seVeraMensajeDeStoreIsComplete() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCompra.exitosa()));

    }


}
