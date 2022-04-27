package br.com.JMAfricoCursos.appium.page;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;

import br.com.JMAfricoCursos.appium.core.BasePage;
import br.com.JMAfricoCursos.appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDropPage extends BasePage{

	public void arrastar(String origem,String destino) {
		MobileElement inicio = DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+destino+"']"));
		
		TouchAction press = new TouchAction(DriverFactory.getDriver())
				.longPress(ElementOption.element(inicio))
				.moveTo(ElementOption.element(fim))
				.release()
				.perform();
	}
	
	public String[] obterLista() {
		List<MobileElement> findElements = DriverFactory.getDriver().findElements(By.className("android.widget.TextView"));
		String[] lista = new String[findElements.size()];
		for(int i =0;i < findElements.size(); i++) {
			lista[i] = findElements.get(i).getText();
			System.out.print("\""+lista[i]+ "\", ");
		}
		return lista;
	}
}
