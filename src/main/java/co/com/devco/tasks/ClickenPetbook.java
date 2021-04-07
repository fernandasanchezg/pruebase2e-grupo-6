package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.devco.userinterfaces.PetBookSearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickenPetbook implements Task {
    private String nombreBoton;

    public ClickenPetbook(String nombreBoton) {
        this.nombreBoton = nombreBoton;
    }

    public static Performable elBoton(String nombreBoton) {
        return instrumented(ClickenPetbook.class, nombreBoton);
    }

    @Override
    public <T extends Actor> void performAs(T actor)  {
        switch (nombreBoton){
            case "perro":
                actor.attemptsTo(
                        Open.url(PETBOOK_HOME_PAGE),
                        Click.on(BOTON_PERRO),
                        WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible())
                );
                break;
            case "gato":
                actor.attemptsTo(
                        Open.url(PETBOOK_HOME_PAGE),
                        Click.on(BOTON_GATO),
                        WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible())
                );
                break;
            case "all":
                actor.attemptsTo(
                        Open.url(PETBOOK_HOME_PAGE),
                        Click.on(BOTON_ALL),
                        WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible())
                );
            default:
                actor.attemptsTo(
                        Open.url(PETBOOK_HOME_PAGE),
                        Click.on(BOTON_ALL),
                        WaitUntil.the(RESULTADOS_BUSQUEDA, isVisible())
                );
        }

    }
}
