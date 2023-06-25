package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart {

	Actions act ;
	
	WebDriver driver;
	
    public Cart(WebDriver driver) {
    	
                                	this.driver=driver;
                                	act =new Actions(driver);
                               	PageFactory.initElements(driver, this);
                               	
}
    @FindBy(xpath="//button[text()='Continue Shopping']")
	  public WebElement ContToshop;
    
    
    
	@FindBy(xpath="//*[@href='/view_cart']")
	public WebElement cartButton;
	
	 @FindBy(xpath = "//a[text()=' Home']")
	    WebElement Homepage;
	    
	    @FindBy(xpath = "//a[text()=' Signup / Login']")
	    WebElement Signup;
	    
	    @FindBy(xpath = "//h2[text()='New User Signup!']")
	    WebElement Signupvisible;
	    
	@FindBy(xpath="(//*[text()='Add to cart'])[1]")
	  public WebElement Add1;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[3]")
	  public WebElement Add2;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[5]")
	  public WebElement Add3;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[7]")
	  public WebElement Add4;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[9]")
	  public WebElement Add5;
	
	  @FindBy(xpath="//i[@class='fa fa-times'][1]")
      public WebElement RemoveProdct1;
  	  
  	  @FindBy(xpath="//i[@class='fa fa-times'][1]")
  	  public WebElement RemoveProdct2;
  	  
  	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
  	  public WebElement RemoveProdct3;
  	  
  	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
  	  public WebElement RemoveProdct4;
  	  
  	  @FindBy(xpath = "//a[@class='cart_quantity_delete']")
  	  public WebElement RemoveProdct5;
  	  
  	@FindBy(xpath="//*[text()=' Cart'][@style='color: orange;']")
	  public WebElement Cart;
  	
  	
  	 public void homeVerify () {
	    	Assert.assertTrue(Homepage.isDisplayed());
	    	Signup.click();
	        Assert.assertTrue(Signupvisible.isDisplayed());
	    }
			
		  public void addProducts () throws InterruptedException {
				
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
				  
				
				
				 JavascriptExecutor jss = (JavascriptExecutor) driver;
			        jss.executeScript("window.scrollBy(0,250)", "");
				
				act.moveToElement(Add1).click().build().perform();
				ContToshop.click();
				
				   act.moveToElement(Add2).click().build().perform();
				   ContToshop.click();
				   
				   act.moveToElement(Add3).click().build().perform();
				   ContToshop.click();
				   
				   JavascriptExecutor jsq = (JavascriptExecutor) driver;
			        jsq.executeScript("window.scrollBy(0,450)", "");
				   
				   act.moveToElement(Add4).click().build().perform();
				   ContToshop.click();
				   
				   act.moveToElement(Add5).click().build().perform();
				   ContToshop.click();
				   
				   JavascriptExecutor jse = (JavascriptExecutor) driver;
			        jse.executeScript("window.scrollBy(0,-900)", "");
			        
			        cartButton.click();	
			   
			        
				
			}
		  public void removeProducts () throws InterruptedException {
			     
		        Assert.assertEquals(Cart.isDisplayed(), true);
				  RemoveProdct1.click();
				 
				  RemoveProdct2.click();
				 
				  RemoveProdct3.click();
				
				  RemoveProdct4.click();
				 
				  RemoveProdct5.click();
		        
		  }
			   

}
