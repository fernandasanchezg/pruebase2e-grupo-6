package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class  PetBookResultadosPage {
	public static final Target RESULTADOS_BUSQUEDA = Target.the("resultados de busqueda").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul"));
	public static final Target PRIMER_RESULTADO = Target.the("Primer resultado de busqueda").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul/li[1]/a/img"));
}