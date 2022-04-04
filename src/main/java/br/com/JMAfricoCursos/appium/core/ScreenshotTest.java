package br.com.JMAfricoCursos.appium.core;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotTest extends TestName{
	
	String nomeMetodo = BaseTest.getNomeMetodo;
	LocalDate dataAtual = LocalDate.now();
	LocalTime horaAtual = LocalDateTime.now().toLocalTime();
	
	public void getScreenShot(String nomeStep) {
		try {			
			Thread.sleep(1000);
			File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);	
			FileUtils.copyFile(imagem, new File("target/screenshots/"+dataAtual+"/"+BaseTest.getNomeMetodo+"/"+nomeStep+".png"));
			System.out.println("Passo >>>> "+nomeStep);				
		} catch (InterruptedException | IOException e1) {
			e1.printStackTrace();
		}

	}
}
