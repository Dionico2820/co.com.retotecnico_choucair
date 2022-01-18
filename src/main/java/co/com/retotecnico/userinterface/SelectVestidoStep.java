package co.com.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectVestidoStep {
    public static final Target BTN_DRESS =Target.the("Boton Cat vestidos").located(By.xpath("(//*[contains(text(),'Dresses')])[5]"));
    public static final Target BTN_DRESS_CASUAL =Target.the("Boton casual vestidos").located(By.xpath("(//*[@title='Casual Dresses'])[2]"));
    public static final Target BTN_SELEC_DRESS_CASUAL =Target.the("Boton SEleccionar casual vestidos").located(By.xpath("(//a[@title='Printed Dress'])[2]"));

}
