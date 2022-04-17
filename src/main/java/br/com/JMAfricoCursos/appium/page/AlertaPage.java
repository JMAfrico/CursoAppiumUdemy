package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AlertaPage extends BasePage{

	private ScreenshotTest screenshotTest = new ScreenshotTest();

	public void clicarAlertaConfirmar() {	
		screenshotTest.getScreenShot("Clicar em 'Alerta Confirm'");
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertaSimples() {	
		screenshotTest.getScreenShot("Clicar em 'Alerta Simples'");
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void clicarAlertaRestritivo() {	
		screenshotTest.getScreenShot("Clicar em 'Alerta Restritivo'");
		clicarPorTexto("ALERTA RESTRITIVO");
	}

	public void clicarConfirmarOperacao() {
		screenshotTest.getScreenShot("Clicar em 'Confirmar'");
		clicarPorTexto("CONFIRMAR");		
	}
	
	public void clicarEmOk() {
		screenshotTest.getScreenShot("Clicar em 'Ok'");
		clicarPorTexto("OK");		
	}

	public boolean validarAlertaConfirmado() {
		screenshotTest.getScreenShot("Validar Alerta 'Confirmado'");
		return verificarSeExistePorTexto("Confirmado");
	}
	
	public boolean validarTextAlertaRestritivo() {
		screenshotTest.getScreenShot("Validar Alerta 'Confirmado'");
		return verificarSeExistePorTexto("ALERTA RESTRITIVO");
	}

	public void clicarEmSair() {
		screenshotTest.getScreenShot("Clicar em 'Sair'");
		clicarPorTexto("SAIR");
	}

	public void clicarForaDoAlerta() {
		screenshotTest.getScreenShot("Clicar fora do alerta");
		clicarPorCoordenadas(100,150);		
	}
	
	public boolean validarMensagemInfoAlertaSimples() {
		screenshotTest.getScreenShot("Verificar se existe");
		return verificarSeExistePorTexto("Pode clicar no OK ou fora da caixa para sair");
	}
}
