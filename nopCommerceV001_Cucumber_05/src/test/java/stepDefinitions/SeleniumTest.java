package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LVSS\\eclipse-workspace\\nopCommerceV001_Cucumber_05\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement EmailID=driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement btnLogin=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

		EmailID.clear();
		EmailID.sendKeys("admin@yourstore.com");
		password.clear();
		password.sendKeys("admin");
		btnLogin.click();
		Thread.sleep(2000);

		String title=driver.getTitle();
		System.out.println(title);
		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
		Assert.assertEquals("Dashboard / nopCommerce administration",driver.getTitle());
		WebElement lnkCustomers_menu=driver.findElement(By.xpath("//a[@href=\"#\"]//p[contains(text(),'Customers')]"));
		WebElement lnkCustomer_menuitem=driver.findElement(By.xpath("//a[@href=\"/Admin/Customer/List\"]//p[contains(text(),'Customers')]"));
		lnkCustomers_menu.click();
		Thread.sleep(2000);
		lnkCustomer_menuitem.click();
		Thread.sleep(5000);

		WebElement searchByid=driver.findElement(By.id("SearchEmail"));
		WebElement btnSearch=driver.findElement(By.id("search-customers"));
		WebElement table=driver.findElement(By.id("customers-grid_wrapper"));

		searchByid.sendKeys("victoria_victoria@nopCommerce.com");
		btnSearch.click();

		Thread.sleep(5000);
		List<WebElement> tableRows=driver.findElements(By.xpath("//div[@id=\"customers-grid_wrapper\"]//tbody/tr"));
		List<WebElement> tableColumns=driver.findElements(By.xpath("//div[@id=\"customers-grid_wrapper\"]//tbody/tr/td"));
		int size=tableRows.size();
		System.out.println("Size: "+size);

		for(WebElement tables:tableRows)
		{
			System.out.println("Table data:"+tables.getText());
		}		

		for(int i=1;i<=size;i++)
		{
			System.out.println("Entered");
			String emailid=table.findElement(By.xpath("//div[@id=\"customers-grid_wrapper\"]//tbody/tr["+i+"]/td[2]")).getText().trim();
			System.out.println("Email ID search for: "+emailid);
			System.out.println(emailid.toString());
			if(emailid.contains("victoria_victoria@nopCommerce.com"))
			{
				System.out.println("Email ID is present in the results.");
			}

		}

	}

}
