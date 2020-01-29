package com.StepDefiniton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	
	@Given("user in Adactin Home Page")
	public void user_in_Adactin_Home_Page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fazil\\eclipse-workspace\\HotelProj\\Drivers\\chromedriver.exe" );
		
		 driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		driver.manage().window().maximize();
	  
	}

	@When("User Enter the Username and Password")
	public void user_Enter_the_Username_and_Password() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mohamed");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		
	  
	}

	@Then("User Click the LoginButton")
	public void user_Click_the_LoginButton() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
		
	    
	}

}
