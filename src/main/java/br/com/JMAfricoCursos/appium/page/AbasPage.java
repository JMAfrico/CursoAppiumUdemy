package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AbasPage extends BasePage {

	ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void clicarPrimeiraAba() {
		screenshotTest.getScreenShot("Clicar em 'Aba 1'");
		clicarPorTexto("Aba 1");	
	}
	
	public void clicarSegundaAba() {
		screenshotTest.getScreenShot("Clicar em 'Aba 2'");
		clicarPorTexto("Aba 2");	
	}

	public boolean validarPrimeiraAbaSelecionada() {
		screenshotTest.getScreenShot("Validar 'Aba 1' Selecionada");
		return verificarSeExistePorTexto("Este é o conteúdo da Aba 1");
	}
	
	public boolean validarSegundaAbaSelecionada() {
		screenshotTest.getScreenShot("Validar 'Aba 2' Selecionada");
		return verificarSeExistePorTexto("Este é o conteúdo da Aba 2");
	}
}
