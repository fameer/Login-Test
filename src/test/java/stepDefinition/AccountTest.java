package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;

public class AccountTest extends BaseClass {

	@When("^I click Accounts tab$")
	public void I_click_Accounts_tab() throws InterruptedException  {
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("a[title='Leads Tab']")).click();
		driver.findElement(By.linkText("Accounts")).click(); // using the parameterized method to select the accounts tab
		//driver.navigate().to("https://na174.salesforce.com/001/o");
	
		
	}
	
	@Then("^I am on Accounts home page$")
	public void I_am_on_Accounts_home_page() {
		String acctHome = driver.findElement(By.className("pageDescription")).getText();
		Assert.assertEquals("Home", acctHome);
		
	    
	}
	
	@Then("^I click the  new button$")
	public void I_click_the_new_button() {
		driver.findElement(By.name("new")).click();
	}
	
	@Then("^I enter Account Name Field$")
	public void I_enter_Account_Name_Field()  {
		driver.findElement(By.id("acc2")).sendKeys("faizan");
	}
	
	@When("^I click the save button$")
	public void I_click_the_save_button()  {
		driver.findElement(By.name("save")).click();
	}
	
	@Then("^I should see the Account record$")
	public void I_should_see_the_Account_record()  {
		System.out.println(driver.getCurrentUrl());
	
	}
	@Then("^I should see the Rating filed$")
	public void I_should_see_the_Rating_filed()  {
	   boolean isRatingPresent = driver.findElement(By.id("acc9")).isDisplayed();
	   Assert.assertTrue(isRatingPresent);
	    
	}
	
	@Then("^I select Hot from the Rating field$")
	public void I_select_Hot_from_the_Rating_field()  {
	WebElement ratingField = driver.findElement(By.id("acc9"));
	Select rating = new Select(ratingField);
		rating.selectByValue("Hot");
	    
	}
	@When("^I crate an Account$")
	public void I_crate_an_Account(DataTable accountDetails)  {
		List<Map<String, String>> accountData = accountDetails.asMaps(null, null);
		System.out.println(accountData.size());
		for(Map<String, String> data : accountData) {
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.name("new")).click();
			driver.findElement(By.id("acc2")).sendKeys(data.get("Account Name"));
			WebElement type = driver.findElement(By.id("acc9"));
			Select typeField = new Select(type);
			typeField.selectByValue(data.get("Rating"));
			driver.findElement(By.id("acc5")).sendKeys(data.get("Account Number"));
			driver.findElement(By.id("acc12")).sendKeys("Website");
			driver.findElement(By.name("save")).click();
			
	
	}
	}
	@When("^I click the \"([^\"]*)\" button$")
	public void I_click_the_button(String buttonname) {
		driver.findElement(By.name(buttonname)).click();
		
	
	
	}
	
	@When("^I click \"([^\"]*)\" tab$")
	public void I_click_tab(String menutab)  {
		driver.findElement(By.linkText(menutab)).click();
	
	}
	
	@Then("^I am on \"([^\"]*)\" home page$")
	public void I_am_on_home_page(String expectedPage)  {
		String actaulPage = driver.findElement(By.className("pageType")).getText();
		String expPage = expectedPage;
		Assert.assertEquals(expPage, actaulPage);
	
	}
	
	
	
	@Then("^I select \"([^\"]*)\" from the Rating field$")
	public void I_select_from_the_Rating_field(String Hot)  {
		WebElement ratingField = driver.findElement(By.id("acc9"));
		Select rating = new Select(ratingField);
		rating.selectByValue(Hot);
	    
	}
	
	@Then("^I enter \"([^\"]*)\" for the \"([^\"]*)\" field$")
	public void I_enter_for_the_field(String text, String locator) {
		driver.findElement(By.id(locator)).sendKeys(text);
	    
	}
	

}
