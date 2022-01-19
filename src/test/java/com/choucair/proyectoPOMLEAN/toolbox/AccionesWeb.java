package com.choucair.proyectoPOMLEAN.toolbox;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.util.EnvironmentVariables;

public class AccionesWeb extends PageObject {
	private String bordeRojo = "arguments[0].style.border='3px dashed red'";
	private String bordeVerde = "arguments[0].style.border='3px dashed green'";
	private String rellenoRojo = "arguments[0].style.color='red'";
	private static final String WEBDRIVERTIMEOUT = "webdriver.timeouts.implicitlywait";
	private EnvironmentVariables environmentVariables;

	/**
	 * 
	 */
	public void ingresoURL(String strUrl) {
		WebDriver driver = getDriver();
		driver.get(strUrl);
	}

	/**
	 * Este metodo crea un borde rojo sobre un elemento de la pagina
	 * 
	 * @param strXptElemento xpath del elemento que se bordea
	 */
	public void bordearElemento(String strXptElemento) {
		WebElement webElemeBordear = find(By.xpath(strXptElemento));
		((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElemeBordear);
	}

	/**
	 * Este metodo crea un borde rojo sobre un elemento de la pagina
	 * 
	 * @param webElementFac Elemento que se bordeara
	 */

	public void bordearElemento(WebElementFacade webElementFac, String color) {

		if (color.equals("Rojo")) {
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElementFac);
		} else if (color.equals("Verde")) {
			((JavascriptExecutor) getDriver()).executeScript(bordeVerde, webElementFac);
		}
	}

	/**
	 * Este metodo crea un borde rojo sobre un elemento de la pagina
	 * 
	 * @param webElementFac Elemento que se bordeara
	 */

