package br.com.JMAfricoCursos.appium.test;

import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.MenuPage;
import br.com.JMAfricoCursos.appium.page.WebViewPage;

public class WebViewTest extends BaseTest{

	MenuPage menuPage = new MenuPage();
	WebViewPage webViewPage = new WebViewPage();
	
	@Before
	public void deveAcessarMenuSeuBarrigaHibrido() {
		menuPage.clicarSeuBarrigaHibrido();
	}
	
	@Test
	public void deveFazerLogin() {
		BasePage.waitExplict(3000);
		webViewPage.contextWeb();
		BasePage.waitExplict(3000);
		webViewPage.preencherTxtEmail("joaomarcosafricodasilva@gmail.com");
	}
}
