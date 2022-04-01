package br.com.JMAfricoCursos.appium.core;

import org.junit.After;
import org.junit.AfterClass;

public class BaseTest {

	@After
	public void finalizaTeste() {
		DriverFactory.getDriver().resetApp();
	} 
	
	@AfterClass
	public static void finalizaClasse() {
		DriverFactory.killDriver();
	}
}
