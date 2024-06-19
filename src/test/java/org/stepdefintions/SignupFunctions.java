package org.stepdefintions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignupFunctions {

	WebDriver driver ;
	JavascriptExecutor js;
	Timeouts implicitlyWait;
	
	
	@Given("signup with Name {string} and Mailid {string}")
	public void signup_with_name_and_mailid(String Name, String email) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
		js = (JavascriptExecutor) driver;
		implicitlyWait = driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()=' Signup / Login']")));
		
		
		
	WebElement signup = driver.findElement(By.xpath("//input[@type='text'][@data-qa='signup-name']"));
	signup.sendKeys(Name);
	
	WebElement Email = driver.findElement(By.xpath("//input[@type='email'][@data-qa='signup-email']"));
	Email.sendKeys(email);
	
	implicitlyWait = driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
	
	WebElement signupbutton = driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-default'][@data-qa='signup-button']"));
	signupbutton.click();
	    
	}
	@When("Enter account information")
	public void enter_account_information() {
		
		WebElement MR = driver.findElement(By.xpath("//input[@type='radio'][1]"));
		MR.click();	  
		
	}
	@When("Address Informations")
	public void address_informations() {
	    
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text'][@data-qa='first_name']"));
		firstname.sendKeys("vijay");
		
	}
	@Then("Create the account successfully")
	public void create_the_account_successfully() {
		
		js.executeScript("arguments[0].click", driver.findElement(By.xpath("//button[@type='submit'][@data-qa='create-account']")));
	    
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
