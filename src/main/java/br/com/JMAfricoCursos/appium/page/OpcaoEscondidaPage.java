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
		screenshotTest.getScreenShot("Verificar se existe o texto 'Voc� achou essa op��o' ");
		String value = "Voc� achou essa op��o";
		return isExistByText(value);
	}
}
