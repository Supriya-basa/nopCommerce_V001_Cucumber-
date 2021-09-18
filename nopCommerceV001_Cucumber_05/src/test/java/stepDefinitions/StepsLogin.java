package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class StepsLogin extends BaseClass{

	@Before
	public void setup() throws IOException
	{
		//Reading properties 
		configProp = new Properties();
		FileInputStream configPropFile= new FileInputStream("config.properties");
		configProp.load(configPropFile);
		
		logger=Logger.getLogger("nopCommerce"); //Added Logger
		PropertyConfigurator.configure("log4j.properties"); //Added Logger
		
		String browser=configProp.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",configProp.getProperty("edgepath"));
			driver=new EdgeDriver();
		}
				
		driver.manage().window().maximize();
		logger.info("******Launching URL*******");
		
	}

	@Given("^User Launch Chrome Browser$")
	public void user_Launch_Chrome_Browser() {
		
		lp= new LoginPage(driver);		
	}

	@When("^User opens url \"([^\"]*)\"$")
	public void user_opens_url(String url) throws Throwable {
		logger.info("*****Opening URL*****");
		driver.get(url);
	}

	@When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String Email, String Password) throws Throwable {
		logger.info("*****Providing login details****");
		lp.setUserName(Email);
		lp.setPassword(Password);
	}

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
		logger.info("*****Started Login*****");
		lp.clickLogin();
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) throws Throwable {
		title=driver.getTitle();
		System.out.println(title);
		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();
			logger.info("*****Login Failed******");
			Assert.assertTrue(false);
		}
		else
		{
			logger.info("*****Login passed******");
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("^User click on Logout link$")
	public void user_click_on_Logout_link() throws Throwable {
		lp.clickLogout();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.close();
	}

	// Customer feature step definitions.....

	@Then("^User can view Dashboard$")
	public void user_can_view_Dashboard() throws Throwable {
		addCust=new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration",addCust.getTitle());
	}

	@When("^User click on customers Menu$")
	public void user_click_on_customers_Menu() throws Throwable {
		Thread.sleep(2000);
		addCust.clickOnCustomersMenu();
	}

	@When("^click on customers Menu Item$")
	public void click_on_customers_Menu_Item() throws Throwable {
		addCust.clickOnCustomersMenuItem();
	}

	@When("^click on Add new button$")
	public void click_on_Add_new_button() throws Throwable {
		addCust.clickOnAddNew();
		Thread.sleep(2000);
	}

	@Then("^User can view Add new customer page$")
	public void user_can_view_Add_new_customer_page() throws Throwable {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getTitle());
	}

	@When("^User enter customer info$")
	public void user_enter_customer_info() throws Throwable {
		logger.info("*****Adding a new customer******");
		logger.info("*****Providing information******");

		String email=randomeString()+"@gmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test123");

		Thread.sleep(2000);

		addCust.setManagerVendor("Vendor 2");
		addCust.setGender("Female");
		addCust.setFirstName("Supriya");
		addCust.setLastName("Basa");
		addCust.setDob("5/07/1995");
		addCust.setCompanyName("busyQAUniverse");
		addCust.setNewsLetter("Test store 2");
		addCust.setCustomerRoles("Guests");
		addCust.setAdminContent("This is for testing purpose.....");

	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		logger.info("*****Saving customer data******");
		addCust.clickOnSave();
		Thread.sleep(2000);
	}

	@Then("^User can view confirmation message \"([^\"]*)\"$")
	public void user_can_view_confirmation_message(String arg1) throws Throwable {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully"));
	}

	@When("^Enter customer Email$")
	public void enter_customer_Email() throws Throwable {
		logger.info("*****Searching customer by Email ID******");
		searchCust = new SearchCustomerPage(driver);
		searchCust.setEmail("victoria_victoria@nopCommerce.com");
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		logger.info("*****Search starts******");
		searchCust.clickOnSearch();
		Thread.sleep(3000);

	}

	@Then("^User should found Email in the search table$")
	public void user_should_found_Email_in_the_search_table() throws Throwable {
		logger.info("*****Checking the search results displayed******");
		boolean status=searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		System.out.println("Status: "+status);
		Assert.assertEquals(true,status);

	}


}
