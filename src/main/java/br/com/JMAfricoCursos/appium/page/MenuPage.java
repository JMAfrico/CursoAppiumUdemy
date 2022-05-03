package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class MenuPage extends BasePage{
	
	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void clicarFormulario() {
		String step = "Clicar em 'Formulário' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Formulário";
		clickByText(value);
	}
	
	public void clicarSplash() {
		String step = "Clicar em Splash' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Splash";
		clickByText(value);
	}
	
	public void clicarAlerta() {
		String step = "Clicar em 'Alertas' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Alertas";
		clickByText(value);
	}
	
	public void clicarAbas() {
		String step = "Clicar em 'Abas' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Abas";
		clickByText(value);
	}
	
	public void clicarAccordion() {
		String step = "Clicar em 'Accordion' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Accordion";
		clickByText(value);
	}

	public void clicarOpcaoBemEscondida() {
		String step = "Clicar em 'Opção Bem escondida' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Opção bem escondida";
		appiumSlideDown();
		clickByText(value);	
	}

	public void clicarSwipe() {
		String step = "Clicar em 'Swipe' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Swipe";
		clickByText(value);		
	}
	
	public void clicarSwipeList() {
		String step = "Clicar em 'Swipe List' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Swipe List";
		clickByText(value);		
	}
	
	public void clicarDragAndDrop() {
		String step = "Clicar em 'Drag and drop' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "Drag and drop";
		appiumSlideDown();
		clickByText(value);		
	}
	
	public void clicarSeuBarrigaHibrido() {
		String step = "Clicar em 'Seu barriga híbrido' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "SeuBarriga Híbrido";
		clickByText(value);		
	}
	
	public void clicarSeuBarrigaNativo() {
		String step = "Clicar em 'Seu barriga nativo' de menu"; 
		screenshotTest.getScreenShot(step);
		String value = "SeuBarriga Nativo";
		clickByText(value);		
	}
}
