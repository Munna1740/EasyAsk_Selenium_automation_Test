package backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddWarehouses {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.getDriver();
		
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));

		// set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");

		// find the button and click on it
		
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.cssSelector("body > div.app-body > div > nav > ul > li:nth-child(13) > a"));
		location.click();
		Thread.sleep(2000);
		
		WebElement warehouse = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/warehouse']"));
		warehouse.click();
		Thread.sleep(2000);
		
		for(int i=0; i<5; i++) {
		WebElement add_warehouse = driver.findElement(By.cssSelector("#app > div.container-fluid.animated.fadeIn > div > div > div.row.mb-0 > div:nth-child(1) > div > a > span"));
		add_warehouse.click();
		Thread.sleep(2000);
		
		WebElement warehourse_email = driver.findElement(By.name("email"));
		warehourse_email.sendKeys("mdmostafamunna@gmail.com");
		
		WebElement warehourse_address = driver.findElement(By.name("address"));
		warehourse_address.sendKeys("Feni");
		
		WebElement warehourse_telephone = driver.findElement(By.name("telephone"));
		warehourse_telephone.sendKeys("01824807920");
		
		WebElement warehourse_zip = driver.findElement(By.name("zip_code"));
		warehourse_zip.sendKeys("1200");
		
		WebElement save_and_back = driver.findElement(By.cssSelector("#saveActions > div > button"));
		save_and_back.click();
		Thread.sleep(5000);
		}
		
		driver.close();

	}

}
