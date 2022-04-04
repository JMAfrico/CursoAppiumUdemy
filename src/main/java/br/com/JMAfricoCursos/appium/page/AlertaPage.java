package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AlertaPage extends BasePage{

	private ScreenshotTest screenshotTest = new ScreenshotTest();

	public void clicarAlertaConfirmar() {	
		screenshotTest.getScreenShot("Clicar em 'Alerta Confirm'");
		clicarPorTexto("ALERTA CONFIRM");
	}

	public void clicarConfirmarOperacao() {
		screenshotTest.getScreenShot("Clicar em 'Confirmar'");
		clicarPorTexto("CONFIRMAR");		
	}

	public boolean validarAlertaConfirmado() {
		screenshotTest.getScreenShot("Validar Alerta 'Confirmado'");
		return verificarSeExistePorTexto("Confirmado");
	}

	public void clicarEmSair() {
		screenshotTest.getScreenShot("Clicar em 'Sair'");
		clicarPorTexto("SAIR");
	}
}
