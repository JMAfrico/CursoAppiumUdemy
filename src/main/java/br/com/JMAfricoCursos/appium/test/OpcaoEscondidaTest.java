package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.MenuPage;
import br.com.JMAfricoCursos.appium.page.OpcaoEscondidaPage;


public class OpcaoEscondidaTest extends BaseTest{

	OpcaoEscondidaPage opcaoEscondidaPage = new OpcaoEscondidaPage();
	MenuPage menuPage = new MenuPage();
	
	@Before
	public void acessarMenuOpcaoEscondida() {
		menuPage.acessarOpcaoBemEscondida();
	}
	
	@Test
	public void validaMensagemSucesso() {
		Assert.assertTrue(opcaoEscondidaPage.validarMensagemSucesso());
		opcaoEscondidaPage.clicarOk();
	}
}
