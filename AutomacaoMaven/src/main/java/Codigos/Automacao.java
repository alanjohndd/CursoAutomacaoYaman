package Codigos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automacao {


	public WebDriver driver;
	public String baseUrl;
	public boolean acceptNextAlert = true;
	public StringBuffer verificationErrors = new StringBuffer();
	private DSL dsl;


	@Before
	public void setUp() throws Exception{
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver.", "C:/drivers/chromedriver/chromedriver");
		baseUrl = "http://automationpractice.com/";
		driver.manage().window().maximize();
		dsl = new DSL(driver);
		
	}

	@Test
	public void acessarLogin() throws Exception{
		driver.get("http://automationpractice.com/index.php");
		dsl.clicarBotaoXpath("//a[contains(text(),'Sign in')]");
		dsl.esperarCampo("email_create");
		dsl.escrever("email_create", "testesssssssssssss@yaman.com.br");
		dsl.clicarBotao("SubmitCreate");
		dsl.esperarCampo("id_gender1");
		dsl.clicarRadio("id_gender1");
		dsl.escrever("customer_firstname", "Alan John");
		dsl.escrever("customer_lastname", "Diniz Dantas");
		dsl.escrever("passwd", "12345678");
		dsl.selecionarCombo("days", "18");
		dsl.selecionarCombo("months", "6");
		dsl.selecionarCombo("years", "1994");
		dsl.escrever("company", "Yaman");
		dsl.escrever("address1", "Rua Botucatu, 25");
		dsl.escrever("address2", "Casa 2");
		dsl.escrever("city", "Embu das Artes");
		dsl.selecionarCombo("id_state", "5");
		dsl.escrever("postcode", "00000");
		dsl.selecionarCombo("id_country", "21");
		dsl.escrever("other", "Não tem");
		dsl.escrever("phone", "1141494616");
		dsl.escrever("phone_mobile", "11985081750");
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.textToBePresentInElement(By.id("alias"),	"My address"));
		dsl.limparTextField("alias");
		dsl.escrever("alias", "My address");
		dsl.clicarBotao("submitAccount");
		Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", 
							driver.findElement(By.xpath("//p[@class='info-account']")).getText());

		
	}
	
}
