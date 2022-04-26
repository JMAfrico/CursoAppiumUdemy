package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.MenuPage;
import br.com.JMAfricoCursos.appium.page.SwipePage;

public class SwipeTest extends BaseTest{
	
	MenuPage menuPage = new MenuPage();
	SwipePage swipePage = new SwipePage();
	
	@Before
	public void acessarMenuSwipe() {
		menuPage.clicarSwipe();
	}
	
	@Test
	public void arrastarParaEsquerdaEDireita() {

		Assert.assertTrue(swipePage.verificarTextoPaginaUm());
		swipePage.moverParaLadoDireito();
		
		Assert.assertTrue(swipePage.verificarTextoPaginaDois());
		swipePage.moverParaLadoDireito();
		
		Assert.assertTrue(swipePage.verificarTextoPaginaTres());
		swipePage.moverParaLadoEsquerdo();		
		
		Assert.assertTrue(swipePage.verificarTextoPaginaDois());
	}
}
