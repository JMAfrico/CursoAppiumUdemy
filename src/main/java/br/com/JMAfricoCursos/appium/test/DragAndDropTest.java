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
	
	private String[] estadoInicial = new String[] {"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
	private String[] estadoIntermediario = new String[] {"e arraste para", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "Esta", "qualquer local desejado."};
	private String[] estadoFinal = new String[] {"e arraste para", "Faça um clique longo,", "Drag em Drop!", "é uma lista", "Esta", "qualquer local desejado."};

	
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
		dragAndDropPage.arrastar("Faça um clique longo,", "é uma lista");
		Assert.assertArrayEquals(estadoFinal, dragAndDropPage.obterLista());
	}
}
