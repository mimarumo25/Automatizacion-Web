package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.PaginasAmarillasPage;

public class AbrirAppStep implements Task {
    private PaginasAmarillasPage paginasAmarillasPage;

    public static AbrirAppStep abrirApp() {
        return Tasks.instrumented(AbrirAppStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(paginasAmarillasPage));
    }
}
