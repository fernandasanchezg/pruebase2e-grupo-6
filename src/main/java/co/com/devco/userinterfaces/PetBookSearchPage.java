package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class  PetBookSearchPage {
	public static final String PETBOOK_HOME_PAGE = "http://localhost:4200/";
	public static final Target BOTON_PERRO = Target.the("Boton perro en Petbook").located(By.xpath("//button[.='Perro']"));
	public static final Target BOTON_GATO = Target.the("Boton gato en Petbook").located(By.xpath("//button[.='Gato']"));
	public static final Target BOTON_ALL = Target.the("Boton all en Petbook").located(By.xpath("//button[.='All']"));
	public static final Target RESULTADOS_BUSQUEDA = Target.the("resultados de busqueda").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul"));
	public static final Target PRIMER_RESULTADO = Target.the("Primer resultado de busqueda").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul/li[1]/a/img"));
}

