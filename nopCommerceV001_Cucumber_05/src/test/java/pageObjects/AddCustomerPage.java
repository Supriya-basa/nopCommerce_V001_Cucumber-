package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}


	By lnkCustomers_menu=By.xpath("//a[@href=\"#\"]//p[contains(text(),'Customers')]");
	By lnkCustomer_menuitem=By.xpath("//a[@href=\"/Admin/Customer/List\"]//p[contains(text(),'Customers')]");

	By btnAddNew= By.xpath("//a[@href=\"/Admin/Customer/Create\"]");

	By txtEmail=By.xpath("//input[@id=\"Email\"]");
	By txtPassword=By.xpath("//input[@id=\"Password\"]");

	By txtFirstName=By.xpath("//input[@id=\"FirstName\"]");
	By txtLastName=By.id("LastName");
	By txtcustomerRoles=By.xpath("//div[@class=\"k-multiselect-wrap k-floatwrap\"]");
	By txtNewsLetter=By.xpath("//div[@class=\"k-widget k-multiselect k-multiselect-clearable\"]/div[1]");
	By txtYourstorename=By.xpath("//li[contains(text(),'Your store name')]");
	By txtTestStore=By.xpath("//li[contains(text(),'Test store 2')]");
	
	By lstitemAdministrators=By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By lstitemModerators=By.xpath("//li[contains(text(),'Forum Moderators')]");
	By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");

	By drpmgrOfVendor=By.xpath("//*[@id=\"VendorId\"]");
	By rdMaleGender=By.xpath("//input[@id='Gender_Male']"); 
	By rdFemaleGender=By.id("Gender_Female");

	By txtDob=By.xpath("//input[@id=\"DateOfBirth\"]");

	By txtCompanyName=By.xpath("//input[@id=\"Company\"]");
	By txtAdminContent=By.xpath("//textarea[@id=\"AdminComment\"]");
	By btnSave=By.xpath("//button[@name='save']");


	//Action Methods

	public String getTitle()
	{
		return ldriver.getTitle();
	}
	public void clickOnCustomersMenu()
	{
		ldriver.findElement(lnkCustomers_menu).click();
	}
	
	public void clickOnAddNew()
	{
		ldriver.findElement(btnAddNew).click();
	}
	
	public void clickOnCustomersMenuItem()
	{
		ldriver.findElement(lnkCustomer_menuitem).click();
	}

	public void setEmail(String email)
	{
		ldriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPassword(String password)
	{
		ldriver.findElement(txtPassword).sendKeys(password);
	}

	public void setCustomerRoles(String role) throws InterruptedException
	{
		if(!role.equals("Vendors"))
		{
			ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[@title=\"delete\"]")).click();
		}

		ldriver.findElement(txtcustomerRoles).click();
		WebElement listitem;

		if(role.equals("Administrators"))
		{
			listitem=ldriver.findElement(lstitemAdministrators);
		}
		else if(role.equals("Guests"))
		{
			listitem=ldriver.findElement(lstitemGuests);
		}
		else if(role.equals("Registered"))
		{
			listitem=ldriver.findElement(lstitemRegistered);
		}
		else if(role.equals("Vendors"))
		{
			listitem=ldriver.findElement(lstitemVendors);
		}
		else
		{
			listitem=ldriver.findElement(lstitemGuests);
		}
		//listitem.click();

		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listitem);
		Thread.sleep(5000);
	}
	public void setNewsLetter(String option) throws InterruptedException
	{
		ldriver.findElement(txtNewsLetter).click();
		WebElement lstitem;
		if(option.equals("Your store name'"))
		{
			lstitem=ldriver.findElement(txtYourstorename);
		}
		else if(option.equals("Test store 2"))
		{
			lstitem=ldriver.findElement(txtTestStore);
		}
		else
		{
			lstitem=ldriver.findElement(txtTestStore);
		}
		
		//lstitem.click();
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", lstitem);
		Thread.sleep(5000);
	}
	public void setManagerVendor(String value)
	{
		Select drp=new Select(ldriver.findElement(drpmgrOfVendor));
		drp.selectByVisibleText(value);
	}

	public void setGender(String gender) 
	{
		if (gender.equals("Male"))
		{
			ldriver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Female"))
		{
			ldriver.findElement(rdFemaleGender).click();
		}
		else
		{
			ldriver.findElement(rdFemaleGender).click(); //Default
		}
	}

	public void setFirstName(String fname)
	{
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		ldriver.findElement(txtLastName).sendKeys(lname);
	}
	
	public void setDob(String dob)
	{
		ldriver.findElement(txtDob).sendKeys(dob);
	}

	public void setCompanyName(String comname)
	{
		ldriver.findElement(txtCompanyName).sendKeys(comname);
	}

	public void setAdminContent(String content)
	{
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}
	
	public void clickOnSave()
	{
		ldriver.findElement(btnSave).click();
	}

}
