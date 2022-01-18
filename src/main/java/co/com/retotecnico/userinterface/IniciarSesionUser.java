package co.com.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionUser {

    public static final Target BTN_SIGNIN =Target.the("Boton Sign in").located(By.xpath("//*[contains(text(),'Sign in')]"));
    public static final Target BOX_USER= Target.the("Caja de user").located(By.id("email"));
    public static final Target BOX_PASS= Target.the("Caja de password").located(By.id("passwd"));
    public static final Target BTN_IN= Target.the("Boton para iniciar sesion").located(By.id("SubmitLogin"));




}
