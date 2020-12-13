package sdet;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="./FeatureFolder/Registeration.feature",
glue= {"sdet","mainsdet"},
stepNotifications=true,
//tags= "@LoginCheck",
monochrome=true,
plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber-html-reports/cucumber.json","junit:target/cucumber-result.xml"})
public class RunnerTest {}


	
	
	


