package com.choucair.proyectoPOMLEAN.pageobjects;

import org.openqa.selenium.By;

public class LoginPageObjects {

	public static final By TXT_USUARIO = By.xpath("//input[@placeholder='Username']");
	public static final By TXT_CLAVE = By.xpath("//input[@type='password' and @placeholder=\\\"Password\\\"]");;
	public static final By BTN_INICIO = By.xpath("//*[@id='login']/form/button");;

}
