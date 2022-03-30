package br.com.JMAfricoCursos.appium.page;

import br.com.JMAfricoCursos.appium.core.DSL;

public class MenuPage {
	
	private DSL dsl = new DSL();
	
	public void acessarFormulario() {
		dsl.clicarPorTexto("Formulário");
	}
}
