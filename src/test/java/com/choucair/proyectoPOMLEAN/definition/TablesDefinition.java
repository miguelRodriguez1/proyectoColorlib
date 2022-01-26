package com.choucair.proyectoPOMLEAN.definition;

import java.util.List;

import com.choucair.proyectoPOMLEAN.steps.TablesStep;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.matchers.DataTableHasTheSameRowsAs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TablesDefinition {
	@Steps
	TablesStep tableSteps;
	@When("ingresar el dato en el buscador de la tabla")
	public void ingresar_el_dato_en_el_buscador_de_la_tabla(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		for (int i = 1; i < data.size(); i++) {
			tableSteps.diligenciar_datos_tabla(data, i);
			//tableSteps.verificar_busqueda_exitosa();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

	@Then("Verificar busqueda exitosa")
	public void verificar_busqueda_exitosa(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		for (int i = 1; i < data.size(); i++) {
			//tableSteps.verificar_busqueda_exitosa(data,i);
			tableSteps.verificar_busqueda_exitosa(data,i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}

		
	}

	@Then("Verifico que se presente alerta")
	public void verifico_que_se_presente_alerta() {
		tableSteps.verificar_busqueda_con_errores();
	}

	
	
	
}
