package br.com.JMAfricoCursos.appium.core;

import org.openqa.selenium.By;

public class DSL {

	public void escrever(By by,String string) {		
		DriverFactory.getDriver().findElement(by).sendKeys(string);
	}
	
	public String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public void clicar(By by) {		
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarPorTexto(String texto) {		
		DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).click();
	}
	
	public void clicarCombo(By by,String valor) {		
		DriverFactory.getDriver().findElement(by).click();
		clicarPorTexto(valor);
	}
	
	public boolean isCheckboxMarcado(By by) {
		return DriverFactory.getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
}
