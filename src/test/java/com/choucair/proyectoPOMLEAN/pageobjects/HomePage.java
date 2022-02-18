package com.choucair.proyectoPOMLEAN.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.choucair.proyectoPOMLEAN.steps.FormValidationStep;
import com.choucair.proyectoPOMLEAN.steps.HomeStep;
import com.choucair.proyectoPOMLEAN.steps.popupValidationSteps;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

public class HomePage extends PageObject{
	public static final By menu =By.xpath("//*[@id='menu']/li[6]/a");
	public static final By menuFormGenerals =By.xpath("//*[@id='menu']/li[6]/ul/li[1]/a");
	public static final By menuFormValidation =By.xpath("//*[@id='menu']/li[6]/ul/li[2]/a");
	public static final By lblFormValidation =By.xpath("//*[@id='content']/div/div/div[1]/div/div/header/h5");
	public static final By lblTables=By.xpath("//SPAN[@class='link-title'][text()='Tables']");
	
}
