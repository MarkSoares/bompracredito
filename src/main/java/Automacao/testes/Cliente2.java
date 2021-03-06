package Automacao.testes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cliente2 {
	
	WebDriver driver;

	@Before
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.get("https://demo.bompracredito.com.br/emprestimo-pessoal");
	}
	
	@Test
	public void settings() throws InterruptedException {
		Automacao.Pages.Cadastro2 preencher = new Automacao.Pages.Cadastro2();
		
		preencher.selecionarValor(driver);
		preencher.selecionarPrazo(driver);
		preencher.criarCadastro(driver);
		preencher.preencherDados(driver);
		preencher.cepInvalido(driver);
		preencher.preencherEndereço(driver);
	
	}
	
	@After
	public void finalize() throws InterruptedException {
		Thread.sleep(20000);
		driver.close();
	}

}
