package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarPage extends PageObject {
    public static final By TXT_BUSQUEDA = By.xpath("//*[@id='__next']/main/div[1]/div[2]/div/div[2]/div[2]/form/div/div[1]/div/div[3]/input");
    public static final By TXT_UBICACION = By.xpath("//*[@id='__next']/main/div[1]/div[2]/div/div[2]/div[2]/form/div/div[3]/div/div[3]/input");
    public static final By BTN_BUSCAR = By.xpath("//*[@id='__next']/main/div[1]/div[2]/div/div[2]/div[2]/form/div/div[4]/button");
    public static final Target LBL_RESULTADO = Target.the("Extrae la dirrecion de la busqueda").located(By.xpath("//b[1]"));
    public static final By BTN_Anunciantes = By.xpath("//*[@id='__next']/header/nav/div/div/div[2]/ul/li[1]/a");
}
