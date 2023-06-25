package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login1 {
WebDriver driver;
	
	public Login1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement Signup;
	
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement Signupvisible;
    
    
    @FindBy(xpath = "(//input[@name='email'])[1]")
    WebElement email;
    
    @FindBy(xpath = "//input[@name='password']")
    WebElement pass;
    
    @FindBy(xpath = "//a[text()=' Home']")
    WebElement Homepage;
    
    @FindBy(xpath = "//h2[text()='Login to your account']")
    WebElement text;
    
    @FindBy(xpath = "//button[text()='Login']")
    WebElement login;
    
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    WebElement visibletext;
    
    @FindBy(xpath = "//a[text()=' Logout']")
    WebElement logout;    
    
    
    public void homeVerify () {
    	Assert.assertTrue(Homepage.isDisplayed());
    	Signup.click();
        Assert.assertTrue(Signupvisible.isDisplayed());
    }
	public void logincheck () throws InterruptedException{
		
		Assert.assertTrue(Homepage.isDisplayed());		
		Signup.click();
		Assert.assertTrue(text.isDisplayed());	
		email.sendKeys("shivam123.hv@gmail.com");
		pass.sendKeys("abc");
		login.click();
		
		Assert.assertTrue(Signup.isDisplayed());	
		
}
	public void logAsDisplay () {
		Assert.assertTrue(visibletext.isDisplayed());	
		logout.click();
	}
}

