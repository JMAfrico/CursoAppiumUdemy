package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class MenuPage extends BasePage{
	
	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void acessarFormulario() {
		screenshotTest.getScreenShot("Clicar em 'Formul�rio'");
		clicarPorTexto("Formul�rio");
	}
	
	public void acessarSplash() {
		screenshotTest.getScreenShot("Clicar em Splash'");
		clicarPorTexto("Splash");
	}
	
	public void acessarAlerta() {
		screenshotTest.getScreenShot("Clicar em 'Alertas'");
		clicarPorTexto("Alertas");
	}
	
	public void acessarAbas() {
		screenshotTest.getScreenShot("Clicar em 'Abas'");
		clicarPorTexto("Abas");
	}
	
	public void acessarAccordion() {
		screenshotTest.getScreenShot("Clicar em 'Accordion'");
		clicarPorTexto("Accordion");
	}
}
