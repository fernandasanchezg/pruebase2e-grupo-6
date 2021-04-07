package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoDeBusquedaInesperado;
import co.com.devco.questions.PreguntarPorImagenes;
import co.com.devco.questions.PrimerResultadoPetBook;
import co.com.devco.tasks.ClickenPetbook;
import io.cucumber.java.PendingException;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;


import static co.com.devco.exceptions.ResultadoDeBusquedaInesperado.ENCONTRADO_OTRO_RESULTADO;
import static co.com.devco.userinterfaces.PetBookResultadosPage.PRIMER_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookSearchStepDefinitions {

    @Cuando("^El (.*) da click en el boton (.*) en Petbook Search$")
    public void UsuarioDaClickEnElBoton(String nombreActor , String nombreBoton) {
        theActorCalled(nombreActor).attemptsTo(ClickenPetbook.elBoton(nombreBoton));

    }

    @Entonces("^debe ver como mínimo un resultado Imagenes de (.*)$")
    public void debevercomomínimounresultadoImagenesde(String Animal) {
        //theActorInTheSpotlight().attemptsTo();
        theActorInTheSpotlight().should(seeThat(
                PrimerResultadoPetBook.es(Animal)).orComplainWith(
                ResultadoDeBusquedaInesperado.class, ENCONTRADO_OTRO_RESULTADO
        ));

    }

    @Entonces("debe ver como resultados todas las mascotas")
    public void debeVerComoResultadosTodasLasMascotas() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(
                PreguntarPorImagenes.verificarlasimagenes()
        ));
    }


}