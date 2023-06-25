package GridTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CapstoneP.Manipal_Capstone.GridConfig;
import PageObject.Cart;
import PageObject.Search;

public class SearchProductsTestCase extends GridConfig {
	Search searchobj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		searchobj= new Search (driver);
	


}
	@Test
	public void test1() throws IOException, InterruptedException {
	
		searchobj.productClick();
        searchobj.ProductSearch();
        searchobj.verifyAfterLogin();

		driver.quit();
	}
}
