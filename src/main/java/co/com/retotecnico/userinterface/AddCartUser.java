package co.com.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCartUser {

    public static final Target BTN_ADD_CART =Target.the("Boton Add Cart").located(By.id("add_to_cart"));
    public static final Target BTN_PROCEDER_COMPRA_1 =Target.the("Proceder compra 1").located(By.xpath("//*[@title='Proceed to checkout']"));
    public static final Target BTN_PROCEDER_COMPRA_2 =Target.the("Proceder compra 2").located(By.xpath("(//*[contains(text(),'Proceed to checkout')])[2]"));
    public static final Target BTN_PROCEDER_COMPRA_3 =Target.the("Proceder compra 3").located(By.xpath("(//*[@name='processAddress'])"));
    public static final Target BTN_I_AGREE =Target.the("Proceder estoy de acuerdo").located(By.xpath("//*[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]"));
    public static final Target BTN_PROCEDER_COMPRA_4 =Target.the("Proceder compra 3").located(By.xpath("(//*[@class='icon-chevron-right right'])[3]"));


}
