package com.sulamerica.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsuarioSystemTest {
	
	public static void main(String[] args) {
		 WebDriver driver =  new FirefoxDriver();
		 driver.get("http://localhost:8080/usuarios/new");
		 
		 WebElement nome = driver.findElement(By.name("usuario.nome"));
		 WebElement mail = driver.findElement(By.name("usuario.email"));
		 
		 nome.sendKeys("Gilberto brandao");
		 mail.sendKeys("gcbrandao@gmail.com");
		 
		 WebElement btSubmit = driver.findElement(By.id("btnSalvar"));
		 btSubmit.click();
		 
		 //
		 
		 driver.getPageSource().contains("Gilberto brandao");
		 driver.getPageSource().contains("gcbrandao@gmail.com");
		 
		 //assertTr
		 
	}

}
