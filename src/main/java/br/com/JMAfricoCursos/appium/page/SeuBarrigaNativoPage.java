package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;

public class SeuBarrigaNativoPage extends BasePage{

	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	private By txtLogin = By.xpath("//*[@text='Nome']");
	private By txtSenha = By.xpath("//*[@text='Senha']");
	private By txtConta = By.xpath("//*[@text='Conta']");
	
	public void escreverLogin(String login) {
		String step = "Digitar Login '"+login+"'";
		screenshotTest.getScreenShot(step);
		write(txtLogin, login);
	}
	
	public void escreverSenha(String senha) {
		String step = "Digitar Senha '"+senha+"'";
		screenshotTest.getScreenShot(step);
		write(txtSenha, senha);
	}
	
	public void clicarLogin() {
		String step = "Clicar em 'Entrar'";
		screenshotTest.getScreenShot(step);
		String value = "ENTRAR";
		clickByText(value);
	}
	
	public boolean validarLoginEfetuado() {
		String step = "Validar 'Login' efetuado com sucesso";
		screenshotTest.getScreenShot(step);
		String value = "Home";
		return isExistByText(value);
	}
	
	public boolean validarLoginInvalido() {
		String step = "Validar 'Login' inválido";
		screenshotTest.getScreenShot(step);
		String value = "Usuário ou senha inválido";
		return isExistByText(value);
	}
	
	public void clicarEmContas() {
		String step = "Clicar em 'Contas'";
		screenshotTest.getScreenShot(step);
		String value = "Contas";
		clickByText(value);
	}
	
	public void escreverNomeNovaConta(String conta) {
		String step = "Digitar Conta '"+conta+"'";
		screenshotTest.getScreenShot(step);
		write(txtConta, conta);
	}
	
	public void clicarSalvarDeContas() {
		String step = "Clicar em 'Salvar'";
		screenshotTest.getScreenShot(step);
		String value = "SALVAR";
		clickByText(value);
	}
	
	public void selecionarConta(String conta) {
		String step = "Selecionar conta '"+conta+"'";
		screenshotTest.getScreenShot(step);
		clickElementLongPress(conta);
	}
	
	public void clicarExcluirDeContas() {
		String step = "Clicar em 'Excluir'";
		screenshotTest.getScreenShot(step);
		String value = "EXCLUIR";
		clickByText(value);
	}
	
	public boolean validarContaSalvaComSucesso() {
		String step = "Validar conta salva com Sucesso";
		screenshotTest.getScreenShot(step);
		String value = "Conta adicionada com sucesso";
		return isExistByText(value);
	}
	
	public boolean validarContaApagadaComSucesso() {
		String step = "Validar Conta 'Excluida' com sucesso";
		screenshotTest.getScreenShot(step);
		String value = "Conta excluída com sucesso";
		return isExistByText(value);
	}
	
	public boolean validarTentativaInvalidaDeApagarContaEmUso() {
		String step = "Validar tentativa inválido de 'Apagar' conta em uso";
		screenshotTest.getScreenShot(step);
		String value = "Conta em uso nas movimentações";
		return isExistByText(value);
	}
}
