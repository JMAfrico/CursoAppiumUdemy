package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.DriverFactory;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeListPage extends BasePage{

	ScreenshotTest screenshotTest = new ScreenshotTest();
	private By btnMais = By.xpath("//*[@text='(+)']/..");
	private By btnMenos = By.xpath("//*[@text='(-)']");
	
	public void moverLadoEsquerdo(String text) {
		String step = "Slide '"+text+ "' para 'esquerda";
		screenshotTest.getScreenShot(step);
		appiumSwipeLeftElement(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+text+"']/..")));
	}
	
	public void moverLadoDireito(String text) {
		String step = "Slide '"+text+ "' para 'direita";
		screenshotTest.getScreenShot(step);
		appiumSwipeRightElement(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+text+"']/..")));
	}
	
	public void clicarBtnMais() {
		String step = "Clicar em '+' ";
		screenshotTest.getScreenShot(step);
		clickElement(btnMais);
	}
	
	public void segundaFormaClicarBtnMais() {
		String step = "Clicar em '+' ";
		screenshotTest.getScreenShot(step);
		
		MobileElement botaoMais = DriverFactory.getDriver().findElement(btnMais);
		
		Point center1 = botaoMais.getCenter();		
		new TouchAction<>(DriverFactory.getDriver()).tap(PointOption.point(center1.x - 50, center1.y)).perform();

	}
	
	public void clicarBtnMenos() {
		String step = "Clicar em '-' ";
		screenshotTest.getScreenShot(step);
		clickElement(btnMenos);
	}
	
	public boolean validarTexto(String value) {
		String step = "Verificar se '"+value+"' existe";
		screenshotTest.getScreenShot(step);
		return isExistByText(value);
	}
}
