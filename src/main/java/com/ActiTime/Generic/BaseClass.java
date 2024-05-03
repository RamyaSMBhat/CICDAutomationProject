package com.ActiTime.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	@Before
	public void beforeMethod()
	{
		Reporter.log("opening the browser");
		driver=new ChromeDriver();
	}
	@After
	public void afterMethod() {
		Reporter.log("Closing the browser");
	}

}
