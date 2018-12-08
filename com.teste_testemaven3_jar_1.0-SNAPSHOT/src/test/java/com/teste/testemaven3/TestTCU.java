package com.teste.testemaven3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTCU {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Augusto\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://contas.tcu.gov.br/pesquisaJurisprudencia/#/");
	}

	@Test
	public void presquisaAcordaos() throws InterruptedException {
		driver.findElement(By.id("abaAcordaos")).click();

		driver.findElement(By.id("texto-pesquisa-acordao")).click();
		driver.findElement(By.id("texto-pesquisa-acordao")).sendKeys("INSS");

		driver.findElement(By.id("ano-acordao")).click();
		driver.findElement(By.id("ano-acordao")).sendKeys("2018");		
		
		List<WebElement> elementsList = driver.findElements(By.xpath("//button[@title='Buscar']"));
		elementsList.get(1).click();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
