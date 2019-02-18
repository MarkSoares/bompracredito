package Automacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Automacao.Utils.Utils;
	
	public class Cadastro2 {

		public void selecionarValor(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
			
			utils.click(By.id("btnTenThousand"));
			
		}
		
		public void selecionarPrazo(WebDriver driver) throws InterruptedException {
		
			Automacao.Utils.Utils utils = new Utils(driver);
		
			utils.click(By.id("btnOtherTerm"));
			utils.click(By.xpath("//option[@value=\"15\"]"));
			
		}
		
		
		public void criarCadastro(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
			
			utils.inserirText(By.id("name"), "Alice Elisa Lorena Galvão");
			utils.inserirText(By.id("email"), "aaliceelisalorenagalvao@regler.com.br");
			utils.click(By.id("btnContinue"));
		}
		
		public void preencherDados(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
			
			utils.inserirText(By.id("borrower.cpf"), "02175042057");
			utils.inserirText(By.id("borrower.dateOfBirth"), ("23021989"));
			utils.inserirText(By.id("borrower.monthlyGrossIncome"), ("7680,00"));
			utils.click(By.id("borrower.gender"));
			utils.click(By.id("borrower.maritalStatusOthers"));
			utils.click(By.xpath("//option[text()=\"Divorciado(a)\"]"));
			utils.click(By.id("borrower.jobType"));
			utils.click(By.xpath("//option[text()=\"Empresário\"]"));
			utils.click(By.id("borrower.profession"));
			utils.click(By.xpath("//option[@value=\"5579cb34-a823-4ccb-8aa5-a66c81acf1a9\"]"));
			utils.click(By.id("borrower.educationLevel"));
			utils.click(By.xpath("(//option[@value=\"4\"])[3]"));
			utils.click(By.id("borrower.bankingData.bankNumber"));
			utils.click(By.xpath("//option[@value=\"999\"]"));
			utils.click(By.id("borrower.bankingData.hasCheckbook"));
			utils.click(By.id("borrower.hasNegativeCreditRecord2"));
			utils.click(By.id("hasProperty"));
			utils.click(By.id("hasVehicle"));
			utils.click(By.id("button-borrower-info"));
		}
		
		public void cepInvalido(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
			utils.inserirText(By.id("homeAddress.cep"), "12345678");
			if(utils.validarError()) {
				System.out.println("MENSAGEM DE ERRO VALIDADO COM SUCESSO");
			} else {
				System.out.println("NÃO FOI POSSÍVEL VALIDAR");
			}
		}
		
		public void preencherEndereço(WebDriver driver) throws InterruptedException {
			
			Automacao.Utils.Utils utils = new Utils(driver);
		
			utils.inserirText(By.id("homeAddress.cep"), "54767282");
			Thread.sleep(2000);
			utils.inserirText(By.id("homeAddress.number"), "14");
			utils.inserirText(By.id("homeAddress.additionalData"), "Casa da esquina");
			utils.inserirText(By.id("mobilePhone"), "81992783529");
			utils.inserirText(By.id("homePhone"), "8135079739");
			utils.click(By.id("button-borrower-info"));
		}

}
