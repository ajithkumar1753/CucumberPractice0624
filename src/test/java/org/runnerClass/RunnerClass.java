package org.runnerClass;

import org.stepdefintions.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;





@RunWith(Cucumber.class)
@CucumberOptions( features="C:\\Users\\ajith\\eclipse-workspace\\CucumberProjects\\src\\test\\resources\\Featurefiles",

		glue = "org.stepdefintions", monochrome =true,dryRun = false,strict=true,
		
		plugin = {"html:htmlreports/cucumber-reports.html","junit:junitreports//report.xml","json:jsonreports//report.json",
		
		"rerun:C:\\Users\\ajith\\eclipse-workspace\\CucumberProjects\\rerunner\\rerun.txt" }
		
)

public class RunnerClass {

	
	@AfterClass
	public static void filegenerated() {
		
		
		JvmReportGenerations.reportjvm("C:\\Users\\ajith\\eclipse-workspace\\CucumberProjects\\jsonreports\\report.json");
		
		
		
	}
	
	
	
	
}
