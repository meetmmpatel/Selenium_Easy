package com.selenium.testcase.tests;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class GetScreenShots extends TestBaseClass {

	@BeforeTest
	public void setTest() {
		webDriver.manage().window().fullscreen();
		webDriver.navigate().to("Https://google.com");
		webDriver.navigate().refresh();
	}

	@Test
	public void googleCalculator() {

		WebElement googleSearchBox = webDriver.findElement(By.name("q"));
		googleSearchBox.sendKeys("2+2");
		googleSearchBox.sendKeys(Keys.ENTER);

		WebElement claculatorBox = webDriver.findElement(By.id("cwos"));
		String result = claculatorBox.getText();

		Assert.assertEquals(result, "7");

	}

	@AfterMethod
	public void takeScrennShots(ITestResult testResult) throws IOException {

		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Test Fail" + testResult.getStatus());
			File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("errorScreenshots\\" + testResult.getName() + "-"
					+ Arrays.toString(testResult.getParameters()) + ".jpg"));

		}

	}

}
