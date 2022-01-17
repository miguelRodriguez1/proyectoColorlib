package com.choucair.proyectoPOMLEAN.definition;



import java.io.IOException;

import com.choucair.proyectoPOMLEAN.steps.LoginStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {
	@Steps
	LoginStep loginStep;
	@Given("Autentico en colorlib con usuario {String} y clave {String}")
	public void Autentico_en_colorlib_con_usuario_y_clave(String usuario,String clave) throws IOException {
		loginStep.abrir();
		loginStep.ingresarCredenciales(usuario,clave);
	}
}
