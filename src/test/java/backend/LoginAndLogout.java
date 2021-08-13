package backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.getDriver();
		
		WebElement account = driver.findElement(By.xpath("//header/ul[2]/li[1]/a[1]"));
		account.click();
		
		WebElement logout = driver.findElement(By.xpath("//header/ul[2]/li[1]/div[1]/a[2]"));
		logout.click();
		
		}
		

	


}
