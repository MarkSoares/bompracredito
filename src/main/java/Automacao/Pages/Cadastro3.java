package Automacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Automacao.Utils.Utils;
	
	public class Cadastro3 {

		public void selecionarValor(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
			
			utils.click(By.id("btnFiveThousand"));
			Thread.sleep(5000);
			
		}
		
		public void selecionarPrazo(WebDriver driver) throws InterruptedException {
		
			Automacao.Utils.Utils utils = new Utils(driver);
		
			utils.click(By.id("btnTwentyFourTerm"));
			
			
		}
		
		
		public void criarCadastro(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
			
			utils.inserirText(By.id("name"), "Jorge da Silva Peixoto");
			//inserindo email invalido
			utils.inserirText(By.id("email"), "jorgesilvahotmail.com");
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("//*[text()='E-mail inválido']")).isDisplayed()) {
				System.out.println("MENSAGEM DE ERRO VALIDADO COM SUCESSO");
			} else {
				System.out.println("NÃO FOI POSSÍVEL VALIDAR");
			}
			utils.inserirText(By.id("email"), "jorgesilva@hotmail.com");
			utils.click(By.xpath("//li[@class=\"active\"]"));
			utils.click(By.id("btnContinue"));
			
		}
		
		public void preencherDados(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
			
			utils.inserirText(By.id("borrower.cpf"), "04724806850");
			utils.inserirText(By.id("borrower.dateOfBirth"), ("18072000"));
			utils.inserirText(By.id("borrower.monthlyGrossIncome"), ("68000"));
			utils.click(By.id("borrower.gender2"));
			utils.click(By.id("borrower.maritalStatus2"));
			utils.click(By.id("borrower.jobType"));
			utils.click(By.xpath("//option[text()=\"Estudante\"]"));
			utils.click(By.id("borrower.educationLevel"));
			utils.click(By.xpath("(//option[@value=\"3\"])[4]"));
			utils.click(By.id("borrower.bankingData.bankNumber"));
			utils.click(By.xpath("//option[@value=\"999\"]"));
			//CHEQUE
			utils.click(By.id("borrower.bankingData.hasCheckbook2"));
			utils.click(By.id("borrower.hasNegativeCreditRecord2"));
			utils.click(By.id("hasProperty2"));
			utils.click(By.id("hasVehicle2"));
			utils.click(By.id("back-btn-borrower-info"));
		}
		
	public void editarValorePrazo(WebDriver driver) throws InterruptedException {
			
		Automacao.Utils.Utils utils = new Utils(driver);
		
		utils.click(By.id("btnOtherValue"));
		utils.inserirText(By.id("amount"), "3500");
		utils.click(By.id("btnContinue"));
		//ao retornar esses 2 campos voltam em branco
		utils.click(By.id("hasProperty2"));
		utils.click(By.id("hasVehicle2"));
		utils.click(By.id("button-borrower-info"));		
		
		}
		
	public void preencherEndereço(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
		
			utils.inserirText(By.id("homeAddress.cep"), "05885210");
			Thread.sleep(2000);
			utils.inserirText(By.id("homeAddress.number"), "23");
			utils.inserirText(By.id("homeAddress.additionalData"), "Casa 4");
			utils.inserirText(By.id("mobilePhone"), "11992387772");
			utils.click(By.id("button-borrower-info"));
		}

}
