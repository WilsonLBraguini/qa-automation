package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLojaVirtualPage {
	
public ChromeDriver driver;

public final String ENTRAR = "//a[contains(text(),'Sign in')]";
public final String EMAIL = "//input[@id='email']";
public final String SENHA = "//input[@id='passwd']";
public final String SUBMIT = "//button[@id='SubmitLogin']";
	
//	public final String ENTRAR = "//a[contains(text(),'Sign in')]";
	
	/**
	 * Metodo Contrutor
	 * @param outroDriver
	 */
	public LoginLojaVirtualPage(ChromeDriver outroDriver) {
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
	
	

}
