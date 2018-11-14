package com.selenium.testcase.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class BasicCommands extends TestBaseClass {

	

	@Test(priority = 0)
	public void testWebsites() {

//		webDriver.get("https://yahoo.com");
//		webDriver.navigate().to("http://cnn.com");
		webDriver.navigate().to("Https://Opensource-Demo.Orangehrmlive.Com/");
	}

	@Test(priority = 1)
	public void testPassTheInfo() throws InterruptedException{

	
//		webDriver.navigate().to("Https://Opensource-Demo.Orangehrmlive.Com/");
		WebElement username = webDriver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
	      webDriver.findElement(By.id("txtUsername")).clear();
	      username.sendKeys("Admin");
	      webDriver.findElement(By.id("txtUsername")).getText();

		WebElement password = webDriver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
//		webDriver.findElement(By.id("btnLogin")).click();
		
		
	}

	@Test (priority = 2)
	public void testClickButtons() {

		webDriver.findElement(By.id("btnLogin")).click();
		webDriver.navigate().back();
		
//		webDriver.navigate().forward();
		webDriver.navigate().refresh();
		

	}

}
