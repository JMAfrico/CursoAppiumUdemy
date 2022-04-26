package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class MenuPage extends BasePage{
	
	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void clicarFormulario() {
		screenshotTest.getScreenShot("Clicar em 'Formulário' de menu");
		String value = "Formulário";
		clickByText(value);
	}
	
	public void clicarSplash() {
		screenshotTest.getScreenShot("Clicar em Splash' de menu");
		String value = "Splash";
		clickByText(value);
	}
	
	public void clicarAlerta() {
		screenshotTest.getScreenShot("Clicar em 'Alertas' de menu");
		String value = "Alertas";
		clickByText(value);
	}
	
	public void clicarAbas() {
		screenshotTest.getScreenShot("Clicar em 'Abas' de menu");
		String value = "Abas";
		clickByText(value);
	}
	
	public void clicarAccordion() {
		screenshotTest.getScreenShot("Clicar em 'Accordion' de menu");
		String value = "Accordion";
		clickByText(value);
	}

	public void clicarOpcaoBemEscondida() {
		screenshotTest.getScreenShot("Clicar em 'Opção Bem escondida' de menu");
		String value = "Opção bem escondida";
		appiumSlideDown();
		clickByText(value);	
	}

	public void clicarSwipe() {
		screenshotTest.getScreenShot("Clicar em 'Swipe' de menu");
		String value = "Swipe";
		clickByText(value);		
	}
}
