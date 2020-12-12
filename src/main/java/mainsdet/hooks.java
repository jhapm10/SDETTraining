package mainsdet;

import io.cucumber.java.After;

public class hooks extends configuration{
	
	@After
	public void closeDriver() {
		
		Closedriver();
		
	}

}
