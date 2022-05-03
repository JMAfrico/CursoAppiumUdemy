package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.MenuPage;
import br.com.JMAfricoCursos.appium.page.SeuBarrigaNativoPage;

public class SeuBarrigaNativoTest extends BaseTest{

	MenuPage menuPage = new MenuPage();
	SeuBarrigaNativoPage seuBarrigaNativoPage = new SeuBarrigaNativoPage();
	
	@Before
	public void deveAcessarSeuBarrigaNativo() {
		menuPage.clicarSeuBarrigaNativo();
	}
	
	@Test
	public void deveFazerLogin() {
		seuBarrigaNativoPage.escreverLogin("joaostudos@gmail.com");
		seuBarrigaNativoPage.escreverSenha("Elenteamo@10");
		seuBarrigaNativoPage.clicarLogin();
		Assert.assertTrue(seuBarrigaNativoPage.validarLoginEfetuado());
	}
	
	@Test
	public void deveFazerTentativaDeLoginInválido() {
		seuBarrigaNativoPage.escreverLogin("joaostudos@gmail.com");
		seuBarrigaNativoPage.escreverSenha("123456");
		seuBarrigaNativoPage.clicarLogin();
		Assert.assertTrue(seuBarrigaNativoPage.validarLoginInvalido());
	}
	
	@Test
	public void deveInserirNovaConta() {
		seuBarrigaNativoPage.escreverLogin("joaostudos@gmail.com");
		seuBarrigaNativoPage.escreverSenha("Elenteamo@10");
		seuBarrigaNativoPage.clicarLogin();
		seuBarrigaNativoPage.clicarEmContas();
		seuBarrigaNativoPage.escreverNomeNovaConta("Santander");
		seuBarrigaNativoPage.clicarSalvarDeContas();
		Assert.assertTrue(seuBarrigaNativoPage.validarContaSalvaComSucesso());
	}
	
	@Test
	public void deveApagarContaConta() {
		seuBarrigaNativoPage.escreverLogin("joaostudos@gmail.com");
		seuBarrigaNativoPage.escreverSenha("Elenteamo@10");
		seuBarrigaNativoPage.clicarLogin();
		seuBarrigaNativoPage.clicarEmContas();
		seuBarrigaNativoPage.selecionarConta("Santander");
		seuBarrigaNativoPage.clicarExcluirDeContas();
		Assert.assertTrue(seuBarrigaNativoPage.validarContaApagadaComSucesso());
	}
}
