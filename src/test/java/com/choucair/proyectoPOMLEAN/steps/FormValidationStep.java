package com.choucair.proyectoPOMLEAN.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.choucair.proyectoPOMLEAN.pageobjects.colorlibFormValidationPage;
import com.choucair.proyectoPOMLEAN.toolbox.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class FormValidationStep {
	AccionesWeb accionWeb;

	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
		for (int i = 0; i < data.get(id).size(); i++) {
			if (data.get(id).get(i) == null) {
				data.get(id).set(i, "");
			}
		}
		accionWeb.sendKeys(colorlibFormValidationPage.txtRequired, data.get(id).get(0).trim(), false, false);
		accionWeb.seleccionarLista(colorlibFormValidationPage.cmbSport1,
				colorlibFormValidationPage.setLS_HIJO_TIPO_DEPORTE(data.get(id).get(1).trim()));
		accionWeb.click(colorlibFormValidationPage.set_HIJO_TIPO_DEPORTE2(data.get(id).get(2).trim()), false, false);
		accionWeb.click(colorlibFormValidationPage.set_HIJO_TIPO_DEPORTE2(data.get(id).get(3).trim()), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtUrl1, data.get(id).get(4).trim(), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtEmail1, data.get(id).get(5).trim(), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtPass1, data.get(id).get(6).trim(), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtPass2, data.get(id).get(7).trim(), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtMinsize, data.get(id).get(8).trim(), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtMaxsize, data.get(id).get(9).trim(), false, false);
		if (accionWeb.verificarNumero(colorlibFormValidationPage.txtNumber)) {
			accionWeb.sendKeys(colorlibFormValidationPage.txtNumber, data.get(id).get(10).trim(), false, false);
		}
		accionWeb.sendKeys(colorlibFormValidationPage.txtNumber, data.get(id).get(10).trim(), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtIp, data.get(id).get(11).trim(), false, false);
		accionWeb.sendKeys(colorlibFormValidationPage.txtDate, data.get(id).get(12).trim(), false, false);
		// accionWeb.verificarFecha(colorlibFormValidationPage.txtDate);
		accionWeb.verificarYear(colorlibFormValidationPage.txtDate);
		/*
		 * if(accionWeb.verificarFecha2(data.get(id).get(12).trim())) {
		 * accionWeb.sendKeys(colorlibFormValidationPage.txtDate,data.get(id).get(12).
		 * trim(), false, false); }
		 */

		accionWeb.sendKeys(colorlibFormValidationPage.txtDateEarlier, data.get(id).get(13).trim(), false, false);
		accionWeb.click(colorlibFormValidationPage.btnValidate, false, true);
	}

	@Step
	public void verificar_ingreso_datos_formulario_con_errores() {
		accionWeb.verificarelementovisible(colorlibFormValidationPage.globoInformativo);
	}

	@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
		accionWeb.verificartexto(colorlibFormValidationPage.globoInformativo, "* This field is required");
	}

}
