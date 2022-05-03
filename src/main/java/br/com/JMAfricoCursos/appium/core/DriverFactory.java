package br.com.JMAfricoCursos.appium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	
	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}
	
	private static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "0074578197");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Aprendizado\\Cursos Java\\CursoTestesAppiumUdemy\\src\\main\\resources\\CTAppium_2_0.apk");
	    //desiredCapabilities.setCapability("fullContextList ", "true");
	    //desiredCapabilities.setCapability("setWebContentsDebuggingEnabled ", "true");
	    //desiredCapabilities.setCapability("platformName", "Android");
	    //URL remoteUrl = new URL("http://localhost:4723/wd/hub");   
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
			//driver = new AndroidDriver<MobileElement>(new URL("http://192.168.1.3:43251/wd/hub"),desiredCapabilities);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}	   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}	
}
