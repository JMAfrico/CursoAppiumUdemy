package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.AlertaPage;
import br.com.JMAfricoCursos.appium.page.MenuPage;


public class AlertaTest extends BaseTest{

	private AlertaPage alertaPage = new AlertaPage();
	private MenuPage menuPage = new MenuPage();
	
	@Before
	public void deveAcessarMenuAlerta() {
		menuPage.acessarAlerta();
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
		alertaPage.clicarEmSair();
	}
}
