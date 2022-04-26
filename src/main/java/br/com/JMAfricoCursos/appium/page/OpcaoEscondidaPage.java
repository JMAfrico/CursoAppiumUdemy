package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class OpcaoEscondidaPage extends BasePage{
	
	ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void clicarOk() {
		screenshotTest.getScreenShot("Clicar em 'OK'");
		String value = "OK";
		clickByText(value);	
	}
	
	public boolean validarMensagemSucesso() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Você achou essa opção' ");
		String value = "Você achou essa opção";
		return isExistByText(value);
	}
}
