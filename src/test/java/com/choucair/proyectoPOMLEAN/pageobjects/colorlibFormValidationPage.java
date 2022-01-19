package com.choucair.proyectoPOMLEAN.pageobjects;
import org.openqa.selenium.By;
public class colorlibFormValidationPage {
	public static final By lnlValidation=By.xpath("(//H5)[2]");
	public static final By txtRequired =  By.xpath("//input[@id='req']");
	public static By BTN_HIJO_TIPO_HORA =  By.xpath("//option[text()='REEMPLAZAR']");
	public static final By cmbSport1 =  By.xpath("//select[@id='sport']");
	public static final By txtUrl1 =  By.xpath("//input[@id='url1']");
	public static final By txtEmail1 =  By.xpath("//input[@id='email1']");
	public static final By txtPass1 =  By.xpath("//input[@id='pass1']");
	public static final By txtPass2 =  By.xpath("//input[@id='pass2']");
	public static final By txtMinsize =  By.xpath("//input[@id='minsize1']");
	public static final By txtMaxsize =  By.xpath("//input[@id='maxsize1']");
	public static final By txtNumber =  By.xpath("//input[@id='number2']");
	public static final By txtIp =  By.xpath("//input[@id='ip']");
	public static final By txtDate =  By.xpath("//input[@id='date3']");
	public static final By txtDateEarlier =  By.xpath("//input[@id='past']");
	public static final By cmbSport2 =  By.xpath("//select[@id='sport2']");
	
	
	public static By btnValidate =  By.xpath("//*[@id='popup-validation']/div[14]/input");
	public static final By globoInformativo =  By.xpath("(//DIV[@class='formErrorContent'])[1]");
	public static By setLS_HIJO_TIPO_DEPORTE(String strTextoReemplazar) {
		BTN_HIJO_TIPO_HORA =  By.xpath("//*[@id='sport']//child::option[text()='REEMPLAZAR']".replace("REEMPLAZAR", strTextoReemplazar));;
		 return BTN_HIJO_TIPO_HORA;
	}
	public static By set_HIJO_TIPO_DEPORTE2(String strTextoReemplazar) {
		BTN_HIJO_TIPO_HORA =  By.xpath("//*[@id='sport2']//child::option[text()='REEMPLAZAR']".replace("REEMPLAZAR", strTextoReemplazar));;
		 return BTN_HIJO_TIPO_HORA;
	}
	
	/*@FindBy(xpath = "")
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
	@FindBy(id="minsize1")
	public WebElementFacade txtMinsize;
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
	@FindBy(xpath = "//*[@id='sport2']")
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
		cmbSport1.selectByVisibleText(datpPrueba);
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
		txtMinsize.click();
		txtMinsize.clear();
		txtMinsize.sendKeys(datoPrueba);
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
	}*/
	
	
	
	
}
