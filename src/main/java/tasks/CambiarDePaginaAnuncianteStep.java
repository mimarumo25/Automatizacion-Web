package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.BuscarPage;
import utils.NavegarTabs;

public class CambiarDePaginaAnuncianteStep implements Task {

    public static CambiarDePaginaAnuncianteStep cambiarDePaginaAnunciante() {
        return Tasks.instrumented(CambiarDePaginaAnuncianteStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BuscarPage.BTN_Anunciantes),
            NavegarTabs.getIN(2));
    }
}
