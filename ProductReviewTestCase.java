package GridTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneP.Manipal_Capstone.GridConfig;
import PageObject.Review;
import PageObject.Search;

public class ProductReviewTestCase extends GridConfig {
	Review reviewobj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		reviewobj= new Review (driver);
	


}
	@Test
	public void test1() throws IOException, InterruptedException {
		
       reviewobj.review();
       reviewobj.reviewSection();

		driver.quit();
		
	}
	
	
	
	
	
}
