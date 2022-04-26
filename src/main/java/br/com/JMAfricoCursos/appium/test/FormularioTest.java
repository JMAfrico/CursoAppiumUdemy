package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.FormularioPage;
import br.com.JMAfricoCursos.appium.page.MenuPage;

public class FormularioTest extends BaseTest{
	
	private MenuPage menuPage = new MenuPage();
	private FormularioPage formPage = new FormularioPage();

	@Before
	public void setup(){
		menuPage.clicarFormulario();
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
		//Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text ='João Marcos']")));
		
		Assert.assertTrue(formPage.obterNomeCadastrado().contains((formPage.obterNome())));
		Assert.assertEquals("Console: ps4", formPage.obterValorComboCadastrado());
		Assert.assertTrue(formPage.obterCheckCadastrado().endsWith("Marcado"));
		Assert.assertTrue(formPage.obterSwichCadastrado().endsWith("Off"));
	}
	
	@Test
	public void deveAlterarData() {
		formPage.clicarBtnData();
		formPage.clicarDia("20");
		formPage.clicarBtnOk();	
		Assert.assertTrue(formPage.verificarSeExiste("20/01/2000"));
	}
	
	@Test
	public void deveAlterarHora() {
		formPage.clicarBtnHora();
		formPage.selecionarHora("10");
		formPage.selecionarMinuto("45");
		formPage.clicarBtnOk();	
		Assert.assertTrue(formPage.verificarSeExiste("10:45"));
	}
	
	@Test
	public void deveMoverSeekbar() {
		formPage.clicarSeekBar(0.60);
		formPage.clicarBtnSalvar();	
	}
}
