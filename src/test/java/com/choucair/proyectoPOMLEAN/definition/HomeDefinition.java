package com.choucair.proyectoPOMLEAN.definition;

import com.choucair.proyectoPOMLEAN.steps.HomeStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomeDefinition {
	@Steps
	HomeStep homeStep;
	 @Given("^Ingreso a la funcionalidad Forms Validation$")
	    public void ingreso_a_la_funcionalidad_forms_validation()  {
	    	homeStep.ingresar_form_validarion();
	 }

	@Given("Ingreso a la funcionalidad de Tables")
		public void ingreso_a_la_funcionalidad_de_tables() {
			homeStep.ingresar_tablas();
		}
	}
