package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AccordionPage extends BasePage{

	private By txtOpcaoUm = By.xpath("//*[@text='Opção 1']/../../following-sibling::android.view.ViewGroup//android.widget.TextView");
	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public boolean verificarSeExisteOpcaoUm() {
		screenshotTest.getScreenShot("Verificar se existe 'Opção 1'");
		return verificarSeExistePorTexto("Opção 1");
	}
	
	public String getTextoOpcaoUm() {
		screenshotTest.getScreenShot("Obter texto da 'Opção 1'");
		return obterTexto(txtOpcaoUm);
	}

	public void clicarOpcaoUm() {
		screenshotTest.getScreenShot("Clicar em 'Opção 1'");
		clicarPorTexto("Opção 1");		
	}

	public boolean validarTextoOpcaoUm() {
		screenshotTest.getScreenShot("Verificar texto da 'Opção 1'");
		return verificarSeExistePorTexto("Esta é a descrição da opção 1");		
	}
}
