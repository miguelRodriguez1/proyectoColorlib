package com.choucair.proyectoPOMLEAN.steps;

import java.util.List;

import com.choucair.proyectoPOMLEAN.pageobjects.TablesPage;
import com.choucair.proyectoPOMLEAN.pageobjects.colorlibFormValidationPage;
import com.choucair.proyectoPOMLEAN.toolbox.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class TablesStep {
	AccionesWeb accionWeb;
	@Step
	public void diligenciar_datos_tabla(List<List<String>> data, int id) {
		for (int i = 0; i < data.get(id).size(); i++) {
			if (data.get(id).get(i) == null) {
				data.get(id).set(i, "");
			}
		}
		accionWeb.sendKeys(TablesPage.txtSearch, data.get(id).get(0).trim(), true, false);
	}
	@Step
	public void verificar_busqueda_con_errores() {
		accionWeb.verificarelementovisible(TablesPage.alerta);
	}

	@Step
	public void verificar_busqueda_exitosa(List<List<String>> data,int id) {
		accionWeb.esperoElementoPresente(TablesPage.set_Dato(data.get(id).get(0).trim()));
	}
}
