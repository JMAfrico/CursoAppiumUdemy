package br.com.JMAfricoCursos.appium.core;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	protected void write(By by,String string) {		
		DriverFactory.getDriver().findElement(by).sendKeys(string);
	}
	
	protected String getText(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}	
	
	protected void clickElement(By by) {		
		DriverFactory.getDriver().findElement(by).click();
	}
	
	protected void clickElementLongPress(String texto) {		
		MobileElement inicio = DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+texto+"']"));
		
		TouchAction press = new TouchAction(DriverFactory.getDriver())
				.longPress(ElementOption.element(inicio))
				.release()
				.perform();
	}
	
	protected void clickByText(String texto) {		
		DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).click();
	}
	
	protected void clickCombo(By by,String valor) {		
		DriverFactory.getDriver().findElement(by).click();
		clickByText(valor);
	}
	
	protected void clickByCoordenadas(int x , int y) {
		new TouchAction<>(DriverFactory.getDriver()).press(PointOption.point(x,y)).release().perform();
	}
	
	protected boolean isCheckboxMarcado(By by) {
		return DriverFactory.getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
	protected boolean isExistByText(String texto) {
		List<MobileElement> findElements = DriverFactory.getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
		return findElements.size() > 0;
	}
	
	private void appiumSlide(double inicio , double fim) {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		int x = size.width / 2;
		int y_inicial = (int) (size.height * inicio);
		int y_final = (int) (size.height * fim);
		
		new TouchAction<>(DriverFactory.getDriver())
        .longPress(PointOption.point(x, y_inicial))
        .moveTo(PointOption.point(x, y_final))
        .release()
        .perform();
	}
	
	protected void appiumSlideUp() {
		appiumSlide(0.1,0.9);
	}
	
	protected void appiumSlideDown() {
		appiumSlide(0.9,0.1);
	}
	
	private void appiumSwipe(double inicio , double fim) {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		int y = size.height / 2;
		int x_inicial = (int) (size.width * inicio);
		int x_final = (int) (size.width * fim);
		
		new TouchAction<>(DriverFactory.getDriver())
        .longPress(PointOption.point(x_inicial,y))
        .moveTo(PointOption.point(x_final,y))
        .release()
        .perform();
	}
	
	protected void appiumSwipeLeft() {
		appiumSwipe(0.1,0.9);
	}
	
	protected void appiumSwipeRight() {
		appiumSwipe(0.9,0.1);
	}
	
	private void appiumSwipeElement(MobileElement element, double inicio , double fim) {		
		int y = element.getLocation().y + (element.getSize().height/2);
		
		int x_inicial = (int) (element.getSize().width * inicio);
		int x_final = (int) (element.getSize().width * fim);
		
		new TouchAction<>(DriverFactory.getDriver())
        .longPress(PointOption.point(x_inicial,y))
        .moveTo(PointOption.point(x_final,y))
        .release()
        .perform();
	}
	
	protected void appiumSwipeLeftElement(MobileElement element) {
		appiumSwipeElement(element,0.9,0.1);
	}

	protected void appiumSwipeRightElement(MobileElement element) {
		appiumSwipeElement(element,0.9,0.1);
	}
	
	public static void waitExplict(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
