package com.choucair.proyectoPOMLEAN.definition;

import com.choucair.proyectoPOMLEAN.steps.HomeStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomeDefinition {
	@Steps
	HomeStep homeStep;
	 @Given("^Ingreso a la funcionalidad Forms Validation$")
	    public void ingreso_a_la_funcionalidad_forms_validation() throws Exception {
	    	homeStep.ingresar_form_validarion();
	   }
}
