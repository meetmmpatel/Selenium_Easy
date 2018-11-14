package com.selenium.testcase.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class RightClikDemo  extends TestBaseClass{
	
	@Test
	public void getWebSite() {
		
		webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void testRightClick() {
		
		Actions action = new Actions(webDriver);
		WebElement rightclick = webDriver.findElement(By.id("txtUsername"));
		action.contextClick(rightclick).perform();
		
		
	}

}
