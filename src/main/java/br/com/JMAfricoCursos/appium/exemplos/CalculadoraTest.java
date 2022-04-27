package br.com.JMAfricoCursos.appium.exemplos;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisValores() throws MalformedURLException {	
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5556");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
	    
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		
		MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("multiply");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
	    el3.click();
	    
	    System.out.println(el1.getText());
	    
	    Assert.assertEquals("6",el1.getText());
	    
	    driver.quit();
	}
}
