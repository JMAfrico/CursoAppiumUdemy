package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AbasPage extends BasePage {

	ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void clicarPrimeiraAba() {
		screenshotTest.getScreenShot("Clicar em 'Aba 1'");
		String value = "Aba 1";
		clickByText(value);	
	}
	
	public void clicarSegundaAba() {
		screenshotTest.getScreenShot("Clicar em 'Aba 2'");
		String value = "Aba 2";
		clickByText(value);	
	}

	public boolean verificarPrimeiraAbaSelecionada() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Este é o conteúdo da Aba 1' ");
		String value = "Este é o conteúdo da Aba 1";
		return isExistByText(value);		
	}
	
	public boolean verificarSegundaAbaSelecionada() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Este é o conteúdo da Aba 2' ");
		String value = "Este é o conteúdo da Aba 2";
		return isExistByText(value);
	}
}
