package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login2 {
WebDriver driver;
	
	public Login2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=' Home']")
    WebElement Homepage;
    
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement Signup;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement Signupvisible;
	
	
	@FindBy(xpath="//*[text()='Login to your account']")
	public WebElement loginAccountTitle;
	
	@FindBy(xpath="//*[@data-qa='login-email']")
	public WebElement  Email;
	
	@FindBy(xpath="//*[@data-qa='login-password']")
	public WebElement Password;
	
	@FindBy(xpath="//*[@data-qa='login-button']")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[text()='Your email or password is incorrect!']")
	public WebElement incorrectEmailWrng;
	 public void homeVerify () {
	    	Assert.assertTrue(Homepage.isDisplayed());
	    	Signup.click();
	        Assert.assertTrue(Signupvisible.isDisplayed());
	    }
	public void InvalidLogin (){
		
		Signup.click();
		Assert.assertTrue(loginAccountTitle.isDisplayed());
		Email.sendKeys("piyushverma0123@gmail.com");
		Password.sendKeys("mncd123");
		loginButton.click();
		Assert.assertTrue(incorrectEmailWrng.isDisplayed());
		
		
}
}
