package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.LocalizadoresAnunciatePage;

public class DiligenciarElFormularioDRegistroStep implements Task {
    private String nombre, email, telefono, ciudad;

    public DiligenciarElFormularioDRegistroStep(String nombre, String email, String telefono, String ciudad) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public static DiligenciarElFormularioDRegistroStep diligenciarElFormularioDRegistro(String nombre, String email, String telefono, String ciudad) {
   return Tasks.instrumented(DiligenciarElFormularioDRegistroStep.class, nombre,email,telefono, ciudad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(nombre).into(LocalizadoresAnunciatePage.TXT_NOMBRE),
            Enter.theValue(email).into(LocalizadoresAnunciatePage.TXT_EMAIL),
            Enter.theValue(telefono).into(LocalizadoresAnunciatePage.TXT_TELEFONO));
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(ciudad).from(LocalizadoresAnunciatePage.CBBX_CIUDAD),
                Click.on(LocalizadoresAnunciatePage.CHBX_TERMINOS),
                Click.on(LocalizadoresAnunciatePage.BTN_COTIZAR)
        );
    }
}
