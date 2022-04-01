package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.MenuPage;
import br.com.JMAfricoCursos.appium.page.SplashPage;

public class SplashTest extends BaseTest{
	
	MenuPage menuPage = new MenuPage();
	SplashPage splashPage = new SplashPage();
	
	@Before
	public void devoAcessarMenuSplash() {
		menuPage.acessarSplash();
	}
	
	@Test
	public void deveAguardarSplashSumir() {
		splashPage.isTelaSplashVisivel();
		splashPage.esperaTelaSplashDesaparecer();
		Assert.assertFalse(splashPage.isTelaSplashVisivel());
	}
	
}
