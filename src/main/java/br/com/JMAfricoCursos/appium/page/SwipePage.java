package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class SwipePage extends BasePage{
	
	ScreenshotTest screenshotTest = new ScreenshotTest();

	public boolean verificarTexto(String texto) {
		screenshotTest.getScreenShot("Verificar se existe o texto");
		return verificarSeExistePorTexto(texto);
	}
	
	public void moverParaLadoEsquerdo() {
		screenshotTest.getScreenShot("Mover para esquerda");
		AppiumSwipeLeft();
	}
	
	public void moverParaLadoDireito() {
		screenshotTest.getScreenShot("Mover para direita");
		AppiumSwipeRight();
	}
}
