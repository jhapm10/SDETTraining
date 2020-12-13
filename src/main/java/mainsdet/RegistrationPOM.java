package mainsdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class RegistrationPOM extends configuration

{

//By SignupButton= By.xpath("//a[@href="http://elearningm1.upskills.in/main/auth/inscription.php"]"));
By SignupButton=By.partialLinkText("Sign up!");
By Login= By.id("login");
By urPassword=By.id("password");
By loginButton=By.id("form-login_submitAuth");
By FirstName=By.id("registration_firstname");
By LastName=By.id("registration_lastname");
By Email=By.id("registration_email");
By username=By.id("username");
By password=By.id("pass1");
By confirmPassword=By.id("pass2");
By RegisterButton=By.id("registration_submit");
By WarningSameUserRegisteration= By.xpath("//*[@class=\"alert alert-warning\"]");
By SuccessFullRegDetail = By.xpath("//*[text()[contains(.,'Dear Anjali1 Jha1,')] or text()[contains(.,'Your personal settings have been registered.')]]");
By RegistrationTitle = By.xpath("//*[@class=\"breadcrumb\"]");
By TextOfSuccessMessage=By.xpath("//*[@class=\"col-xs-12 col-md-12\"]/p");
By dropdownOnHomepage=By.xpath("//*[@class=\"dropdown-toggle\"]");
//By checkEmail=By.xpath("//*[@class=\"fa fa-envelope-o\"]");
By checkEmail=By.xpath("//*[@class=\"text-center\"]/p");


//By composeMsg=By.xpath("//*[@title=\"Compose message\"]");
By composeMsg=By.partialLinkText("Compose");

//By sendto = By.xpath("//*[@class=\"select2-selection__rendered\"]");
By sendto = By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input");

By subject =By.xpath("//*[@id=\"compose_message_title\"]");
By attachement=By.xpath("//*[@name=\"attach_1\"]");
By sendButton =By.xpath("//*[@type=\"submit\"]");
By acknowledge=By.xpath("//*[@class=\"alert alert-success\"]");
//T//he message has been sent to 

configuration cf=new configuration();

//WebDriver driver = cf.driver;
public void Signup(){
	

    cf.driver.findElement(SignupButton).click();

}

public void setFirstName(String FrstName){

    driver.findElement(FirstName).sendKeys(FrstName);

}

public void setLastName(String LstName){

    driver.findElement(LastName).sendKeys(LstName);

}

public void setEmail(String email){

    driver.findElement(Email).sendKeys(email);

}
public void username(String uname){

    driver.findElement(username).sendKeys(uname);

}
public void Password(String pass){

    driver.findElement(password).sendKeys(pass);

}
public void ConfirmPassword(String Cpass){

    driver.findElement(confirmPassword).sendKeys(Cpass);

}

public void clicRegisterButton(){

    driver.findElement(RegisterButton).click();

}

public String  SameUserSecondTimeReg(){

	String WarningForSameUser=driver.findElement(WarningSameUserRegisteration).getText();
     return WarningForSameUser;  
}
public void RegistrationSucess() {
	driver.findElement(RegistrationTitle).isDisplayed();
	driver.findElement(SuccessFullRegDetail).isDisplayed();
	String Text=driver.findElement(TextOfSuccessMessage).getText();
	System.out.println(Text);
	
}
public String successmessage() {
	String Text=driver.findElement(TextOfSuccessMessage).getText();
	System.out.println(Text);
	return Text;
}

public void clickHomeDropDown(){
	  driver.findElement(dropdownOnHomepage).click();
}

public String EmailVerify() throws InterruptedException {
	Thread.sleep(15000);
	String EmailText=driver.findElement(checkEmail).getText();
	System.out.println(EmailText);
	return EmailText;
}

public void mailCompose() throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@title=\"Homepage\"]")).click();
	
	driver.findElement(composeMsg).click();
	Thread.sleep(40000);
	driver.findElement(sendto).clear();
	driver.findElement(sendto).sendKeys("tst");
	Thread.sleep(10000);
	driver.findElement(sendto).sendKeys(Keys.ENTER);
	driver.findElement(subject).sendKeys("TestMail");
//WebDriverWait wait = new WebDriverWait(driver, 30);
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cke_1_contents\"]")));

	//driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]")).clear();
	//driver.findElement(By.xpath("/html/body/p[2]")).sendKeys("Hi TestUser,I am sending Mail   Thanks");

	driver.findElement(attachement).sendKeys("C:\\Users\\AnjaliJha\\eclipse-workspace\\assignment\\email.txt");
	driver.findElement(sendButton).sendKeys(Keys.ENTER);



	
}

public String getachkowledgement() {
	String ack=driver.findElement(acknowledge).getText();
	System.out.println(ack);
	
	return  ack;
}

public void ClickLogin(){
	  driver.findElement(loginButton).click();
}

public void setLoginInformation(String id,String pass){

    driver.findElement(Login).sendKeys(id);
    driver.findElement(urPassword).sendKeys(pass);

}

}
