package sdet;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import mainsdet.RegistrationPOM;
import mainsdet.configuration;

//import org.apache.commons.io.FileUtils;
import mainsdet.hooks;

public class RegisterationSteps {
	Scenario scenario;
	configuration cf = new configuration();

	WebDriver driver = cf.driver();
	RegistrationPOM RP = new RegistrationPOM();

	@Given("^User Launch the myOrganization web application$")
	public void user_launch_the_myorganization_web_application() throws Throwable {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
	    }	
	

	@When("^User click on SignUp Link for Registration$")
	public void user_click_on_signup_link_for_registration() throws Throwable {
		RP.Signup();
		
	}

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_and1(String FirstName, String LastName) throws Throwable {
		RP.setFirstName(FirstName);
		RP.setLastName(LastName);
		
	}

	@Then("^User Verify the Registration Page$")
	public void user_verify_the_registration_page() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "My Organization - My education - Registration");
	}

	@And("^user entering the (.*) and (.*)$")
	public void user_enters_the_and(String email, String username) throws Throwable {
		RP.setEmail(email);
		RP.username(username);
	}

	@And("^user will enter the (.*) and (.*)$")
	public void user_enter_the_and1(String password, String cofirmpassword) throws Throwable {
		RP.Password(password);
		RP.ConfirmPassword(cofirmpassword);
	}

	@And("^user click on Register button$")
	public void user_click_on_register_button() throws Throwable {
		RP.clicRegisterButton();
	}

	@And("^User verify the warning message as \"([^\"]*)\"$")
	public void user_verify_the_warning_message_as_something(String strArg1) throws Throwable {
		String warning = RP.SameUserSecondTimeReg();

		assertTrue(warning.equals(strArg1));
		
	}

	@And("^User verify the success message$")
	public void user_verify_the_success_message() throws Throwable {
		RP.RegistrationSucess();
	}

	@And("^User verify the success message with$")
	public void user_verify_the_success_message_with(String Message) throws Throwable {
		String successRegUser = RP.successmessage();

		//assertTrue(successRegUser.equals(Message));
		System.out.println(Message);
		System.out.println(successRegUser);
	}

	@And("^User click on homePage dropdown$")
	public void user_click_on_homepage_dropdown() throws Throwable {
		RP.clickHomeDropDown();
	}

	@And("^User verify the email as (.*)$")
	public void user_verify_the_email_as(String Email) throws Throwable {
		
		String emailofUser = RP.EmailVerify();

		assertTrue(emailofUser.equals(Email));

	}
	
	@And("^user compose message to send email$")
    public void user_compose_message_to_send_email() throws Throwable {
    RP.mailCompose();
    }
	
	 @And("^user verify mail sent message as \"([^\"]*)\"$")
	    public void user_verify_mail_sent_message_as_something(String strArg1) throws Throwable {
	      String ackmsg=RP.getachkowledgement();
	      Boolean text=driver.getPageSource().contains(strArg1);
	   
	     Assert.assertTrue(text);
	      
			
	    }
	 
	 @When("^User enters (.*) and (.*)$")
	    public void user_enters_and(String id, String pass) throws Throwable {
	     RP.setLoginInformation(id, pass);
	 	
	    }
	   @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    RP.ClickLogin();
	   
	    }
	 
	 
}
