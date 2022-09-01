package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.BuscarPage;

public class ValidaBucqueda implements Question<Boolean> {
    private  String respuesta;

    public ValidaBucqueda(String respuesta) {
        this.respuesta = respuesta;
    }

    public static ValidaBucqueda valida(String respuesta) {
        return new ValidaBucqueda(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultad;
        String direccion = Text.of(BuscarPage.LBL_RESULTADO).viewedBy(actor).asString();
        if(respuesta.equals(direccion)){
            resultad = true;
        }else {
            resultad = false;
        }
        return resultad;
    }
}
