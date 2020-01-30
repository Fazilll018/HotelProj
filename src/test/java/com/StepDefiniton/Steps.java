package com.StepDefiniton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

	@When("User Enter the {string} and {string}")
	public void user_Enter_the_and(String s, String s1) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(s1);
	}

	@Then("User Click the LoginButton")
	public void user_Click_the_LoginButton() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
		
	    
	}
	
	
	
	@Then("user select {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_select(String loc, String hotel, String room, String no_room, String 	in, String out, String adult) {
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s=new Select(location);
		s.selectByVisibleText(loc);
		
		WebElement hot = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1=new Select(hot);
		s1.selectByVisibleText(hotel);
		
		WebElement type = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s3=new Select(type);
		s3.selectByVisibleText(room);
		
		WebElement no = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s4=new Select(no);
		s4.selectByVisibleText(no_room);
		
		WebElement check_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		check_in.clear();
		check_in.sendKeys(in);
		
		WebElement check_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		check_out.clear();
		check_out.sendKeys(out);
		
		WebElement adu = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s5=new Select(adu);
		s5.selectByVisibleText(adult);		
	    
	}

	@Then("user click the search button")
	public void user_click_the_search_button() {
		
		
		 driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
    
	}
	@Then("user clicks the select radio button and click continue")
	public void user_clicks_the_select_radio_button_and_click_continue()  {
driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
driver.findElement(By.xpath("//input[@id='continue']")).click();

	}
	
	@Then("user type {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_type(String fn, String ln, String add, String c_no, String c_type, String month, String year, String cvv) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(fn);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(ln);
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(add);
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys(c_no);
		WebElement ctype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s =new Select(ctype);
		s.selectByVisibleText(c_type);
		WebElement cmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s2 =new Select(cmonth);
		s2.selectByVisibleText(month);
		
		
		WebElement cyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s3 =new Select(cyear);
		s3.selectByVisibleText(year);
		
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys(cvv);
		
	   driver.findElement(By.xpath("//input[@id='book_now']")).click();
	   
	   Thread.sleep(7000);
	   
	   String txt = driver.findElement(By.xpath("//input[@id='order_no']")).getAttribute("value");
	   System.out.println(txt);
	   driver.close();
	   
	}

	

}
