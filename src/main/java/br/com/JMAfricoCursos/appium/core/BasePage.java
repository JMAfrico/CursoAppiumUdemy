package br.com.JMAfricoCursos.appium.core;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

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
		
	private void slide(double inicio , double fim) {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		int x = size.width / 2;//metade da tela horizontal
		int y_inicial = (int) (size.height * inicio);
		int y_final = (int) (size.height * fim);
		
		new TouchAction(DriverFactory.getDriver())
        .longPress(PointOption.point(x, y_inicial))
        .moveTo(PointOption.point(x, y_final))
        .release()
        .perform();
	}
	
	protected void AppiumSlideUp() {
		slide(0.1,0.9);
	}
	
	protected void AppiumSlideDown() {
		slide(0.9,0.1);
	}
	
	private void swipe(double inicio , double fim) {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		int y = size.height / 2;//metade da tela horizontal
		int x_inicial = (int) (size.width * inicio);
		int x_final = (int) (size.width * fim);
		
		new TouchAction(DriverFactory.getDriver())
        .longPress(PointOption.point(x_inicial,y))
        .moveTo(PointOption.point(x_final,y))
        .release()
        .perform();
	}
	
	protected void AppiumSwipeLeft() {
		swipe(0.1,0.9);
	}
	
	protected void AppiumSwipeRight() {
		swipe(0.9,0.1);
	}
	
	public static void esperar(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
