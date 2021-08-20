package scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.LoginLojaVirtualPage;
import pages.CompraLojaVirtualPage;

public class TesteCompraLojaVirtual {
	
	static ChromeDriver driver;
	CompraLojaVirtualPage lojaPage = new CompraLojaVirtualPage(driver);
	LoginLojaVirtualPage loginPage = new LoginLojaVirtualPage(driver);

	@BeforeClass
	public static void beforeClass() {
		driver = setupChromeDriver();
		driver.get("http://automationpractice.com/index.php");// Abrindo uma pagina

	}

	@Test
	public void loginTest() throws InterruptedException {
		
		loginPage.clicarNoBotaoEntrar();
		loginPage.preencheEmail();
		loginPage.informarSenha();
		loginPage.clicarEmSubmeter();
		lojaPage.clicarNaCategoriaMulheres();
		lojaPage.clicarNoItemCamiseta();
		lojaPage.adicionarItemCamisetasNoCarrinho();
		lojaPage.clicarEmFazerCheckout();
		lojaPage.alterarQtdItemNoCarrinho();
		lojaPage.removerItemDoCarrinho();
		lojaPage.clicarNaCategoriaMulheres();
		lojaPage.clicarNaCategoriaMulheres();
		lojaPage.adicionarItemCamisetasNoCarrinho();
		lojaPage.clicarEmContinuarParaCheckout();
		lojaPage.clicarEmCheckout();
		lojaPage.clicarEmCheckoutAddress();
		lojaPage.clicarNoCheckboxTermosDeServico();
		lojaPage.clicarEmCheckoutEntrega();
		lojaPage.pagarPorBankWire();
		lojaPage.confirmarMinhaCompra();
		lojaPage.voltarParaVerificarMinhaCompra();
		lojaPage.irParaHome();
		lojaPage.sair();

    }
	
	@AfterClass
	public static void AfterClass() {
		
//		driver.quit();
	}
	
	public static ChromeDriver setupChromeDriver() {
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments( "--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1200, 765));
//		"--disable-web-security", "--ignore-certificate-errors", "--allow-running-insecure-content", "--allow-insecure-localhost", "--disable-gpu", "window-size=1200x600", "disable-popup-blocking", "disable-infobars"
//		);
		
		return driver;
		
	}

}
