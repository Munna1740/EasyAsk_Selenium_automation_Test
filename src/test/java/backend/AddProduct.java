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

		WebElement products = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/product']"));
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
		
		WebElement categories = driver.findElement(By.xpath("//div[@id='tab_basic-info']/div/div[6]/div/div/div[2]/div/div/div[3]/div/div[2]/label"));
		categories.click();
		
//		WebElement product_classification = driver.findElement(By.className("vue-treeselect__input"));
//		product_classification.click();
//		
//		WebElement laptop_classification = driver.findElement(By.className("vue-treeselect__input-2"));
//		laptop_classification.click();
		
		WebElement ean_number = driver.findElement(By.name("ean_number"));
		ean_number.sendKeys("1256369854785");
		
		WebElement gtin_number = driver.findElement(By.name("gtin_number"));
		gtin_number.sendKeys("12563698547851");
		
		WebElement upc_number = driver.findElement(By.name("upc_number"));
		upc_number.sendKeys("125636985478");
		
		WebElement asin_number = driver.findElement(By.name("asin"));
		asin_number.sendKeys("1256369854");
		
		WebElement manufacturer = driver.findElement(By.name("manufacturer"));
		manufacturer.sendKeys("4500");
		
		WebElement model_code = driver.findElement(By.name("model_code"));
		model_code.sendKeys("MNROSFS");
		
		WebElement model_name = driver.findElement(By.name("model_name"));
		model_name.sendKeys("4500");
		
		
		WebElement next_btn = driver.findElement(By.linkText("Next"));
		next_btn.click();
	}

}
