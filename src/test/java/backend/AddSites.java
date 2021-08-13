package backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSites {

	public static void main(String[] args) {
		//BaseClass
		WebDriver driver = BaseClass.getDriver();
		
		//Login
		//find the elements
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		
		//set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");
		
		//find the button and click on it
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();
		
		WebElement site = driver.findElement(By.linkText("Sites"));
		site.click();
		
		WebElement addSite = driver.findElement(By.className("ladda-label"));
		addSite.click();
		
	
		WebElement site_name = driver.findElement(By.name("site_name"));
		WebElement site_description = driver.findElement(By.name("site_description"));
		WebElement site_url = driver.findElement(By.name("url"));
		
		//set the element input
		site_name.sendKeys("Apple");
		site_description.sendKeys("This is apple website");
		site_url.sendKeys("https://www.apple.com/imac-24/why-mac/");
		
		
		WebElement add_site = driver.findElement(By.className("dropdown-toggle"));
		add_site.click();
		
		WebElement add_site_new = driver.findElement(By.linkText("Save and new item"));
		add_site_new.click();
		
		WebElement site2 = driver.findElement(By.linkText("Sites"));
		site2.click();
		
		

		

	}

}
