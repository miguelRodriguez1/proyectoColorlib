package com.choucair.proyectoPOMLEAN.definition;

import java.util.List;

import com.choucair.proyectoPOMLEAN.steps.FormValidationStep;
import com.choucair.proyectoPOMLEAN.steps.popupValidationSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FormValidationDefinition {
	@Steps
	FormValidationStep formValidationStep;
	@When("^Diligencio formulario Popup Validation$")
	public void diligencio_Formulario_popup_validation(DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.asLists(String.class);
		for (int i = 1; i < data.size(); i++) {
			formValidationStep.diligenciar_popup_datos_tabla(data, i);
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	/*@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() throws Exception {
		formValidationStep.verificar_ingreso_datos_formulario_exitoso();
	}
	@Then("^Verificar que se presente Globo Informativo de validacion$")
	public void verificar_que_se_presente_Globo_Informativo_de_validacion() throws Exception {
		formValidationStep.verificar_ingreso_datos_formulario_con_errores();
	}*/

}
