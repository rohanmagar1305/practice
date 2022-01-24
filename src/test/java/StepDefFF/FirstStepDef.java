package StepDefFF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FirstStepDef {
	
	WebDriver driver=null;
	@Given("^Go to the Fb login page$")
	public void go_to_the_fb_login_page() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//go to the Fb logi page
		String url = "https://www.facebook.com/login/";
		driver.get(url);
		Thread.sleep(5000);
	    
	}

	@When("^I enter username as (.*)$")
	public void i_enter_username_as_tom(String Username) throws Exception {
		driver.findElement(By.id("email")).sendKeys(Username);
		Thread.sleep(3000);
	}

	@When("^I enter password as (.*)$")
	public void i_enter_password_as_jerry(String Pass) throws Exception {
		driver.findElement(By.id("pass")).sendKeys(Pass);
		  
		Thread.sleep(3000);
	}

	@Then("^Goin should be failed$")
	public void goin_should_be_failed() throws Exception {
		driver.findElement(By.id("loginbutton")).click();
		String title = "Log in to Facebook";
	  String ActualTitle = driver.getTitle();
	  Thread.sleep(3000);
	  Assert.assertNotSame(title,ActualTitle);
		
	}
	
	@Then("^check the username as same as Entered$")
	public void check_the_username_as_same_as_entered() {
		String text = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("the entered text is :"+text);
	}

}
