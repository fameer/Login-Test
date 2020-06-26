package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	@Given("^I Open Chrome Browser$")
	public void I_Open_Chrome_Browser() {
//		System.setProperty("webdriver.chrome.driver", "/Users/nafaskhan/Desktop/Drivers/chromedriver");
//		driver = new ChromeDriver();
		
		caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true); // not really needed: JS enabled by default
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, System.getProperty("user.dir") + "/Drivers/phantomjs");
        driver = new PhantomJSDriver(caps);
		
		
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^I go to the Salesforce application$")
	public void I_go_to_the_Salesforce_application()  {
		driver.get("https://login.salesforce.com");
	
	}

	
	@Then("^I should see the Salesforce logo$")
	public void I_should_see_the_Salesforce_logo()  {
		boolean logoPresent = driver.findElement(By.id("logo")).isDisplayed();
		Assert.assertTrue(logoPresent);
	}

	
	@Then("^I enter \"([^\"]*)\" username$")
	public void I_enter_username(String username)  {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Then("^I enter \"([^\"]*)\" password$")
	public void I_enter_password(String password)  {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click the login button$")
	public void I_click_the_login_button()  {
		driver.findElement(By.id("Login")).click ();
	}

	
	@Then("^I should see the logout link$")
	public void I_should_see_the_logout_link()  {
		boolean isLoggedIn = driver.findElement(By.id("setupLink")).isDisplayed();
		Assert.assertTrue(isLoggedIn);
	}
	@When("^I maximize my window$")
	public void I_maximize_my_window()  {
		driver.manage().window().maximize();
	    
	}



}
