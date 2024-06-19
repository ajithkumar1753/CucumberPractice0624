package org.stepdefintions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFuntion {
	
	
	 WebDriver driver;
	 JavascriptExecutor js;
	
	
	
	@Given("Config the browser and open thr browser and enter URL")
	public void config_the_browser_and_open_thr_browser_and_enter_URL() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()=' Signup / Login']")));
}

	@When("User Enter the vaild username and vaild password")
	public void user_Enter_the_vaild_username_and_vaild_password() {
	  
	WebElement email = driver.findElement(By.xpath("//input[@type='email'][@data-qa='login-email']"));
	email.sendKeys("hftdtyt@gmail.com");
	
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("36599644");
	
		
		
	}

	@When("click the submit to vilad the scenario")
	public void click_the_submit_to_vilad_the_scenario() {
	 
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit'][@data-qa='login-button']"));
		submit.click();
		
		
		
	}

	@Then("Login function got successfull and close the browser")
	public void login_function_got_successfull() {
	    
		driver.close();
		
		
	}
		
}
