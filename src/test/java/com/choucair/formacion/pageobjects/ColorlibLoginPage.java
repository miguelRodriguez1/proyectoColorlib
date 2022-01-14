package com.choucair.formacion.pageobjects;


import org.apache.tools.ant.filters.TokenFilter.ContainsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject{
	//campo usuario
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElementFacade txtUsername;
	//campo clave
	@FindBy(xpath = "//input[@type='password' and @placeholder=\"Password\"]")
	public WebElementFacade txtPassword;
	//boton
	@FindBy(xpath = "//*[@id='login']/form/button")
	public WebElementFacade btnSignIn;
	//label del home a verificar
	@FindBy(xpath = "//*[@id='bootstrap-admin-template']")
	public WebElementFacade lblHomePpal;
	
	
	public void IngresarDatos(String usuario, String clave) {
		txtUsername.sendKeys(usuario);
		txtPassword.sendKeys(clave);
		btnSignIn.click();
	}

	public void VerificaHome() {
		String labelv="Bootstrap-Admin-Template";
		String strMensaje=lblHomePpal.getText();
		assertThat(strMensaje, containsString(labelv));
	}

}
