package mainsdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class configuration {

	 static WebDriver driver;

	
	 public WebDriver driver() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	 
	 public void Closedriver() {
System.out.println("i m quitting");
			driver.quit();
		}

}
