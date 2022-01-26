package com.choucair.proyectoPOMLEAN.pageobjects;

import org.openqa.selenium.By;

public class TablesPage {
	public static final By txtSearch =  By.xpath("//INPUT[@type='search']");
	public static By dato =  By.xpath("(//td[text()='REMPLAZAR'])[1]");
	public static final By alerta =null;
	public static By set_Dato(String strTextoReemplazar) {
		 dato =  By.xpath("(//td[text()='REEMPLAZAR'])[1]".replace("REEMPLAZAR", strTextoReemplazar));
		 return dato;
	}
}
