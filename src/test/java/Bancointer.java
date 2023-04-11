
import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class Bancointer {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// codigo para indicar o navegador
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// comando para chamar o driver dentro do before
		driver = new ChromeDriver();
		// comando para url
		driver.get("https://www.4devs.com.br/");
		Thread.sleep(2000);
		// comando para maximizar tela
		driver.manage().window().maximize();
		// formulario para interagir com o elemento
		driver.findElement(By.cssSelector("#top-nav > li:nth-child(23) > a")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#bt_gerar_pessoa")).click();
		Thread.sleep(2000);

		String nome = driver.findElement(By.id("nome")).getText();
		String celular = driver.findElement(By.id("celular")).getText();
		String email = driver.findElement(By.id("email")).getText();
		String cpf = driver.findElement(By.id("cpf")).getText();
		String datanascimento = driver.findElement(By.id("data_nasc")).getText();

		// codigo para indicar o navegador
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// comando para chamar o driver dentro do before
		driver = new ChromeDriver();
		// comando para url
		driver.get("https://www.bancointer.com.br/");

		// comando para maximizar tela
		driver.manage().window().maximize();
		// formulario para interagir com o elemento
		driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.name("nome")).sendKeys("Washington");
		Thread.sleep(1000);
		driver.findElement(By.id("celular")).sendKeys("11988516013");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("jackdosfrango@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("cpf")).sendKeys("12345678900");
		Thread.sleep(1000);
		driver.findElement(By.id("dataNascimento")).sendKeys("28042022");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(
				"body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > div > span > button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(
				"body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.filled > button"))
				.click();

	}

	@After
	public void tearDown() throws Exception {		
		driver.quit();		
		

	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > div > main > section:nth-child(1) > div > div > div.col-12.col-md-6.col-lg-5 > h2 > span.d-block"))
				.click();

	}

}