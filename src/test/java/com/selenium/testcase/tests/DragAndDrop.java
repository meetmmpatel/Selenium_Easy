package com.selenium.testcase.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class DragAndDrop extends TestBaseClass {

	@Test(priority = 0)
	public void getSite() {

		webDriver.navigate().to("https://the-internet.herokuapp.com/");
	}

	@Test(priority = 1)
	public void testDragAndDrop() {

		webDriver.findElement(By.cssSelector("#content > ul > li:nth-child(8) > a")).click();

		WebElement from = webDriver.findElement(By.id("column-a"));
		WebElement to = webDriver.findElement(By.id("column-b"));

		Actions drag = new Actions(webDriver);
		
		drag.dragAndDrop(from, to).build().perform();

//		Action dragAndDrop =  drag.clickAndHold(from).moveToElement(to).release(to).build();
//		dragAndDrop.perform();

	}

}
