package br.com.JMAfricoCursos.appium;

import java.net.MalformedURLException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import br.com.JMAfricoCursos.appium.core.DriverFactory;
import io.appium.java_client.MobileBy;

public class FormularioTestes2 {
	
//	private DSL dsl = new DSL();
//
//	@Before
//	public void setup() throws MalformedURLException {
//		
//	}
//	
//	@After
//	public void tearDown() {
//		DriverFactory.killDriver();
//	}
//	
//	@Test
//	public void devePreencherCampoTexto() throws MalformedURLException {			
//		dsl.clicarPorTexto("Formulário");
//		dsl.escrever(MobileBy.AccessibilityId("nome"), "joao");
//		Assert.assertEquals("joao",dsl.obterTexto(MobileBy.AccessibilityId("nome")));
//	}
//	
//	@Test
//	public void deveInteragirComCombo() throws MalformedURLException {			
//		dsl.clicarPorTexto("Formulário");
//		dsl.escrever(MobileBy.xpath("//android.widget.EditText[@text='Nome']"), "joao");
//		dsl.clicarCombo(MobileBy.AccessibilityId("console"), "Nintendo Switch");
//		
//		String texto = dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
//		Assert.assertEquals("Nintendo Switch", texto);
//	}
//	
//	@Test
//	public void deveInteragirCheckBoxESwith() throws MalformedURLException {			
//		dsl.clicarPorTexto("Formulário");		
//		dsl.escrever(MobileBy.xpath("//android.widget.EditText[@text='Nome']"), "joao");
//		dsl.clicarCombo(MobileBy.AccessibilityId("console"), "Nintendo Switch");
//				
//		boolean CheckIsMarcado = dsl.isCheckboxMarcado(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
//		boolean SwichIsAtivo = dsl.isCheckboxMarcado(MobileBy.AccessibilityId("switch"));
//		
//		Assert.assertFalse(CheckIsMarcado);
//		Assert.assertTrue(SwichIsAtivo);
//
//		dsl.clicar(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
//		dsl.clicar(MobileBy.AccessibilityId("switch"));
//		
//		CheckIsMarcado = dsl.isCheckboxMarcado(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
//		SwichIsAtivo = dsl.isCheckboxMarcado(MobileBy.AccessibilityId("switch"));
//		
//		Assert.assertTrue(CheckIsMarcado);
//		Assert.assertFalse(SwichIsAtivo);
//	}
//	
//	
//	@Test
//	public void realizarCadastro() throws MalformedURLException {	
//		dsl.clicarPorTexto("Formulário");		
//		dsl.escrever(MobileBy.xpath("//android.widget.EditText[@text='Nome']"), "João Marcos");
//		dsl.clicarCombo(MobileBy.AccessibilityId("console"), "PS4");		
//			
//		dsl.clicar(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
//		dsl.clicar(MobileBy.AccessibilityId("switch"));
//		
//		dsl.clicar(By.xpath("//*[@text='SALVAR']"));
//		
//		Assert.assertEquals("João Marcos",dsl.obterTexto(MobileBy.AccessibilityId("nome")));
//		
//		Assert.assertEquals("CONSOLE: PS4",dsl.obterTexto(By.xpath("//android.widget.TextView[ends-with(@text,'ps4')]")).toUpperCase());
//	
//		Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]")).endsWith("Off"));	
//				
//		Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]")).endsWith("Marcado"));	
//				
//		Assert.assertEquals("01/01/2000", dsl.obterTexto(By.xpath("//android.widget.TextView[@text='01/01/2000']")));
//		Assert.assertEquals("09:00", dsl.obterTexto(By.xpath("//android.widget.TextView[@text='09:00']")));
//	}
}
