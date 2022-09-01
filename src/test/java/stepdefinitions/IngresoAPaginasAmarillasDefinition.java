package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ConfirmarResultadoStep;
import questions.ValidaBucqueda;
import tasks.AbrirAppStep;
import tasks.BuscarStep;
import tasks.CambiarDePaginaAnuncianteStep;
import tasks.DiligenciarElFormularioDRegistroStep;


import java.util.List;

public class IngresoAPaginasAmarillasDefinition {
@Before
public  void setStage(){
    OnStage.setTheStage((new OnlineCast()));
}

    @Given("^El Usuario Abre La App PaginasAmarillas\\.com$")
    public void elUsuarioAbreLaAppPaginasAmarillasCom() {
    OnStage.theActorCalled("Manuel").wasAbleTo(AbrirAppStep.abrirApp());
    }

    @Given("^Despues De Abrir La Pagina Se Ingresa Los Datos A Buscar$")
    public void despuesDeAbrirLaPaginaSeIngresaLosDatosABuscar(List<String> datos) {
         OnStage.theActorCalled("Manuel").wasAbleTo(BuscarStep.buscar(datos.get(0), datos.get(1)));
    }

    @And("^Valida Que La Informacion Obtenida En La Busqueda Sea La Correcta$")
    public void validaQueLaInformacionObtenidaEnLaBusquedaSeaLaCorrecta(List<String> datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidaBucqueda.valida(datos.get(0))));

    }

    @When("^Cambia De Pagina Anunciate$")
    public void cambiaDePaginaAnunciate() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CambiarDePaginaAnuncianteStep.cambiarDePaginaAnunciante());
}

    @And("^Carga La Informacion Solidada En El Formulario De Registro$")
    public void cargaLaInformacionSolidadaEnElFormularioDeRegistro(List<String> datos) {
        OnStage.theActorCalled("Manuel").wasAbleTo(DiligenciarElFormularioDRegistroStep.diligenciarElFormularioDRegistro(datos.get(0), datos.get(1), datos.get(2), datos.get(3)));

    }

    @Then("^Validar El Resultado Del Registro Sea Exitoso$")
    public void validarElResultadoDelRegistroSeaExitoso(List<String> datos) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
        ConfirmarResultadoStep.confirmarResultado(datos.get(0))));
    }

}