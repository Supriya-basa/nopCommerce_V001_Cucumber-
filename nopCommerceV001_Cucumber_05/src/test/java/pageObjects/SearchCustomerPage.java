package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage {

	public WebDriver ldriver;
	WaitHelper waitHelper;

	public SearchCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(ldriver);		
	}

	@FindBy(how = How.ID, using = "SearchEmail")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "SearchFirstName")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(how = How.ID, using = "SearchLastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.ID, using = "SearchCompany")
	@CacheLookup
	WebElement txtCompany;

	@FindBy(how = How.ID, using = "SearchIpAddress")
	@CacheLookup
	WebElement txtIpAddress;

	@FindBy(how = How.ID, using = "SearchMonthOfBirth")
	@CacheLookup
	WebElement txtMonthOfBirth;

	@FindBy(how = How.ID, using = "SearchDayOfBirth")
	@CacheLookup
	WebElement txtDayOfBirth;

	@FindBy(how = How.XPATH, using = "//div[@class=\"k-multiselect-wrap k-floatwrap\"]")
	@CacheLookup
	WebElement txtCustomerRoles;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Administrators')]")
	@CacheLookup
	WebElement lnkItemAdministrators;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Forum Moderators')]")
	@CacheLookup
	WebElement lnkItemForumModerators;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Guests')]")
	@CacheLookup
	WebElement lnkItemGuests;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Registered')]")
	@CacheLookup
	WebElement lnkItemRegistered;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Vendors')]")
	@CacheLookup
	WebElement lnkItemVendors;

	@FindBy(how = How.ID, using = "search-customers")
	@CacheLookup
	WebElement btnSearch;

	@FindBy(id="customers-grid_wrapper")
	@CacheLookup
	WebElement table;

	@FindBy(how = How.XPATH, using = "//div[@id=\"customers-grid_wrapper\"]//tbody/tr")
	@CacheLookup
	List<WebElement> tableRows;

	@FindBy(how = How.XPATH, using = "//div[@id=\"customers-grid_wrapper\"]//tbody/tr/td")
	@CacheLookup
	List<WebElement>  tableColumns;

	public void setEmail(String Email)
	{
		waitHelper.WaitForElement(txtEmail, 30);
		txtEmail.clear();
		txtEmail.sendKeys(Email);		
	}

	public void setFirstName(String fname)
	{
		waitHelper.WaitForElement(txtFirstName, 30);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);		
	}

	public void setLastName(String lname)
	{
		waitHelper.WaitForElement(txtLastName, 30);
		txtLastName.clear();
		txtLastName.sendKeys(lname);		
	}

	public void clickOnSearch()
	{
		btnSearch.click();
		waitHelper.WaitForElement(btnSearch, 30);
	}

	public int getRowSize()
	{
		return (tableRows.size());
	}

	public int getColumnSize()
	{
		return (tableColumns.size());
	}

	public boolean searchCustomerByEmail(String email)
	{
		boolean flag= false;

		for(int i=1;i<=getRowSize();i++)
		{
			String emailid=table.findElement(By.xpath("//div[@id=\"customers-grid_wrapper\"]//tbody/tr["+i+"]/td[2]")).getText();
			System.out.println("Email ID search for: "+emailid);
			System.out.println(emailid);
			if(emailid.contains(email))
			{
				System.out.println("Email ID is present in the results.");
				flag=true;
			}

		}

		return flag;
	}

















}
