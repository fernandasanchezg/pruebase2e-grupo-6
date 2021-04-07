package co.com.devco.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.devco.userinterfaces.PetBookResultadosPage.PRIMER_RESULTADO;

public class PreguntarPorImagenes implements Question<Boolean> {

    static final int allimages = 5;

    public PreguntarPorImagenes(){

    }

    public static PreguntarPorImagenes verificarlasimagenes(){
        return new PreguntarPorImagenes();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = Serenity.getDriver();
        List<WebElement> total = driver.findElements(By.tagName("li"));

        return(total.size() == allimages);


    }
}
