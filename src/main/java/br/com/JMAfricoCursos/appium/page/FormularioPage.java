package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;
import br.com.JMAfricoCursos.appium.core.BasePage;
import io.appium.java_client.MobileBy;

public class FormularioPage extends BasePage{

	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String valor) {
		clicarCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String obterValorCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public void clicarCheck() {
		clicar(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
	}
	
	public void clicarSwitc() {
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean verificarCheckBoxMarcado() {
		return isCheckboxMarcado(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
	}
	
	public boolean verificarSwichMarcado() {
		return isCheckboxMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarBtnSalvar() {
		clicar(By.xpath("//*[@text='SALVAR']"));
	}
	
	public String obterNomeCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));	
	}
	
	public String obterValorComboCadastrado() {	
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console')]"));
	}
	
	public String obterCheckCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));	
	}
	
	public String obterSwichCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));		
	}
	
	public String obterDataCadastrada() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Data:')]"));
	}
	
	public String obterHoraCadastrada() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Hora:')]"));
	}		
}
