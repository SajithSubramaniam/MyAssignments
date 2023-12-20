package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("MSD");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	Select first = new Select(driver.findElement(By.name("industryEnumId")));
	first.selectByIndex(3);
	Select first1 = new Select(driver.findElement(By.name("ownershipEnumId")));
	first1.selectByVisibleText("S-Corporation");
	Select first2 = new Select(driver.findElement(By.id("dataSourceId")));
	first2.selectByValue("LEAD_EMPLOYEE");
	Select first3 = new Select(driver.findElement(By.id("marketingCampaignId")));
	first3.selectByIndex(6);
	Select first4 = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
	first4.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
	driver.close();
	
	
	
	
	

	}

}
