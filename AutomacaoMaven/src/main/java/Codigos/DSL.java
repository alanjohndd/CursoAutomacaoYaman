package Codigos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {

private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}	
	
	
	/********* Combo ************/
	public void selecionarCombo(String id, String valor) {
		
		WebElement combobox1Element = driver.findElement(By.id(id));
		Select combobox1 = new Select(combobox1Element);
		combobox1.selectByValue(valor);
	}
	
	/********* Botao ************/
	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void clicarBotaoXpath(String id) {
	driver.findElement(By.xpath(id)).click();
	}
	/********* TextField e TextArea ************/
	public void escrever(String id_campo, String texto){		
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	public void limparTextField(String id_campo){		
	driver.findElement(By.id(id_campo)).clear();
	}
	
	/********* Radio e Check ************/
	
	public void clicarRadio(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	/************* WAIT ***************/
	
	public void esperarCampo(String id) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	
	/******** Massa de teste **********/
	
	public void massaTesteEmail(String massa) {
		
		
		
		driver.findElement(By.id("email_create")).sendKeys("testessssssssssssss@yaman.com.br" + "asdf");

	}
}
