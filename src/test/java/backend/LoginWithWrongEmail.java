package backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithWrongEmail {

	public static void main(String[] args) {

		
		
			WebDriver driver = BaseClass.getDriver();
			//Login
			//find the elements
			for(int i=0; i<5; i++) {
				
			WebElement email = driver.findElement(By.name("email"));
			WebElement password = driver.findElement(By.name("password"));
			
			//set the element input
			email.sendKeys("admin@gmail.com");
			password.sendKeys("superadmin");
			
			//find the button and click on it
			
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			
			WebElement email2 = driver.findElement(By.name("email"));
			email2.clear();
			}
			
			
	
		

	}

}
