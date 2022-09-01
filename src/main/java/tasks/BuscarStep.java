package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.BuscarPage;

public class BuscarStep implements Task {
    private String busqueda;
    private String ubicacion;

    public BuscarStep(String busqueda, String ubicacion) {
        this.busqueda = busqueda;
        this.ubicacion = ubicacion;
    }

    public static BuscarStep buscar(String busqueda, String ubicacion) {
        return Tasks.instrumented(BuscarStep.class, busqueda, ubicacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(busqueda).into(BuscarPage.TXT_BUSQUEDA),
                Enter.theValue(ubicacion).into(BuscarPage.TXT_UBICACION),
                Click.on(BuscarPage.BTN_BUSCAR));

    }
}
