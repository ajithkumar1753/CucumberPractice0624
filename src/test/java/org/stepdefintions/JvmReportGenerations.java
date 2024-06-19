package org.stepdefintions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGenerations {

	
	
	public static void reportjvm(String reportingfile) {
		
		File location = new File("C:\\Users\\ajith\\eclipse-workspace\\CucumberProjects\\JVMReports");
		
		
		Configuration config = new Configuration(location, "automationscript");
		
		
		config.addClassifications("Operating System", "Windows 11");
		config.addClassifications("Tool used", "Eclipse");
		
		
		
		List <String> filestore = new ArrayList<String>();
		
		filestore.add(reportingfile);
		
		
		
		ReportBuilder jvmReport = new ReportBuilder(filestore, config);
		jvmReport.generateReports();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