	public void bordearElemento(WebElementFacade webElementFac) {
		((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElementFac);
	}

	/**
	 * Este metodo rellena de color rojo un elemento
	 * 
	 * @param strXptElemento xpath del elemento que se bordea
	 */
	public void pintarElemento(String strXptElemento) {
		WebElement webElemeBordear = find(By.xpath(strXptElemento));
		((JavascriptExecutor) getDriver()).executeScript(rellenoRojo, webElemeBordear);
	}

	/**
	 * Este metodo rellena de color rojo un elemento
	 * 
	 * @param webElementFac Elemento que se bordea
	 */
	public void pintarElemento(WebElementFacade webElementFac) {
		((JavascriptExecutor) getDriver()).executeScript(rellenoRojo, webElementFac);
	}

	/**
	 * 
	 * @param strXpath
	 * @param bordearElemento
	 * @param tomarScreenshot
	 */
	public void moverPantallahastaElemento(String strXpathElemento, boolean bordearElemento, boolean tomarScreenshot) {
		try {
			WebElement webElement = findBy(strXpathElemento);
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", webElement);
		} catch (JavascriptException jE) {
			System.out.println("No se movio la pantalla hacia el elemento con xpath: " + strXpathElemento);
		}
		if (bordearElemento)
			bordearElemento(strXpathElemento);
		if (tomarScreenshot)
			Serenity.takeScreenshot();

	}

	/**
	 * 
	 * @param webElementFac
	 * @param bordearElemento
	 * @param tomarScreenshot
	 */
	public void moverPantallahastaElemento(WebElementFacade webElementFac, boolean bordearElemento,
			boolean tomarScreenshot) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", webElementFac);
		} catch (JavascriptException jE) {
			System.out.println("No se movio la pantalla hacia el elemento con xpath: " + webElementFac.getTagName());
		}
		if (bordearElemento)
			bordearElemento(webElementFac);
		if (tomarScreenshot)
			Serenity.takeScreenshot();
	}

	/**
	 * extrer elemento de un text
	 * 
	 * @param wbeElement
	 * @param blnBordearElemento
	 * @param blnTomarScreenshot
	 */
	public String extrerTexto(By byElement, boolean blnBordearElemento, boolean blnTomarScreenshot) {
		WebElementFacade wbeElement = element(byElement);
		waitFor(wbeElement);
		if (blnBordearElemento)
			bordearElemento(wbeElement);
		if (blnTomarScreenshot)
			Serenity.takeScreenshot();

		return wbeElement.getText();
	}

	/**
	 * Click de un elemento
	 * 
	 * @param wbeElement
	 * @param blnBordearElemento
	 * @param blnTomarScreenshot
	 */
	public void click(WebElementFacade wbeElement, boolean blnBordearElemento, boolean blnTomarScreenshot) {
		waitFor(wbeElement);
		if (blnBordearElemento)
			bordearElemento(wbeElement);
		if (blnTomarScreenshot)
			Serenity.takeScreenshot();
		wbeElement.click();
	}

	/**
	 * Click de un elemento
	 * 
	 * @param wbeElement
	 * @param blnBordearElemento
	 * @param blnTomarScreenshot
	 */
	public void click(By byElement, boolean blnBordearElemento, boolean blnTomarScreenshot) {
		WebElementFacade wbeElement = element(byElement);
		waitFor(wbeElement);
		if (blnBordearElemento)
			bordearElemento(wbeElement);
		if (blnTomarScreenshot)
			Serenity.takeScreenshot();
		wbeElement.click();
	}

	public void typeAndTab(By byElement, String strValor, boolean blnBordearElemento, boolean blnTomarScreenshot) {
		WebElementFacade wbeElement = element(byElement);
		waitFor(wbeElement);
		wbeElement.typeAndTab(strValor);
		if (blnBordearElemento)
			bordearElemento(wbeElement);
		if (blnTomarScreenshot)
			Serenity.takeScreenshot();
	}

	/**
	 * Escribir testo en un elelmento
	 * 
	 * @param wbeElement
	 * @param valor
	 * @param blnBordearElemento
	 * @param blnTomarScreenshot
	 */
	public void sendKeys(WebElementFacade wbeElement, String valor, boolean blnBordearElemento,
			boolean blnTomarScreenshot) {
		waitFor(wbeElement);
		wbeElement.click();
		wbeElement.clear();
		wbeElement.sendKeys(valor);
		if (blnBordearElemento)
			bordearElemento(wbeElement);
		if (blnTomarScreenshot)
			Serenity.takeScreenshot();
	}

	/**
	 * Escribir testo en un elelmento
	 * 
	 * @param wbeElement
	 * @param valor
	 * @param blnBordearElemento
	 * @param blnTomarScreenshot
	 */
	public void sendKeys(By byElement, String valor, boolean blnBordearElemento, boolean blnTomarScreenshot) {
		WebElementFacade wbeElement = element(byElement);
		waitFor(wbeElement);
		wbeElement.click();
		wbeElement.clear();
		wbeElement.sendKeys(valor);
		if (blnBordearElemento)
			bordearElemento(wbeElement);
		if (blnTomarScreenshot)
			Serenity.takeScreenshot();
	}

	public void waitForPageLoad() {

		Wait<WebDriver> wait = new WebDriverWait(getDriver(), 30);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				System.out.println("Current Window State       : "
						+ String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}

	public void waitForPageLoad2() {
		boolean cargoPagina = false;
		while (cargoPagina == false) {
			String complete = String
					.valueOf(((JavascriptExecutor) getDriver()).executeScript("return document.readyState"));
			System.out.println("Current Window State       : " + complete);
			cargoPagina = complete.equals("complete");
		}
	}

	/**
	 * Metodo de cambio de frame segun el numero del frame
	 * 
	 * @param frame numero del frame
	 */
	public void cambioDeFrame(int frame) {
		getDriver().switchTo().frame(frame);
	}

	/**
	 * Metodo de cambio de frame segun el numero del frame
	 * 
	 * @param frame numero del frame
	 */
	public void cambioDeFrame(By byFrame) {
		WebDriver d = this.getDriver();
		getDriver().switchTo().frame(d.findElement(byFrame));
	}

	/**
	 * Metodo de cambio de frame al de defecto
	 */
	public void cambioDeFrameDefault() {
		getDriver().switchTo().defaultContent();
	}

	/**
	 * Este metodo espera a que un elemento este visible
	 * 
	 * @param xpath elemento que se requiere esperar a que sea visible
	 * @return retorna true o false si el elemento esta o no visible
	 */
	public boolean esperoElementoVisible(By xpath) {
		esperaCargarPagina();
		WebDriverWait espera = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
		espera.until(ExpectedConditions.visibilityOfElementLocated(xpath));
		if (element(xpath).isVisible()) {
			return true;
		}
		return false;
	}

	/**
	 * Este metodo espera a que un elemento este Habilitado * @param xpath elemento
	 * que se requiere esperar a que sea visible
	 * 
	 * @return retorna true o false si el elemento esta o no presente
	 */
	public boolean esperoElementoHabilitado(By xpath) {
		esperaCargarPagina();
		WebDriverWait espera = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
		espera.until(ExpectedConditions.elementToBeClickable(xpath));
		if (element(xpath).isEnabled()) {
			return true;
		}
		return false;
	}

	/**
	 * Este metodo espera a que un elemento este presente en la pagina
	 * 
	 * @param xpath elemento que se requiere esperar a que sea visible
	 * @return retorna true o false si el elemento esta o no presente
	 */
	public boolean esperoElementoPresente(By xpath) {
		esperaCargarPagina();
		WebDriverWait espera = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
		espera.until(ExpectedConditions.presenceOfElementLocated(xpath));
		if (element(xpath).isPresent()) {
			return true;
		}
		return false;
	}

	/**
	 * Este metodo espera a que un elemento este presente en la pagina
	 * 
	 * @param xpath elemento que se requiere esperar a que sea visible
	 * @return retorna true o false si el elemento esta o no presente
	 */
	public boolean esperoElementoClickable(By xpath) {
		esperaCargarPagina();
		WebDriverWait espera = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
		espera.until(ExpectedConditions.elementToBeClickable(xpath));
		if (element(xpath).isClickable()) {
			return true;
		}
		return false;
	}

	/**
	 * Espera a que carge todos los objetos de la pagina
	 */
	public void esperaCargarPagina() {
		int intTimer = 60;
		new WebDriverWait(getDriver(), intTimer).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
				.executeScript("return document.readyState").equals("complete"));
	}

	/**
	 * Metodo de esperar tiempo en segundos
	 * 
	 * @param tiempo
	 */
	public void esperaTiempoSegundos(int tiempo) {
		waitFor(tiempo).seconds();
	}

	/**
	 * Metodo para calcular el tiempo del serenity properties
	 * 
	 * @return retorna el tiempo en segundo del serenity
	 */
	public int obtenerTiempoSerenity() {
		return (Integer
				.parseInt(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEBDRIVERTIMEOUT)))
				/ 1000;
	}

	/**
	 * Selecciona una opcion de una un objeto lista desplegable
	 * 
	 * @param byPadre localizador de la lista deplegable
	 * @param byHijo  localizador del objeto hijo o opcion de la lista
	 */
	public void seleccionarLista(By byPadre, By byHijo) {
		WebElementFacade wbeElPadre = element(byPadre);
		WebElementFacade wbeElHijo = element(byHijo);
		esperoElementoClickable(byPadre);
		wbeElPadre.click();
		//wbeElPadre.click();
		esperoElementoPresente(byHijo);
		esperoElementoVisible(byHijo);
		esperoElementoClickable(byHijo);
		wbeElHijo.click();
	}

	public void verificarBusqueda(WebElementFacade webElemento) throws Exception {
		// try {
		assertThat(webElemento.isCurrentlyVisible(), is(true));

		/*
		 * if (!webElemento.isCurrentlyVisible()) throw new Exception("Error"); throw
		 * new Exception("No cargo");
		 */

		// Serenity.takeScreenshot();
		Serenity.setSessionVariable("Estado").to("SUCCESS");
		/*
		 * } catch (Exception e) { Serenity.takeScreenshot();
		 * Serenity.recordReportData().withTitle("Error en el caso").
		 * andContents("Error Ejemplo");
		 * fail("Error al selecionar la opcion ir a pagar: " + e.getMessage()); }
		 */
		// Serenity.takeScreenshot();
	}

	/**
	 * Método que cierra la página actualmente abierta
	 */
	public void cerrarPagina() {
		getDriver().close();

	}

	/**
	 * verifica si un elemento esta presente en la pagina
	 * 
	 * @param by localizador del elemento
	 */
	public void verificarElementoPresente(By byElement) {

		String strMensaje = extrerTexto(byElement, true, false);
		assertThat(strMensaje, is("Popup Validation"));
	}

	public void verificartexto(By element, String strTextoAComparar) {
		Ensure.that(element).text().isEqualTo(strTextoAComparar);
	}

	public void verificarelementovisible(By element) {
		Ensure.that(element).isDisplayed();
	}
}
