package com.selenium.testcase.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.selenium.testcase.base.TestBaseClass;

public class TestLeavePage extends TestBaseClass {

	@Test(priority = 0)
	public void getWebSite() {
		webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority = 1)
	public void testUsenamePasswrod() {
		WebElement username = webDriver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		webDriver.findElement(By.id("txtUsername")).clear();
		username.sendKeys("Admin");
		webDriver.findElement(By.id("txtUsername")).getText();

		WebElement password = webDriver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
	}
	
	@Test(priority = 2)
	public void  testClickSubmit() {
		webDriver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority = 3)
	public void testClickDashBoradTab() {
		webDriver.findElement(By.id("menu_dashboard_index")).click();
		webDriver.findElement(By.className("quickLinkText")).click();
		
		
	}
	
	@Test(priority = 4)
	public void testFillTheForm() {
		WebElement empName = webDriver.findElement(By.id("assignleave_txtEmployee_empName"));
		
	      empName.sendKeys("Linda Anderson");
	      WebElement dropDown = webDriver.findElement(By.id("assignleave_txtLeaveType"));
	      Select select = new Select(dropDown);
	      select.selectByIndex(1);
	      
	      WebElement  fromDate = webDriver.findElement(By.id("assignleave_txtFromDate"));
	      fromDate.clear();
	      fromDate.sendKeys("2018-11-13");
	      
	      WebElement toDate = webDriver.findElement(By.id("assignleave_txtToDate"));
	      toDate.clear();
	      toDate.sendKeys("2018-11-15");
	      
	      WebElement dropDownDuration = webDriver.findElement(By.name("assignleave[duration][duration]"));
	      Select selectDuration = new Select(dropDownDuration);
	      selectDuration.selectByValue("full_day");
	      
//	      WebElement comments = webDriver.findElement(By.id("assignleave_txtComment"));
//	      comments.sendKeys("Nice to get some break!!");
	      
	      WebElement assign = webDriver.findElement(By.id("assignBtn"));
	      assign.click();
	      
		
	}
	

}
