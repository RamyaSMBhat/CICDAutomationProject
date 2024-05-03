package com.ActiTime.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="featureFiles",
		glue= {"stepDefinations"},
		plugin = {"pretty", 
				"json:target/MyReports/report.json",
				"html:target/MyReports/report.html"}
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
