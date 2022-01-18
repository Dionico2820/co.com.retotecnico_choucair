package co.com.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarCompraUSer {

    public static final Target TXT_ORDER_COMPLETE =Target.the("Boton volver a comprar").located(By.xpath("(//*[contains(text(),'Your order on My Store is complete.')])"));
}
