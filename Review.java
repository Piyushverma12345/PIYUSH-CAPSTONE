package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Review {
WebDriver driver;
	
	public Review(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//*[@href='/products']")
	public WebElement productBtn;
	
	@FindBy(xpath="//*[text()='Write Your Review']")	 
	public WebElement writeReview;
	
	 
	@FindBy(xpath="//*[@id='name']")
	public WebElement name;
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='review']")
	public WebElement review;
	
	@FindBy(xpath="//*[@id='button-review']")
	public WebElement submitReview;
	
	@FindBy(xpath="//*[text()='Thank you for your review.']")
	public WebElement thanksMsg;
	
	
	@FindBy(xpath = "(//a[text()='View Product'])[1]")
    public WebElement viewProductLink;
	public void review () {
		
		productBtn.click();
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		  jss.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		  
		  productBtn.click();
		JavascriptExecutor s = (JavascriptExecutor) driver;
        s.executeScript("window.scrollBy(0,400)", "");
		
		
		viewProductLink.click();
		
		JavascriptExecutor jsss = (JavascriptExecutor) driver;
		  jsss.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		
		 // viewProductLink.click();
        
        
	
	
	  JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
      
		
		
		
	}
	public void reviewSection () {
		  Assert.assertTrue(writeReview.isDisplayed());
	        
			name.sendKeys("piyush");
			email.sendKeys("piyush@email.com");
			review.sendKeys("nice product");

			
			  JavascriptExecutor sss = (JavascriptExecutor) driver;
		        sss.executeScript("window.scrollBy(0,250)", "");
			submitReview.click();
			
			Assert.assertTrue(thanksMsg.isDisplayed());
	}
	
	
	
}
