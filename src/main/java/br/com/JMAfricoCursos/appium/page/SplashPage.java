package br.com.JMAfricoCursos.appium.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.DriverFactory;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class SplashPage extends BasePage{

	ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public boolean validarTelaSplashVisivel() {
		screenshotTest.getScreenShot("Verificar se existe o texto 'Splash' ");
		String value = "Splash!";
		return isExistByText(value);
	}
	
	public void esperaTelaSplashDesaparecer() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
	}
}
