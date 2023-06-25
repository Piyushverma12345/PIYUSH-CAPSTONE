package GridTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneP.Manipal_Capstone.GridConfig;
import PageObject.Login1;
import PageObject.Login2;

public class InvalidLoginTestCase  extends GridConfig{

	
	Login2 log2obj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		log2obj= new Login2(driver);


}
	@Test
	public void test1() throws IOException, InterruptedException {
		
		log2obj.homeVerify();
		log2obj.InvalidLogin();

		driver.quit();
	}
}
