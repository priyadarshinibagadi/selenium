/*package com.cucumberConcepts.run;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import junit.framework.Assert;



public class CucumberSetup {
	WebDriver driver;
	@Given("^user already in login page$")
	public void user_already_in_login_page() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\New User\\Desktop\\selenium\\eclipse\\crm pro\\crmpro_project\\cucumberConcepts\\src\\test\\resources\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://classic.crmpro.com/index.html");
	}
	@When("^title of login page free crm$")
	public void title_of_login_page_free_crm() {
		String title=driver.getTitle();
		  System.out.println(title);
		String exptitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
	   Assert.assertEquals(exptitle, title);
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable logindata) {
		 List<List<String>>data = logindata.raw();
	    driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
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
	public void user_enters_new_deal_details(DataTable dealdetails) throws InterruptedException {
		 List<List<String>> details = dealdetails.raw();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='title']")).sendKeys(details.get(0).get(0));
		 driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(details.get(0).get(1));
		 driver.findElement(By.xpath("//input[@id='probability']")).sendKeys(details.get(0).get(2));
		 driver.findElement(By.xpath("//input[@id='commission']")).sendKeys(details.get(0).get(3));
	    
	}

	@Then("^close the browser$")
	public void close_the_browser(){
		driver.close();
	}

}
*/