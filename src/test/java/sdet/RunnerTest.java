package sdet;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/AnjaliJha/eclipse-workspace/assignment/FeatureFolder/Registeration.feature",
glue= {"sdet","mainsdet"},
stepNotifications=true,
tags= "@existinguserRegisteration",
monochrome=true,
plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber-html-reports/cucumber.json","junit:target/cucumber-result.xml"})
public class RunnerTest {}


	
	
	


