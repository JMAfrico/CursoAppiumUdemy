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
	
	@Test
	public void enviarTextoWhatsap() throws MalformedURLException {	
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "0074578197");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability("appPackage", "com.whatsapp");
	    //desiredCapabilities.setCapability("appActivity", "com.google.android.gsm.common.api.GoogleApiActivity");
	    //desiredCapabilities.setCapability("appActivity", "com.whatsapp.HomeActivity");
	    desiredCapabilities.setCapability("appActivity", "com.whatsapp.Conversation");
	    
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
	    
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		
		MobileElement el1 = (MobileElement) driver.findElementById("com.whatsapp:id/whatsapp_toolbar_home");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.whatsapp:id/entry");
	    el3.click();
	    el3.sendKeys("OI MORR");
	 
	    
	    driver.quit();
	}
}
