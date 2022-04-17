package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;
import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.DriverFactory;
import br.com.JMAfricoCursos.appium.core.ScreenshotTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FormularioPage extends BasePage{
	
	private ScreenshotTest screenshotTest = new ScreenshotTest();
	
	private By btnData = By.xpath("//*[@text='01/01/2000']"); 
	private By btnHora = By.xpath("//*[@text='09:00']"); 
	private By btnSeekBar = MobileBy.AccessibilityId("slid");


	public void escreverNome(String nome) {
		screenshotTest.getScreenShot("Digitar '"+nome+"' ");
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		screenshotTest.getScreenShot("Obter nome ");
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String valor) {
		screenshotTest.getScreenShot("Selecionar '"+valor+"' ");
		clicarCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String obterValorCombo() {
		screenshotTest.getScreenShot("Obter Valor");
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public void clicarCheck() {
		screenshotTest.getScreenShot("Clicar em 'check'");
		clicar(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
	}
	
	public void clicarSwitc() {
		screenshotTest.getScreenShot("Clicar em Swich");
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean verificarCheckBoxMarcado() {
		screenshotTest.getScreenShot("Verificar se Checkbox está marcado");
		return isCheckboxMarcado(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
	}
	
	public boolean verificarSwichMarcado() {
		screenshotTest.getScreenShot("Verificar se Swich está selecionado");
		return isCheckboxMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarBtnSalvar() {
		screenshotTest.getScreenShot("Clicar em 'Salvar'");
		clicar(By.xpath("//*[@text='SALVAR']"));
	}
	
	public String obterNomeCadastrado() {
		screenshotTest.getScreenShot("Nome cadastrado");
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));	
	}
	
	public String obterValorComboCadastrado() {	
		screenshotTest.getScreenShot("Valor cadastrado");
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console')]"));
	}
	
	public String obterCheckCadastrado() {
		screenshotTest.getScreenShot("Checkbox cadastrado");
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));	
	}
	
	public String obterSwichCadastrado() {
		screenshotTest.getScreenShot("Obter Swich Cadastrado");
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));		
	}
	
	public String obterDataCadastrada() {
		screenshotTest.getScreenShot("Obter data cadastrada");
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Data:')]"));
	}
	
	public String obterHoraCadastrada() {
		screenshotTest.getScreenShot("Obter Hora cadastrada");
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Hora:')]"));
	}

	public void clicarBtnData() {
		screenshotTest.getScreenShot("Clicar em 'data'");
		clicar(btnData);
	}
	
	public void clicarBtnHora() {
		screenshotTest.getScreenShot("Clicar em 'hora'");
		clicar(btnHora);
	}	
	
	public void clicarDia(String texto) {
		screenshotTest.getScreenShot("Selecionar dia '"+texto+" '");
		clicarPorTexto(texto);
	}
	
	public void selecionarHora(String hora) {
		screenshotTest.getScreenShot("Selecionar hora '"+hora+" '");
		clicar(MobileBy.AccessibilityId(hora));
	}
	
	public void selecionarMinuto(String minuto) {
		screenshotTest.getScreenShot("Selecionar minuto '"+minuto+" '");
		clicar(MobileBy.AccessibilityId(minuto));
	}
	
	public void clicarBtnOk() {
		screenshotTest.getScreenShot("Clicar em 'Ok'");
		clicarPorTexto("OK");
	}
	
	public boolean verificarSeExiste(String texto) {
		screenshotTest.getScreenShot("Validando se existe...");
		return verificarSeExistePorTexto(texto);
	}
	
	public void clicarSeekBar(double posicao) {
		screenshotTest.getScreenShot("Mover SeekBar");
		
		MobileElement seek = DriverFactory.getDriver().findElement(btnSeekBar);
		int y = seek.getLocation().y + (seek.getSize().height/2);
		int x = (int) (seek.getLocation().x + (seek.getSize().width * posicao));
		clicarPorCoordenadas(x, y);
		
	}
}
