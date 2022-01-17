package com.choucair.proyectoPOMLEAN.steps;

import java.io.IOException;

import com.choucair.proyectoPOMLEAN.pageobjects.LoginPageObjects;
import com.choucair.proyectoPOMLEAN.toolbox.AccionesWeb;
import com.choucair.proyectoPOMLEAN.toolbox.Propiedades;

public class LoginStep {
	AccionesWeb accionWeb;
	
	public void abrir() throws IOException {
		Propiedades pro=new Propiedades("colorlib.properties");
		String srtUrl=pro.obtenerPropiedad("URL_ColorLib");
		accionWeb.ingresoURL(srtUrl);
		
	}

	public void ingresarCredenciales(String usuario, String clave) {
		accionWeb.sendKeys(LoginPageObjects.TXT_USUARIO, usuario ,true,false);
		accionWeb.sendKeys(LoginPageObjects.TXT_CLAVE, clave ,true,false );
		accionWeb.click(LoginPageObjects.BTN_INICIO, true,true );
		
	}

}
