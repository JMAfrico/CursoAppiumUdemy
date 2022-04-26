package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AlertaPage extends BasePage{

	private ScreenshotTest screenshotTest = new ScreenshotTest();

	public void clicarAlertaConfirmar() {	
		screenshotTest.getScreenShot("Clicar em 'Alerta Confirm'");
		String value = "ALERTA CONFIRM";
		clickByText(value);
	}
	
	public void clicarAlertaSimples() {	
		screenshotTest.getScreenShot("Clicar em 'Alerta Simples'");
		String value = "ALERTA SIMPLES";
		clickByText(value);
	}
	
	public void clicarAlertaRestritivo() {	
		screenshotTest.getScreenShot("Clicar em 'Alerta Restritivo'");
		String value = "ALERTA RESTRITIVO";
		clickByText(value);
	}

	public void clicarConfirmarOperacao() {
		screenshotTest.getScreenShot("Clicar em 'Confirmar'");
		String value = "CONFIRMAR";
		clickByText(value);		
	}
	
	public void clicarOk() {
		screenshotTest.getScreenShot("Clicar em 'Ok'");
		String value = "OK";
		clickByText(value);		
	}

	public boolean validarAlertaConfirmado() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Confirmado' ");
		String value = "Confirmado";
		return isExistByText(value);
	}
	
	public boolean validarTextAlertaRestritivo() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'ALERTA RESTRITIVO' ");
		String value = "ALERTA RESTRITIVO";
		return isExistByText(value);
	}

	public void clicarSair() {
		screenshotTest.getScreenShot("Clicar em 'Sair'");
		String value = "SAIR";
		clickByText(value);
	}

	public void clicarForaDoAlerta() {
		screenshotTest.getScreenShot("Clicar fora do alerta");
		clickByCoordenadas(100,150);		
	}
	
	public boolean validarMensagemInfoAlertaSimples() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Pode clicar no OK ou fora da caixa para sair' ");
		String value = "Pode clicar no OK ou fora da caixa para sair";
		return isExistByText(value);
	}
}
