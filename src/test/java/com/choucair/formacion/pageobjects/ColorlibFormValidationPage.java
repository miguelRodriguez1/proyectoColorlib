package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import cucumber.api.java.it.Dato;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibFormValidationPage extends PageObject{
	@FindBy(xpath = "//*[@id='req']")
	public WebElementFacade txtRequired;
	@FindBy(xpath = "//*[@id='sport']")
	public WebElementFacade cmbSport1;
	@FindBy(xpath = "//*[@id='url1']")
	public WebElementFacade txtUrl1;
	@FindBy(id="email1")
	public WebElementFacade txtEmail1;
	@FindBy(id="pass1")
	public WebElementFacade txtPass1;
	@FindBy(id="pass2")
	public WebElementFacade txtPass2;
	@FindBy(id="maxsize1")
	public WebElementFacade txtMaxsize1;
	@FindBy(name="maxsize1")
	public WebElementFacade txtMaxsize;
	@FindBy(id="number2")
	public WebElementFacade txtNumber;
	@FindBy(id="ip")
	public WebElementFacade txtIp;
	@FindBy(id="date3")
	public WebElementFacade txtDate;
	@FindBy(id="past")
	public WebElementFacade txtDateEarlier;
	@FindBy(xpath = "//*[id='sport2']")
	public WebElementFacade cmbSport2;
	@FindBy(xpath = "//*[@id='popup-validation']/div[14]/input")
	public WebElementFacade btnValidate;
	@FindBy(xpath = "(//DIV[@class='formErrorContent'])[1]")
	public WebElementFacade globoInformativo;
	public void validate() {
		btnValidate.click();
	}
	public void Required(String datoPrueba) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(datoPrueba);
	}
	public void Select_Sport(String datpPrueba) {
		cmbSport1.click();
		cmbSport1.deselectByVisibleText(datpPrueba);
	}
	
	public void url(String datoPrueba) {
		txtUrl1.click();
		txtUrl1.clear();
		txtUrl1.sendKeys(datoPrueba);
	}
	
	public void email(String datoPrueba) {
		txtEmail1.click();
		txtEmail1.clear();
		txtEmail1.sendKeys(datoPrueba);
	}
	public void password(String datoPrueba) {
		txtPass1.click();
		txtPass1.clear();
		txtPass1.sendKeys(datoPrueba);
	}
	public void confirm_password(String datoPrueba) {
		txtPass2.click();
		txtPass2.clear();
		txtPass2.sendKeys(datoPrueba);
	}
	public void minimun_field_size(String datoPrueba) {
		txtMaxsize1.click();
		txtMaxsize1.clear();
		txtMaxsize1.sendKeys(datoPrueba);
	}
	public void maximun_field_size(String datoPrueba) {
		txtMaxsize.click();
		txtMaxsize.clear();
		txtMaxsize.sendKeys(datoPrueba);
	}
	public void number(String datoPrueba) {
		txtNumber.click();
		txtNumber.clear();
		txtNumber.sendKeys(datoPrueba);
	}
	public void ip(String datoPrueba) {
		txtIp.click();
		txtIp.clear();
		txtIp.sendKeys(datoPrueba);
	}
	public void date(String datoPrueba) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(datoPrueba);
	}
	public void date_earlier(String datoPrueba) {
		txtDateEarlier.click();
		txtDateEarlier.clear();
		txtDateEarlier.sendKeys(datoPrueba);
	}
	public void Multiple_Select(String datoPrueba) {
		cmbSport2.selectByVisibleText(datoPrueba);
	}
	public void form_sin_errores() {
		assertThat(globoInformativo.isCurrentlyVisible(),is(false));
			
	}
	public void form_con_errores() {
		assertThat(globoInformativo.isCurrentlyVisible(),is(true));
	}
	
	
	
}
