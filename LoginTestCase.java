package GridTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneP.Manipal_Capstone.GridConfig;
import PageObject.Login1;
import PageObject.Register;

public class LoginTestCase extends GridConfig {
Login1 log1obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		log1obj= new Login1(driver);


}
	@Test
	public void test1() throws IOException, InterruptedException {
		
		log1obj.homeVerify();
		log1obj.logincheck();
		log1obj.logAsDisplay();

		driver.quit();
	}
	
	
}
