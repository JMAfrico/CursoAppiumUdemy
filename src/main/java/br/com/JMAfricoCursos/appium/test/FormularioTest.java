package br.com.JMAfricoCursos.appium.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.JMAfricoCursos.appium.core.DriverFactory;
import br.com.JMAfricoCursos.appium.page.FormularioPage;
import br.com.JMAfricoCursos.appium.page.MenuPage;

public class FormularioTest {
	
	private MenuPage menuPage = new MenuPage();
	private FormularioPage formPage = new FormularioPage();

	@Before
	public void setup(){
		menuPage.acessarFormulario();
	}
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}
	
	@Test
	public void devePreencherCampoTexto() {			
		formPage.escreverNome("joao");
		Assert.assertEquals("joao",formPage.obterNome());
	}
	
	@Test
	public void deveInteragirComCombo() {
		formPage.escreverNome("joao");
		formPage.selecionarCombo("Nintendo Switch");
		Assert.assertEquals("Nintendo Switch", formPage.obterValorCombo());
	}
	
	@Test
	public void deveInteragirCheckBoxESwith() {					
		formPage.escreverNome("joao");
		formPage.selecionarCombo("Nintendo Switch");
		
		Assert.assertFalse(formPage.verificarCheckBoxMarcado());
		Assert.assertTrue(formPage.verificarSwichMarcado());

		formPage.clicarCheck();
		formPage.clicarSwitc();
				
		Assert.assertTrue(formPage.verificarCheckBoxMarcado());
		Assert.assertFalse(formPage.verificarSwichMarcado());
	}
	
	
	@Test
	public void realizarCadastro() {			
		formPage.escreverNome("João Marcos");
		formPage.selecionarCombo("PS4");	
			
		formPage.clicarCheck();
		formPage.clicarSwitc();
		
		formPage.clicarBtnSalvar();
		
		Assert.assertTrue(formPage.obterNomeCadastrado().contains((formPage.obterNome())));
		Assert.assertEquals("Console: ps4", formPage.obterValorComboCadastrado());
		Assert.assertTrue(formPage.obterCheckCadastrado().endsWith("Marcado"));
		Assert.assertTrue(formPage.obterSwichCadastrado().endsWith("Off"));
	}
}
