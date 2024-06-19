package rerunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "@C:\\Users\\ajith\\eclipse-workspace\\CucumberProjects\\rerunner\\rerun.txt",
		
		glue = "org.stepdefintions",
		
		monochrome = true
		
		
		
		
		)









public class FailedTestCase {

}
