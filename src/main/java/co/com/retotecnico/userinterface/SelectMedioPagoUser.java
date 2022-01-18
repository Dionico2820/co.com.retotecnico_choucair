package co.com.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectMedioPagoUser {
    public static final Target BTN_SELECT_MEDIO_PAGO = Target.the("Boton seleccionar medio de pago").located(By.xpath("(//*[@title='Pay by bank wire'])"));
    public static final Target BTN_CONFIRM_ORDER = Target.the("Boton confirmar orden").located(By.xpath("(//*[contains(text(),'I confirm my order')])"));

}

