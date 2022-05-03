package br.com.JMAfricoCursos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.BaseTest;
import br.com.JMAfricoCursos.appium.page.DragAndDropPage;
import br.com.JMAfricoCursos.appium.page.MenuPage;

public class DragAndDropTest extends BaseTest{

	MenuPage menuPage = new MenuPage();
	DragAndDropPage dragAndDropPage = new DragAndDropPage();
	
	private String[] estadoInicial = new String[] {"Esta","� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para", "qualquer local desejado."};
	private String[] estadoIntermediario = new String[] {"� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para" , "Esta", "qualquer local desejado."};
	private String[] estadoFinal = new String[] {"Fa�a um clique longo,","� uma lista","Drag em Drop!","e arraste para", "Esta", "qualquer local desejado."};

	
	@Before
	public void acessarDragAndDrop() {
		menuPage.clicarDragAndDrop();
	}
	
	@Test
	public void deveArrastarESoltar() {
		BasePage.waitExplict(1000);
		Assert.assertArrayEquals(estadoInicial, dragAndDropPage.obterLista());
		dragAndDropPage.arrastar("Esta", "e arraste para");
		Assert.assertArrayEquals(estadoIntermediario, dragAndDropPage.obterLista());
		dragAndDropPage.arrastar("Fa�a um clique longo,", "� uma lista");
		Assert.assertArrayEquals(estadoFinal, dragAndDropPage.obterLista());
	}
}
