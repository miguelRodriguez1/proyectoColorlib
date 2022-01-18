package com.choucair.proyectoPOMLEAN;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import com.choucair.proyectoPOMLEAN.toolbox.FeatureOverright;

import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class RunnerFeatures {
	@Before
	public void test() throws Exception {
		switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
		case "chrome":
			// WebDriverManager.chromedriver().forceDownload();
			WebDriverManager.chromedriver().setup();
			break;
		case "ie":
		case "iexplorer":
			WebDriverManager.iedriver().setup();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			break;
			
		}
		FeatureOverright.overrideFeatureFiles("src/test/resources/features/proyectoPOMLEAN/Forms/");
	}

	@Test
	public void testRunner() {
		JUnitCore.runClasses(CRunnerPedido.class);
	}

	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(features = "src/test/resources/features/proyectoPOMLEAN/Forms/proyectoPOMLEAN.feature", 
			tags = "@Regresion" ,glue = "com.choucair.proyectoPOMLEAN.definition")
	public class CRunnerPedido {

	}
}