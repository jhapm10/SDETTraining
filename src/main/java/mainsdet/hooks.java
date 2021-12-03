package mainsdet;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import cucumber.api.Scenario;
import cucumber.api.java.After;
public class hooks extends configuration{

	@After
    public void killBrowser(Scenario scenario){
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
    }
	


}
