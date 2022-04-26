package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class AccordionPage extends BasePage{

	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	private By txtOpcaoUm = By.xpath("//*[@text='Op��o 1']/../../following-sibling::android.view.ViewGroup//android.widget.TextView");
	
	public boolean validarExisteOpcaoUm() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Op��o 1' ");
		String value = "Op��o 1";
		return isExistByText(value);
	}
	
	public String getTextoOpcaoUm() {
		screenshotTest.getScreenShot("Buscar texto da 'Op��o 1'");
		return getText(txtOpcaoUm);
	}

	public void clicarOpcaoUm() {
		screenshotTest.getScreenShot("Clicar em 'Op��o 1'");
		String value = "Op��o 1";
		clickByText(value);		
	}

	public boolean validarTextOpcaoUm() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Esta � a descri��o da op��o 1' ");
		String value = "Esta � a descri��o da op��o 1";
		return isExistByText(value);		
	}
}
