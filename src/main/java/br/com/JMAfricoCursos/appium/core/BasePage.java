package br.com.JMAfricoCursos.appium.core;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	protected void escrever(By by,String string) {		
		DriverFactory.getDriver().findElement(by).sendKeys(string);
	}
	
	protected String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	protected void clicar(By by) {		
		DriverFactory.getDriver().findElement(by).click();
	}
	
	protected void clicarPorTexto(String texto) {		
		DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).click();
	}
	
	protected void clicarCombo(By by,String valor) {		
		DriverFactory.getDriver().findElement(by).click();
		clicarPorTexto(valor);
	}
	
	protected boolean isCheckboxMarcado(By by) {
		return DriverFactory.getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
	protected boolean verificarSeExistePorTexto(String texto) {
		//return DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+texto+"'")).isDisplayed();
		List<MobileElement> findElements = DriverFactory.getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
		return findElements.size() > 0;
	}
	
	protected void clicarPorCoordenadas(int x , int y) {
		new TouchAction(DriverFactory.getDriver()).press(PointOption.point(x,y)).release().perform();
	}
	
	public static void esperar(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
