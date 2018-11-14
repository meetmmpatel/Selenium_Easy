package com.selenium.testcase.tests;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class BrowserSetting extends TestBaseClass {

	@Test(priority = 0)
	public void getWebSite() {

		webDriver.navigate().to("https://the-internet.herokuapp.com/");
	}

	@Test(priority = 1)
	public void testUrlInfo() {

		webDriver.navigate().refresh();

		System.out.println(webDriver.getCurrentUrl());

//		webDriver.manage().window().maximize();
		webDriver.manage().window().setPosition(new Point(0, -1000));
		
		int width = 600;
		int height = 400;
		
		Dimension dimension = new Dimension(width, height);
		webDriver.manage().window().setSize(dimension);

	}

}
