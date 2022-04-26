package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.AbasPage;
import br.com.JMAfricoCursos.appium.page.MenuPage;

public class AbasTest extends BaseTest{
	
	MenuPage menuPage = new MenuPage();
	AbasPage abasPage = new AbasPage();

	@Before
	public void acessarMenuAbas() {
		menuPage.clicarAbas();
	}
	
	@Test
	public void deveAcessarPrimeiraAba() {
		abasPage.clicarPrimeiraAba();
		Assert.assertTrue(abasPage.verificarPrimeiraAbaSelecionada());
	}
	
	@Test
	public void deveAcessarSegundaAba() {
		abasPage.clicarSegundaAba();
		Assert.assertTrue(abasPage.verificarSegundaAbaSelecionada());
	}
}
