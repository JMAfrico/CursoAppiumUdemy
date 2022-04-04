package br.com.JMAfricoCursos.appium.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

public class BaseTest {
	
	public Long start;
	private Long end;
	public static String getNomeMetodo;
	
	@Rule
	public TestName testName = new TestName();
 	
	@Before
	public void inicializandoClasse() {
		start = System.currentTimeMillis();
		System.out.println("\n----------AUTOMAÇÃO INICIADA----------");
		System.out.println("----Iniciando execução do teste >>>>>> " + testName.getMethodName());		
		getNomeMetodo = testName.getMethodName();
	}

	@After
	public void finalizaTeste() {
		end = System.currentTimeMillis();
		System.out.println("----Execução do teste: '" + testName.getMethodName() + "' Finalizada.");
		System.out.println("----Duração do teste:" + (end - start)+"ms");
		//Status();
		//getScreenShot();
		DriverFactory.getDriver().resetApp();
	}

	@AfterClass
	public static void finalizaClasse() {
		System.out.println("\n----------AUTOMAÇÃO FINALIZADA----------");
		DriverFactory.killDriver();
	}

	
//	public void getScreenShot() {
//		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(imagem, new File("target/screenshots/" + testName.getMethodName() + ".png"));
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}

//	public void Status() {
//		if (result.wasSuccessful()) {
//			System.out.println("----Resultado da execução: Passou----------");
//		} else {
//			System.out.println("----Resultado da execução: Falhou----------");
//		}
//	}
}
