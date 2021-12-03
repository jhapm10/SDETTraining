package sdet;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)


@CucumberOptions(features="./FeatureFolder/Registeration.feature",
glue= {"sdet","mainsdet"},

tags= "@existinguserRegisteration",
monochrome=true,
plugin = { "pretty","json:target/cucumber.json",
"html:target/cucumber-pretty"}
)
public class RunnerTest {}


	
	
	


