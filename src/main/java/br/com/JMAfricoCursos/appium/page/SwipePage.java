package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class SwipePage extends BasePage{
	
	ScreenshotTest screenshotTest = new ScreenshotTest();

	public boolean verificarTextoPaginaUm() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Mova a tela para a esquerda' ");
		String value = "Mova a tela para";
		return isExistByText(value);
	}
	
	public boolean verificarTextoPaginaDois() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'E veja se você consegue' ");
		String value = "E veja se";
		return isExistByText(value);
	}
	
	public boolean verificarTextoPaginaTres() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Chegar até o fim!' ");
		String value = "Chegar até o fim!";
		return isExistByText(value);
	}
	
	public void moverParaLadoEsquerdo() {
		screenshotTest.getScreenShot("Slide para 'esquerda'");
		appiumSwipeLeft();
	}
	
	public void moverParaLadoDireito() {
		screenshotTest.getScreenShot("Slide para 'direita'");
		appiumSwipeRight();
	}
}
