package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.devco.userinterfaces.PetBookResultadosPage.PRIMER_RESULTADO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PrimerResultadoPetBook implements Question<Boolean> {
    private String resultado;

    public PrimerResultadoPetBook(String resultado){
        this.resultado = resultado;
    }

    public static PrimerResultadoPetBook es(String resultado){
        return new PrimerResultadoPetBook(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(PRIMER_RESULTADO).named("src").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado) ;
    }
}
