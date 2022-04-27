package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.MenuPage;
import br.com.JMAfricoCursos.appium.page.SwipeListPage;


public class SwipeListTest extends BaseTest{

	SwipeListPage swipeListPage = new SwipeListPage();
	MenuPage menuPage = new MenuPage(); 
	
	@Before
	public void acessarSwipeList() {
		menuPage.clicarSwipeList();
	}
	
	@Test
	public void deveMoverParaEsquerdaEDireita() {
		swipeListPage.moverLadoEsquerdo("Opção 1");
		//swipeListPage.clicarBtnMais();
		swipeListPage.segundaFormaClicarBtnMais();
		Assert.assertTrue(swipeListPage.validarTexto("Opção 1 (+)"));
	}
}
