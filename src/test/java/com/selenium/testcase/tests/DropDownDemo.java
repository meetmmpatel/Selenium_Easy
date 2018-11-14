package com.selenium.testcase.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class DropDownDemo extends TestBaseClass {

	@Test(priority = 0)
	public void getWebsite() {
		webDriver.navigate().to("https://the-internet.herokuapp.com/");

	}

	@Test(priority = 1)
	public void findAndClickDropDown() {
		webDriver.findElement(By.cssSelector("#content > ul > li:nth-child(9) > a")).click();

		WebElement dropDown = webDriver.findElement(By.id("dropdown"));

		Select select = new Select(dropDown);

		select.selectByIndex(1);

	}

}
