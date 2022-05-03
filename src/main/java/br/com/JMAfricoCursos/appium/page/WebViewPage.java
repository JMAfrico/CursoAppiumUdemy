package br.com.JMAfricoCursos.appium.page;

import java.util.Set;

import org.openqa.selenium.By;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.DriverFactory;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class WebViewPage extends BasePage {

	ScreenshotTest screenshotTest = new ScreenshotTest();
	
	public void contextWeb() {
		Set<String> valor = DriverFactory.getDriver().getContextHandles();
		for(String val : valor) {
			System.out.println(val);
		}
		DriverFactory.getDriver().context((String) valor.toArray()[1]);
	}
	
	public void preencherTxtEmail(String email) {
		//screenshotTest.getScreenShot("Clicar em 'Login'");
		//String value = "Aba 1";
		DriverFactory.getDriver().findElement(By.id("email")).sendKeys(email);
		//clickByText(value);	
	}
	
	public void clicartxtSenha() {
		screenshotTest.getScreenShot("Clicar em 'Senha'");
		String value = "Aba 1";
		clickByText(value);	
	}
}
