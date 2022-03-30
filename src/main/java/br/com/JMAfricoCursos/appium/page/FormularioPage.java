package br.com.JMAfricoCursos.appium.page;

import org.openqa.selenium.By;
import br.com.JMAfricoCursos.appium.core.DSL;
import io.appium.java_client.MobileBy;

public class FormularioPage {

	private DSL dsl = new DSL();
	
	public void escreverNome(String nome) {
		dsl.escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return dsl.obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String valor) {
		dsl.clicarCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String obterValorCombo() {
		return dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public void clicarCheck() {
		dsl.clicar(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
	}
	
	public void clicarSwitc() {
		dsl.clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean verificarCheckBoxMarcado() {
		return dsl.isCheckboxMarcado(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
	}
	
	public boolean verificarSwichMarcado() {
		return dsl.isCheckboxMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarBtnSalvar() {
		dsl.clicar(By.xpath("//*[@text='SALVAR']"));
	}
	
	public String obterNomeCadastrado() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));	
	}
	
	public String obterValorComboCadastrado() {	
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console')]"));
	}
	
	public String obterCheckCadastrado() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));	
	}
	
	public String obterSwichCadastrado() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));		
	}
	
	public String obterDataCadastrada() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Data:')]"));
	}
	
	public String obterHoraCadastrada() {
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Hora:')]"));
	}		
}
