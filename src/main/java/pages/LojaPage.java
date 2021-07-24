package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LojaPage {
	
	public ChromeDriver driver;
	
	public final String ENTRAR = "//a[contains(text(),'Sign in')]";
	public final String EMAIL = "//input[@id='email']";
	public final String SENHA = "//input[@id='passwd']";
	public final String SUBMIT = "//button[@id='SubmitLogin']";
	public final String CATEGORIA_MULHERES = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]";
	public final String ADICIONAR_ITEM_CAMISETAS = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]";
	public final String FAZER_CHECKOUT =  "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]";
	public final String ALTERAR_QTD_ITEM_NO_CARRINHO = "//tbody/tr[@id='product_1_1_0_537932']/td[5]/div[1]/a[2]/span[1]/i[1]";
	public final String REMOVER_ITEM_DO_CARRINHO = "//tbody/tr[@id='product_1_1_0_537932']/td[7]/div[1]/a[1]/i[1]";
	public final String TELA_DE_CHECKOUT = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]";
	public final String CONTINUAR_PARA_CHECKOUT = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]";
	public final String SELECIONAR_CHECKBOX_TERMOS_DE_SERVIÇOS = "//input[@id='cgv']";
	public final String CHECKOUT = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]";
	public final String PAGAR_POR_BANK_WIRE = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]";
	public final String CONFIRMAR_MINHA_COMPRA = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]";
	public final String VOLTAR_PARA_VERIFICAR_MINHA_COMPRA = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[1]/a[1]";
	public final String IR_PARA_HOME = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/span[1]";
	public final String SAIR = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]";
	
	
	
	/**
	 * Metodo Contrutor
	 * @param outroDriver
	 */
	public LojaPage(ChromeDriver outroDriver) {
		this.driver = outroDriver;
	}
	
	public void clicarNoBotaoEntrar() {
		driver.findElement(By.xpath(ENTRAR)).click();
	}
	
	public void preencheEmail() {
		driver.findElement(By.xpath(EMAIL)).sendKeys("wilson.braguini@outlook.com");
	}
	
	public void informarSenha() {
		driver.findElement(By.xpath(SENHA)).sendKeys("Wil361224");
	}
	
	public void clicarEmSubmeter() {
		driver.findElement(By.xpath(SUBMIT)).click();

	}
	
	public void clicarNaCategoriaMulheres() {
		driver.findElement(By.xpath(CATEGORIA_MULHERES)).click();

	}
	
	public void adicionarItemCamisetasNoCarrinho() {
		driver.findElement(By.xpath(ADICIONAR_ITEM_CAMISETAS)).click();

	}
	
	public void clicarEmFazerCheckout() {
		driver.findElement(By.xpath(FAZER_CHECKOUT)).click();

	}
	
	public void alterarQtdItemNoCarrinho() {
		driver.findElement(By.xpath(ALTERAR_QTD_ITEM_NO_CARRINHO)).click();

	}
	
	public void removerItemDoCarrinho() {
		driver.findElement(By.xpath(REMOVER_ITEM_DO_CARRINHO)).click();

	}
	
	public void clicarEmContinuarParaCheckout() {
		driver.findElement(By.xpath(CONTINUAR_PARA_CHECKOUT)).click();

	}
	
	public void pagarPorBankWire() {
		driver.findElement(By.xpath(PAGAR_POR_BANK_WIRE)).click();

	}
	
	public void confirmarMinhaCompra() {
		driver.findElement(By.xpath(CONFIRMAR_MINHA_COMPRA)).click();

	}
	
	public void voltarParaVerificarMinhaCompra() {
		driver.findElement(By.xpath(VOLTAR_PARA_VERIFICAR_MINHA_COMPRA)).click();

	}
	
	public void irParaHome() {
		driver.findElement(By.xpath(IR_PARA_HOME)).click();

	}
	
	public void sair() {
		driver.findElement(By.xpath(SAIR)).click();

	}
	
	

	

}
