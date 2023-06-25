package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
public class Register {

		WebDriver driver;
	    public Register(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
}
	    @FindBy(xpath = "//a[text()=' Home']")
	    WebElement Homepage;
	    
	    @FindBy(xpath = "//a[text()=' Signup / Login']")
	    WebElement Signup;
	    
	    @FindBy(xpath = "//h2[text()='New User Signup!']")
	    WebElement Signupvisible;
	    
	    @FindBy(xpath = "//input[@name='name']")
	    WebElement name;
	    
	    @FindBy(xpath = "(//input[@name='email'])[2]")
	    WebElement email;
	    
	    @FindBy(xpath = "//button[text()='Signup']")
	    WebElement signupbtn;
	    
	    @FindBy(xpath = "//b[text()='Enter Account Information']")
	    WebElement text;
	    
	    @FindBy(xpath = "//input[@id='id_gender1']")
	    WebElement gender;
	    
	    @FindBy(xpath = "//input[@id='name']")
	    WebElement name1;
	    
	    @FindBy(xpath = "//input[@id='password']")
	    WebElement password;
	    
	    @FindBy(xpath = "//select[@id='days']")
	    WebElement day;
	    
	    @FindBy(xpath = "//select[@id='months']")
	    WebElement month;
	    
	    @FindBy(xpath = "//select[@id='years']")
	    WebElement year;
	    
	    @FindBy(xpath = "//input[@id='newsletter']")
	    WebElement checkbox1;
	    
	    @FindBy(xpath = "//input[@id='optin']")
	    WebElement checkbox2;
	    
	    @FindBy(xpath = "//input[@id='first_name']")
	    WebElement Firstname;
	    
	    @FindBy(xpath = "//input[@id='last_name']")
	    WebElement Lastname;
	    
	    @FindBy(xpath = "//input[@id='company']")
	    WebElement Company;
	    
	    @FindBy(xpath = "//input[@id='address1']")
	    WebElement Address;
	    
	    @FindBy(xpath = "//input[@id='address2']")
	    WebElement Address2;
	    
	    @FindBy(xpath = "//select[@id='country']")
	    WebElement Country;
	    
	    @FindBy(xpath = "//input[@id='state']")
	    WebElement state;
	    
	    @FindBy(xpath = "//input[@id='city']")
	    WebElement city;
	    
	    @FindBy(xpath = "//input[@id='zipcode']")
	    WebElement zipcode;
	    
	    @FindBy(xpath = "//input[@id ='mobile_number']")
	    WebElement mobile;
	    
	    @FindBy(xpath = "//button[text()='Create Account']")
	    WebElement Creataccbtn;
	    
	    @FindBy(xpath = "//b[text()='Account Created!']")
	    WebElement visibletext;
	    
	    @FindBy(xpath = "(//a[@href='/'])[3]")
	    WebElement continuebtn;
	    
	    
	    @FindBy(xpath = "//a[text()=' Logged in as ']")
	    WebElement textverify;
	    
	    @FindBy(xpath = "//a[text()=' Delete Account']")
	    WebElement delete;
	    
	    @FindBy(xpath = "//b[text()='Account Deleted!']")
	    WebElement delaccvisible;
	    
	    @FindBy(xpath = "//a[text()='Continue']")
	    WebElement contbtn;
	    
	   
	    
	    public void homeVerify () {
	    	Assert.assertTrue(Homepage.isDisplayed());
	    	Signup.click();
	        Assert.assertTrue(Signupvisible.isDisplayed());
	    }
	  
public void SignupCheck(String Port)	  {
	
    
if(Port.equals("5555")) {
    name.sendKeys("piyush");
    email.sendKeys("shiva12345.hv@gmail.com");
    
    signupbtn.click();
    
    
    Assert.assertTrue(text.isDisplayed());
    
    gender.click();
    name1.clear(); 
    
    
    name1.sendKeys("piyush");
    password.sendKeys("abc");
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
    
    
    Select objSelect =new Select(day);
    objSelect.selectByVisibleText("15");
    
    Select objSelect1 =new Select(month);
    objSelect1.selectByVisibleText("January");
    
    Select objSelect2 =new Select(year);
    objSelect2.selectByVisibleText("2010");
    
    checkbox1.click();
    checkbox2.click();
    
    
    Firstname.sendKeys("Piyush");
    Lastname.sendKeys("Verma");
    Company.sendKeys("Axis");
    Address.sendKeys("Rawatbhata");
    Address2.sendKeys("Chittorgarh");
    
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    js1.executeScript("window.scrollBy(0,500)", "");
    
    Select objSelect3 =new Select(Country);
    objSelect3.selectByVisibleText("India");
    
    
    state.sendKeys("Rajasthan");
    city.sendKeys("Kota");
    zipcode.sendKeys("323307");
    mobile.sendKeys("9876543210");
}else {
	name.sendKeys("Ayush");
    email.sendKeys("hariom2vc.56hv@gmail.com");
    
    signupbtn.click();
    
    
    Assert.assertTrue(text.isDisplayed());
    
    gender.click();
    name1.clear(); 
    
    
    name1.sendKeys("Ayush");
    password.sendKeys("abc");
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
    
    
    Select objSelect =new Select(day);
    objSelect.selectByVisibleText("15");
    
    Select objSelect1 =new Select(month);
    objSelect1.selectByVisibleText("January");
    
    Select objSelect2 =new Select(year);
    objSelect2.selectByVisibleText("2010");
    
    checkbox1.click();
    checkbox2.click();
    
    
    Firstname.sendKeys("Ayush");
    Lastname.sendKeys("Verma");
    Company.sendKeys("Axis");
    Address.sendKeys("Rawatbhata");
    Address2.sendKeys("Chittorgarh");
    
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    js1.executeScript("window.scrollBy(0,500)", "");
    
    Select objSelect3 =new Select(Country);
    objSelect3.selectByVisibleText("India");
    
    
    state.sendKeys("Rajasthan");
    city.sendKeys("Kota");
    zipcode.sendKeys("323307");
    mobile.sendKeys("9876543210");
}

  
}    
	    
	    

public void afterCreateAcc (){

    Creataccbtn.click();
    
    
    Assert.assertTrue(visibletext.isDisplayed());
    
    
    continuebtn.click();
    
    JavascriptExecutor ads = (JavascriptExecutor) driver;
    ads.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    continuebtn.click();
}
public void deleteAcc () {
	  Assert.assertTrue(textverify.isDisplayed());
	    
	    delete.click();

	    
	    Assert.assertTrue(delaccvisible.isDisplayed());
	    
	    contbtn.click();
	    
	    
}
}