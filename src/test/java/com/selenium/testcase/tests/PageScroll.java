package com.selenium.testcase.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class PageScroll extends TestBaseClass {

	@Test(priority = 0)
	public void getWebSite() {

		webDriver.navigate().to("https://the-internet.herokuapp.com/");
	}

	@Test(priority = 1)
	public void testPageScroll() {

		WebElement scorll = webDriver.findElement(By.cssSelector("#content > ul > li:nth-child(36) > a"));
		scorll.click();

		JavascriptExecutor js = (JavascriptExecutor) webDriver;

		js.executeScript("scrollBy(0,2500)");

	}

}
