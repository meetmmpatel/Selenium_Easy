package com.selenium.testcase.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class MouseHoverDemo extends TestBaseClass {

	@Test(priority = 0)
	public void getSite() {

		webDriver.navigate().to("https://the-internet.herokuapp.com/");
	}

	@Test(priority = 1)
	public void testMouseOver() {

		webDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[22]/a")).click();
		Actions actionsOne = new Actions(webDriver);
		WebElement userOne = webDriver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
		actionsOne.moveToElement(userOne).perform();

		WebElement userTwo = webDriver.findElement(By.cssSelector("#content > div > div:nth-child(4) > img"));
		actionsOne.moveToElement(userTwo).perform();

		WebElement userThree = webDriver.findElement(By.cssSelector("#content > div > div:nth-child(5) > img"));
		actionsOne.moveToElement(userThree).perform();
	}

}
