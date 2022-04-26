package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static br.com.JMAfricoCursos.appium.core.BasePage.waitExplict;
import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.AlertaPage;
import br.com.JMAfricoCursos.appium.page.MenuPage;


public class AlertaTest extends BaseTest{

	private AlertaPage alertaPage = new AlertaPage();
	private MenuPage menuPage = new MenuPage();
	
	@Before
	public void deveAcessarMenuAlerta() {
		menuPage.clicarAlerta();
	}
	
	@Test
	public void deveClicarMenuAlertaConfirmar() {
		alertaPage.clicarAlertaConfirmar();
	}
	
	@Test
	public void deveConfirmarAlerta() {
		alertaPage.clicarAlertaConfirmar();
		alertaPage.clicarConfirmarOperacao();
		Assert.assertTrue(alertaPage.validarAlertaConfirmado());
		alertaPage.clicarSair();
	}
	
	@Test
	public void deveClicarForaAlertaSimples() {
		alertaPage.clicarAlertaSimples();
		waitExplict(2000);
		alertaPage.clicarForaDoAlerta();
		Assert.assertFalse(alertaPage.validarMensagemInfoAlertaSimples());
	}
	
	@Test
	public void deveConfirmarAlertaRestritivo() {
		alertaPage.clicarAlertaRestritivo();
		alertaPage.clicarOk();
		Assert.assertTrue(alertaPage.validarAlertaConfirmado());
	}
}
