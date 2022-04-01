package br.com.JMAfricoCursos.appium.core;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import junit.framework.TestResult;

public class BaseTest {
	
	public Long start;
	private Long end;
	
	@Rule
	public TestName testName = new TestName();
 	public TestResult result = new TestResult();
 	
	@Before
	public void inicializandoClasse() {
		start = System.currentTimeMillis();
		System.out.println("\n----------AUTOMA��O INICIADA----------");
		System.out.println("----Iniciando execu��o do teste: " + testName.getMethodName());
	}

	@After
	public void finalizaTeste() {
		end = System.currentTimeMillis();
		System.out.println("----Execu��o do teste: '" + testName.getMethodName() + "' Finalizada.");
		System.out.println("----Dura��o do teste:" + (end - start)+"ms");
		//Status();
		getScreenShot();
		DriverFactory.getDriver().resetApp();
	}

	@AfterClass
	public static void finalizaClasse() {
		System.out.println("\n----------AUTOMA��O FINALIZADA----------");
		DriverFactory.killDriver();
	}

	
	public void getScreenShot() {
		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File("target/screenshots/" + testName.getMethodName() + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

//	public void Status() {
//		if (result.wasSuccessful()) {
//			System.out.println("----Resultado da execu��o: Passou----------");
//		} else {
//			System.out.println("----Resultado da execu��o: Falhou----------");
//		}
//	}
}
