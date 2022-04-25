package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class OpcaoEscondidaPage extends BasePage{
	
	ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void clicarOk() {
		screenshotTest.getScreenShot("Clicar em 'OK'");
		clicarPorTexto("OK");	
	}
	
	public boolean validarMensagemSucesso() {
		screenshotTest.getScreenShot("Validar Mensagem de sucesso");
		return verificarSeExistePorTexto("Você achou essa opção");

	}
}
