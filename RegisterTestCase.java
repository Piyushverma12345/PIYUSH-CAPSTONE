package GridTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneP.Manipal_Capstone.GridConfig;
import PageObject.Register;

public class RegisterTestCase extends GridConfig{
	
	Register reg1;
	
	String port;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		this.port = Port;
		driver = setup(port);
		reg1 = new Register(driver);


}
	@Test
	public void test1() throws IOException, InterruptedException {
		
		reg1.homeVerify();
		reg1.SignupCheck(port);
		reg1.deleteAcc();
	
driver.quit();
		
	}
}
