package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"StepDefinitions", "AppHooks"},
		//tags ="@Smoke",
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	
				"timeline:test-output-thread/"
		}		
				)

public class MyTestRunner{
	
					
			}
			
			
	


