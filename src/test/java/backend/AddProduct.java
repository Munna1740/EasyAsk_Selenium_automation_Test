package backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProduct {

	public static void main(String[] args) {
		// BaseClass
		WebDriver driver = BaseClass.getDriver();

		// Login
		// find the elements
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));

		// set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");

		// find the button and click on it
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();

		WebElement catalogue = driver.findElement(By.cssSelector("body > div.app-body > div > nav > ul > li:nth-child(3) > a"));
		catalogue.click();

		WebElement products = driver.findElement(By.xpath("/html/body/div/div/nav/ul/li[3]/ul/li[3]/a"));
		products.click();
		WebElement add_product = driver.findElement(By.cssSelector("#app > div.container-fluid.animated.fadeIn > div > div > div.row.mb-0 > div:nth-child(1) > div > a"));
		add_product.click();
		
		//product form fillup
		WebElement product_type = driver.findElement(By.cssSelector("#tab_basic-info > div > div:nth-child(2) > select"));
		product_type.click();
		
		WebElement normal = driver.findElement(By.cssSelector("#tab_basic-info > div > div:nth-child(2) > select > option:nth-child(1)"));
		normal.click();
		
		WebElement product_name = driver.findElement(By.name("product_name"));
		product_name.sendKeys("Demo Normal Product");
		
		WebElement product_code = driver.findElement(By.name("product_code"));
		product_code.sendKeys("DNP114554");
		
		WebElement product_description = driver.findElement(By.cssSelector("#quill-container > div.ql-editor.ql-blank"));
		product_description.sendKeys("This is normal product description");
		
		WebElement product_classification = driver.findElement(By.className("vue-treeselect__input"));
		product_classification.click();
		
	}

}
