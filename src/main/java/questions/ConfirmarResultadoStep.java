package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.BuscarPage;
import userinterfaces.LocalizadoresAnunciatePage;

public class ConfirmarResultadoStep implements Question<Boolean> {
    private  String respuesta;
    public ConfirmarResultadoStep(String respuesta) {
        this.respuesta = respuesta;
    }

    public static ConfirmarResultadoStep confirmarResultado(String respuesta) {
        return new ConfirmarResultadoStep(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultad;
        String msj = Text.of(LocalizadoresAnunciatePage.LBL_RESUTALDORESGISTRO).viewedBy(actor).asString();

        if(respuesta.contains(msj)){
            resultad = true;
        }else {
            resultad = false;
        }
        return resultad;
    }


}
