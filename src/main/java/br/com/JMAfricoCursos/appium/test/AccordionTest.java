package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.AccordionPage;
import br.com.JMAfricoCursos.appium.page.MenuPage;

public class AccordionTest extends BaseTest{

	MenuPage menuPage = new MenuPage();
	AccordionPage accordionPage = new AccordionPage();
	
	@Before
	public void deveAcessarMenuAccordion() {
		menuPage.clicarAccordion();
	}
	
	@Test
	public void deveValidarOpcaoUm(){
		Assert.assertTrue(accordionPage.validarExisteOpcaoUm());
		accordionPage.clicarOpcaoUm();
		Assert.assertTrue(accordionPage.validarTextOpcaoUm());
	}
}
