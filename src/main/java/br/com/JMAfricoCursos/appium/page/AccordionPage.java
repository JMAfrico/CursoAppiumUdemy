package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AccordionPage extends BasePage{

	private By txtOpcaoUm = By.xpath("//*[@text='Op��o 1']/../../following-sibling::android.view.ViewGroup//android.widget.TextView");
	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public boolean verificarSeExisteOpcaoUm() {
		screenshotTest.getScreenShot("Verificar se existe 'Op��o 1'");
		return verificarSeExistePorTexto("Op��o 1");
	}
	
	public String getTextoOpcaoUm() {
		screenshotTest.getScreenShot("Obter texto da 'Op��o 1'");
		return obterTexto(txtOpcaoUm);
	}

	public void clicarOpcaoUm() {
		screenshotTest.getScreenShot("Clicar em 'Op��o 1'");
		clicarPorTexto("Op��o 1");		
	}

	public boolean validarTextoOpcaoUm() {
		screenshotTest.getScreenShot("Verificar texto da 'Op��o 1'");
		return verificarSeExistePorTexto("Esta � a descri��o da op��o 1");		
	}
}
