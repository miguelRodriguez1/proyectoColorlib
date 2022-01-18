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
		public void diligenciar_popup_datos_tabla(List<List<String>> data , int id) {
			accionWeb.sendKeys(colorlibFormValidationPage.txtRequired,data.get(id).get(0).trim() , true, false);
			//accionWeb.click(colorlibFormValidationPage.cmbSport1, true, false);
			//accionWeb.click(colorlibFormValidationPage.setBTN_HIJO_TIPO_HORA(data.get(id).get(1).trim()), true, false);
			accionWeb.seleccionarLista(colorlibFormValidationPage.cmbSport1,colorlibFormValidationPage.setLS_HIJO_TIPO_DEPORTE(data.get(id).get(1).trim()) );
			
			accionWeb.click(colorlibFormValidationPage.set_HIJO_TIPO_DEPORTE2(data.get(id).get(2).trim()), true, false);
			accionWeb.click(colorlibFormValidationPage.set_HIJO_TIPO_DEPORTE2(data.get(id).get(3).trim()), true, false);
			
			accionWeb.sendKeys(colorlibFormValidationPage.txtUrl1,data.get(id).get(4).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtEmail1,data.get(id).get(5).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtPass1,data.get(id).get(6).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtPass2,data.get(id).get(7).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtMinsize,data.get(id).get(8).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtMaxsize,data.get(id).get(9).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtNumber,data.get(id).get(10).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtIp,data.get(id).get(11).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtDate,data.get(id).get(12).trim(), true, false);
			accionWeb.sendKeys(colorlibFormValidationPage.txtDateEarlier,data.get(id).get(13).trim(), true, false);
			accionWeb.click(colorlibFormValidationPage.btnValidate, true, true);
			/*accionWeb.esperoElementoPresente(colorlibFormValidationPage.cmbSport1);
			accionWeb.esperoElementoVisible(colorlibFormValidationPage.cmbSport1);
			accionWeb.typeAndTab(colorlibFormValidationPage.cmbSport1, data.get(id).get(1).trim(), true, false);
			accionWeb.seleccionarLista(colorlibFormValidationPage.cmbSport1, colorlibFormValidationPage.setBTN_HIJO_TIPO_HORA(data.get(id).get(1).trim()));
			*/
			//accionWeb.typeAndTab(colorlibFormValidationPage.cmbSport1, data.get(id).get(1).trim(), true, false);
		//	accionWeb.sendKeys(colorlibFormValidationPage.cmbSport1,data.get(id).get(1).trim(), true, false);
			
			/*colorlibFormValidationPage.Required(data.get(id).get(0).trim());
			colorlibFormValidationPage.Select_Sport(data.get(id).get(1).trim());
			colorlibFormValidationPage.Multiple_Select(data.get(id).get(2).trim());
			colorlibFormValidationPage.Multiple_Select(data.get(id).get(3).trim());
			colorlibFormValidationPage.url(data.get(id).get(4).trim());
			colorlibFormValidationPage.email(data.get(id).get(5).trim());
			colorlibFormValidationPage.password(data.get(id).get(6).trim());
			colorlibFormValidationPage.confirm_password(data.get(id).get(7).trim());
			colorlibFormValidationPage.minimun_field_size(data.get(id).get(8).trim());
			colorlibFormValidationPage.maximun_field_size(data.get(id).get(9).trim());
			colorlibFormValidationPage.number(data.get(id).get(10).trim());
			colorlibFormValidationPage.ip(data.get(id).get(11).trim());
			colorlibFormValidationPage.date(data.get(id).get(12).trim());
			colorlibFormValidationPage.date_earlier(data.get(id).get(13).trim());
			colorlibFormValidationPage.validate();*/

			
		}
		/*@Step 
		public void verificar_ingreso_datos_formulario_con_errores() {
			colorlibFormValidationPage.form_con_errores();
		}
		@Step
		public void verificar_ingreso_datos_formulario_exitoso() {
			colorlibFormValidationPage.form_sin_errores();
		}*/
		
	}

