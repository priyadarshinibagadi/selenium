package com.cucumberConcepts.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

public class HooksStepdefinition {
	WebDriver driver;
	@Before
	public void launchBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\New User\\Desktop\\selenium\\eclipse\\crm pro\\crmpro_project\\cucumberConcepts\\src\\test\\resources\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://classic.crmpro.com/index.html");	
	}
	@After
	public void closeBrowser(){
		driver.close();
	}
	@Given("^user already in login page$")
	public void user_already_in_login_page() {
	System.out.println("user in login page");
	}
	@When("^title of login page free crm$")
	public void title_of_login_page_free_crm() {
		String title=driver.getTitle();
		  System.out.println(title);
		String exptitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
	   Assert.assertEquals(exptitle, title);
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		
	    driver.findElement(By.name("username")).sendKeys("naveenautomation");
	    driver.findElement(By.name("password")).sendKeys("test@123");
	}
	@Then("^user click login button$")
	public void user_click_login_button() throws InterruptedException {
		Thread.sleep(4000);
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
	    String title = driver.getTitle();
	    System.out.println(title);
		String exptitle="CRMPRO";
	    Assert.assertEquals(exptitle, title);
	}
	@Then("^user moves to the new deals$")
	public void user_moves_to_the_new_deals() {
	   driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
	   Actions act = new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']")));
	   act.moveToElement(driver.findElement(By.xpath("//a[@title='New Deal']"))).click().build().perform();
	}
	@Then("^user enters new deal details$")
	public void user_enters_new_deal_details() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='title']")).sendKeys("test1");
		 driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1000");
		 driver.findElement(By.xpath("//input[@id='probability']")).sendKeys("50");
		 driver.findElement(By.xpath("//input[@id='commission']")).sendKeys("20");
	    
	}


}
