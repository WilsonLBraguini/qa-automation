package scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.LojaPage;

public class TesteCompraLojaVirtual {
	
	static ChromeDriver driver;
	LojaPage lojaPage = new LojaPage(driver);

	@BeforeClass
	public static void beforeClass() {
		driver = setupChromeDriver();
		driver.get("http://automationpractice.com/index.php");// Abrindo uma pagina

	}

	@Test
	public void loginTest() throws InterruptedException {
		
		lojaPage.clicarNoBotaoEntrar();
		lojaPage.preencheEmail();
		lojaPage.informarSenha();
		lojaPage.clicarEmSubmeter();

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
		driver.manage().window().maximize();
//		"--disable-web-security", "--ignore-certificate-errors", "--allow-running-insecure-content", "--allow-insecure-localhost", "--disable-gpu", "window-size=1200x600", "disable-popup-blocking", "disable-infobars"
//		);
		
		return driver;
		
	}

}
