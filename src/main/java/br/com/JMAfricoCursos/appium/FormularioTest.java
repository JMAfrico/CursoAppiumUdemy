package br.com.JMAfricoCursos.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTest {
	
	private AndroidDriver<MobileElement> driver;

	@Before
	public void setup() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "0074578197");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Aprendizado\\Cursos Java\\CursoTestesAppiumUdemy\\src\\main\\resources\\CTAppium_2_0.apk");
	    //URL remoteUrl = new URL("http://localhost:4723/wd/hub");   
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);	   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {			
		//selecionar formulario	
		List<MobileElement> itensMenu = driver.findElements(By.className("android.widget.TextView"));
		
		//ler lista	
		for(MobileElement e : itensMenu) {
			System.out.println(e.getText());
		}
		
		//clicar no item de posicao 1(index 2)
		itensMenu.get(1).click();
		
	    //escrever nome, utilizando o mobileBy// Para localizar o AccessibilityId é o "content-desc"
		MobileElement txtNome = driver.findElement(MobileBy.AccessibilityId("nome"));
		txtNome.sendKeys("joao");
		
	    //verificar nome escrito
		Assert.assertEquals("joao", txtNome.getText());
	}
	
	@Test
	public void deveInteragirComCombo() throws MalformedURLException {			

		//selecionar formulario	
		MobileElement btnFormulario = driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']"));
		btnFormulario.click();
		
	    //escrever nome
		MobileElement txtNome = driver.findElement(MobileBy.xpath("//android.widget.EditText[@text='Nome']"));
		txtNome.sendKeys("joao");
		
		//clicar no combobox
		driver.findElement(MobileBy.AccessibilityId("console")).click();
		
		//selecionar opcao desejada
		MobileElement btnGame = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']"));
		btnGame.click();
		
	    //verificar opcao desejada
		MobileElement selectedItem = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView"));
		
		//Assertiva
		Assert.assertEquals("Nintendo Switch", selectedItem.getText());
	}
	
	@Test
	public void deveInteragirCheckBoxESwith() throws MalformedURLException {			
		//selecionar formulario	
		MobileElement btnFormulario = driver.findElement(By.xpath("//*[@text='Formulário']"));
		btnFormulario.click();
		
	    //escrever nome
		MobileElement txtNome = driver.findElement(MobileBy.xpath("//*[@text='Nome']"));
		txtNome.sendKeys("joao");
		
		//clicar no combobox
		MobileElement btnListaGames = driver.findElement(MobileBy.AccessibilityId("console"));
		btnListaGames.click();
		
		//selecionar opcao desejada
		MobileElement btnGame = driver.findElement(By.xpath("//*[@text='Nintendo Switch']"));
		btnGame.click();
		
		//localizar elementos
		MobileElement dataCheck = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
		MobileElement horaSwich = driver.findElement(MobileBy.AccessibilityId("switch"));
		
		//verificar elementos
		Assert.assertTrue(dataCheck.getAttribute("checked").equals("false"));
		Assert.assertTrue(horaSwich.getAttribute("checked").equals("true"));
		
		//clicar nos elementos	
		dataCheck.click();	
		horaSwich.click();
			
	    //verificar estados alterados
		Assert.assertTrue(dataCheck.getAttribute("checked").equals("true"));
		Assert.assertTrue(horaSwich.getAttribute("checked").equals("false"));
	}
	
	
	@Test
	public void realizarCadastro() throws MalformedURLException {	
		driver.findElement(MobileBy.xpath("//*[@text='Formulário']")).click();
		
		MobileElement txtNome = driver.findElement(MobileBy.AccessibilityId("nome"));		
		txtNome.sendKeys("João Marcos");		
		
		MobileElement listGames = driver.findElement(By.xpath("//*[@content-desc='console']"));
		listGames.click();
		
		MobileElement selectedGame = driver.findElement(By.xpath("//*[@text='PS4']"));
		selectedGame.click();		
		//MobileElement selectedItem = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView"));
			
		MobileElement checkData = driver.findElement(MobileBy.xpath("//*[@content-desc='check']"));
		checkData.click();
		
		MobileElement getData = driver.findElement(By.xpath("//android.widget.TextView[@text='01/01/2000']"));
		
		MobileElement checkHora = driver.findElement(MobileBy.xpath("//android.widget.Switch[@content-desc='switch']"));
		checkHora.click();
		
		MobileElement getHora = driver.findElement(By.xpath("//android.widget.TextView[@text='09:00']"));
		
		MobileElement btnSalvar = driver.findElement(By.xpath("//*[@text='SALVAR']"));
		btnSalvar.click();	
		
		Assert.assertEquals("Nome:João Marcos", "Nome:" +txtNome.getText());
		
		MobileElement combo = driver.findElement(By.xpath("//android.widget.TextView[ends-with(@text,'ps4')]"));
		Assert.assertEquals("CONSOLE: PS4",combo.getText().toUpperCase());
		//Assert.assertEquals("Console: PS4", "Console:"+selectedItem.getText());
		
		MobileElement swit = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
		Assert.assertTrue(swit.getText().endsWith("Off"));		
		//Assert.assertTrue(checkHora.getAttribute("checked").equals("false"));
		
		MobileElement chec = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
		Assert.assertTrue(chec.getText().endsWith("Marcado"));	
		//Assert.assertTrue(checkData.getAttribute("checked").equals("true"));
		
		Assert.assertEquals("01/01/2000", getData.getText());
		Assert.assertEquals("09:00", getHora.getText());
	}
}
