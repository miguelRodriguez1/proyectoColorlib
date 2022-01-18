package com.choucair.proyectoPOMLEAN.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.choucair.proyectoPOMLEAN.pageobjects.HomePage;

import com.choucair.proyectoPOMLEAN.toolbox.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class HomeStep {
	
	AccionesWeb accionWeb;
	
	@Step
	public void ingresar_form_validarion() {
		accionWeb.click(HomePage.menu, true, false);
		accionWeb.click(HomePage.menuFormValidation, true, false);
		//accionWeb.verificarElementoPresente(HomePage.lblFormValidation);
	}
}
