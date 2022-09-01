package userinterfaces;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LocalizadoresAnunciatePage extends PageObject {
    public static final By LINK_ANUNCIATE = By.xpath("//*[@id='__next']/header/nav/div/div/div[2]/ul/li[1]/a");
    public static final By TXT_NOMBRE = By.name("lastname");
    public static final By TXT_EMAIL = By.name("email");
    public static final By TXT_TELEFONO = By.name("phone");
    public static final By CBBX_CIUDAD = By.name("ciudad_salesforce_dynamia");
    public static final By CHBX_TERMINOS = By.name("t_rminos_y_condiciones");
    public static final By BTN_COTIZAR = By.xpath("//*[@id=\"hsForm_3949afa2-7622-4938-845e-a6e38df4bd25_8897\"]/div/div[2]/input");
    public static final By LBL_RESUTALDORESGISTRO = By.xpath("//*[@id=\"hs_cos_wrapper_widget_1482445926091\"]/h1");
}
