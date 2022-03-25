package br.com.JMAfricoCursos.appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTest {
	
	public WebDriver driver;

	@Test
	public void deveInstalarAPK() throws MalformedURLException {			
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "0074578197");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
//	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
//	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Aprendizado\\Cursos Java\\CursoTestesAppiumUdemy\\src\\main\\resources\\CTAppium_2_0.apk");
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");   
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);	
		
		
	    MobileElement btnFormulario = (MobileElement) driver.findElement(By.xpath("(//android.widget.TextView[text(),'Formulario'])[2]"));
	    btnFormulario.click();
	    	     
	    driver.quit();
	}
}
