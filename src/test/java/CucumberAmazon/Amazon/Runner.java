package CucumberAmazon.Amazon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature",
		glue="classpath:stepDefinations",
		plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
		//monochrome = true 
		)
public class Runner { 
	
}

