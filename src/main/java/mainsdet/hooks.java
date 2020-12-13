package mainsdet;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class hooks extends configuration{
	
	@After
	public void closeDriver() {
		
		Closedriver();
		
	}
	public void embedScreenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(1000); 
		
		String snapTime=Integer.toString(rand_int1);
		File file = new File("./target/screenshots/"+snapTime+".png");
		FileHandler.copy(src, file);
		
	}

	@AfterStep
	public void afterStep() throws Throwable {
		embedScreenshot();
		
	}

}
