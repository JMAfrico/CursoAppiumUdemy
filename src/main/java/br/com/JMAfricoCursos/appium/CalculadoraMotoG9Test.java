package br.com.JMAfricoCursos.appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraMotoG9Test {
	
	@Test
	public void deveSomarDoisValores() throws MalformedURLException {	
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "0074578197");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
	    
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		
		MobileElement numero9 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_9");
		numero9.click();
		MobileElement btnMais = (MobileElement) driver.findElementByAccessibilityId("mais");
		btnMais.click();
		MobileElement numero1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_1");
		numero1.click();
		MobileElement res = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_preview");
	    
	    Assert.assertEquals("10",res.getText());
	    
	    driver.quit();
	}
}
