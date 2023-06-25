package GridTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneP.Manipal_Capstone.GridConfig;
import PageObject.Cart;
import PageObject.Login2;

public class CartTestCase extends GridConfig {
	Cart Cartobj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		Cartobj= new Cart(driver);


}
	@Test
	public void test1() throws IOException, InterruptedException {
		
		
	Cartobj.homeVerify();	
    Cartobj.addProducts();
    Cartobj.removeProducts();

		driver.quit();
		
	}
}
