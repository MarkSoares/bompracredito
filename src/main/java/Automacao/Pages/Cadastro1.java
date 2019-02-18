package Automacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Automacao.Utils.Utils;

public class Cadastro1 {

	public void selecionarValor(WebDriver driver) throws InterruptedException {
		Automacao.Utils.Utils utils = new Utils(driver);
		utils.click(By.id("btnThreeThousand"));
	}

	public void selecionarPrazo(WebDriver driver) throws InterruptedException {
		Automacao.Utils.Utils utils = new Utils(driver);
		utils.click(By.id("btnTwelveTerm"));
	}

	public void criarCadastro(WebDriver driver) throws InterruptedException {
		Automacao.Utils.Utils utils = new Utils(driver);
		utils.inserirText(By.id("name"), "Kaique Jorge Monteiro");
		utils.inserirText(By.id("email"), "kaiquejorgemonteiro-97@gap.com.br");
		utils.click(By.id("btnContinue"));
	}

	public void cpfInvalido(WebDriver driver) throws InterruptedException {
		Automacao.Utils.Utils utils = new Utils(driver);
		utils.inserirText(By.id("borrower.cpf"), "12345678923");
		if(utils.validarError()) {
			System.out.println("MENSAGEM DE ERRO VALIDADO COM SUCESSO");
		} else {
			System.out.println("NÃO FOI POSSÍVEL VALIDAR");
		}
	}

	public void preencherDados(WebDriver driver) throws InterruptedException {

		Automacao.Utils.Utils utils = new Utils(driver);
		utils.inserirText(By.id("borrower.cpf"), utils.geraCPF());
		utils.inserirText(By.id("borrower.dateOfBirth"), ("25031997"));
		utils.inserirText(By.id("borrower.monthlyGrossIncome"), ("2800,00"));
		utils.click(By.id("borrower.gender2"));
		utils.click(By.id("borrower.maritalStatus2"));
		utils.click(By.id("borrower.jobType"));
		utils.click(By.xpath("//option[text()=\"Assalariado\"]"));
		utils.click(By.id("borrower.profession"));
		utils.click(By.xpath("//option[@value=\"66543223-cebf-40f2-998d-8387a7761ff4\"]"));
		utils.click(By.id("borrower.educationLevel"));
		utils.click(By.xpath("(//option[@value=\"2\"])[4]"));
		utils.click(By.id("borrower.bankingData.bankNumber"));
		utils.click(By.xpath("//option[@value=\"999\"]"));
		utils.click(By.id("borrower.bankingData.hasCheckbook2"));
		utils.click(By.id("borrower.hasNegativeCreditRecord2"));
		utils.click(By.id("hasProperty2"));
		utils.click(By.id("hasVehicle"));
		utils.click(By.id("button-borrower-info"));
	}

	public void preencherEndereço(WebDriver driver) throws InterruptedException {

		Automacao.Utils.Utils utils = new Utils(driver);

		utils.inserirText(By.id("homeAddress.cep"), "30230360");
		Thread.sleep(2000);
		utils.inserirText(By.id("homeAddress.number"), "265");
		utils.inserirText(By.id("mobilePhone"), "31999859087");
		utils.inserirText(By.id("homePhone"), "3129311385");
		utils.click(By.id("agreeWhatsApp"));
		utils.click(By.id("button-borrower-info"));
	}

	public void informacoePessoais(WebDriver driver) throws InterruptedException {

		Automacao.Utils.Utils utils = new Utils(driver);

		utils.click(By.id("nationality"));
		utils.click(By.id("stateOfBirth"));
		utils.click(By.xpath("(//option[text()=\"MG\"])[1]"));
		utils.click(By.id("cityOfBirth"));
		utils.click(By.xpath("//option[@value=\"Belo Horizonte\"]"));
		utils.click(By.id("rgType"));
		utils.click(By.xpath("//option[@value=\"0\"]"));
		utils.inserirText(By.id("rgEmissionDate"), "10072013");
		utils.inserirText(By.id("rg"), "271411004");
		utils.click(By.id("emmitedBy"));
		utils.click(By.xpath("//option[@value=\"SSP\"]"));
		utils.click(By.id("ufrg"));
		utils.click(By.xpath("(//option[text()=\"MG\"])[2]"));
		utils.inserirText(By.id("motherName"), "Melissa Rebeca");
		utils.click(By.id("homeType2"));
		utils.inserirText(By.id("timeInAddress"), "102010");
		utils.click(By.id("loanObjective"));
		utils.click(By.xpath("//option[@value=\"15\"]"));
		utils.click(By.id("button-personal-info"));
	}

	public void dadosProfissao(WebDriver driver) throws InterruptedException {

		Automacao.Utils.Utils utils = new Utils(driver);

		utils.inserirText(By.id("company"), "José e Tomás Construções ME");
		utils.click(By.id("incomeProof"));
		utils.inserirText(By.id("startDate"), "062014");
		utils.inserirText(By.id("workPhone"), "3138709761");
		utils.click(By.id("button-professional-info"));
	}

	public void dadosBem(WebDriver driver) throws InterruptedException {

		Automacao.Utils.Utils utils = new Utils(driver);

		utils.click(By.id("vehicleData.createDate"));
		utils.click(By.xpath("//option[@value=\"2008\"]"));
		utils.click(By.id("vehicleData.brand"));
		utils.click(By.xpath("//option[@value=\"FIAT\"]"));
		utils.click(By.id("vehicleData.model"));
		utils.click(By.xpath("//option[@value=\"PALIO FIRE 1.0 8V FLEX\"]"));
		utils.click(By.id("vehicleData.isFinanced"));
		utils.click(By.id("button-real-state-vehicle-info"));
	}

	public void dadosBanco(WebDriver driver) throws InterruptedException {

		Automacao.Utils.Utils utils = new Utils(driver);
		utils.click(By.id("bankNumber"));
	}
}
