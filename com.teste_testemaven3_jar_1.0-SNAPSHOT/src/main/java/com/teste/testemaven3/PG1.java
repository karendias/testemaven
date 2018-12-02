
package com.teste.testemaven3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {


    public static void main(String[] args) {
       
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "https://portal.tcu.gov.br/inicio/";
        String expectedTitle = "TCU";
        String actualTitle = "";

        
        driver.get(baseUrl);

        
        actualTitle = driver.getTitle();

       
        
        driver.close();
       
    }

}
