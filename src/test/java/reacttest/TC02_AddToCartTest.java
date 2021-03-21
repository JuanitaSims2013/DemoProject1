/**
 * 
 */
package reacttest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author jaffar
 *
 */
public class TC02_AddToCartTest {
	
	ChromeDriver driver;
	
	
	@Test
	
	public void loginTest() throws InterruptedException {
		
     
         WebDriverManager.chromedriver().setup();
		  
         WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com/");
			 
         Thread.sleep(4000);
		 
		 driver.manage().window().maximize();
		 
		 
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		 Thread.sleep(4000);
		 
		 String curl = driver.getCurrentUrl();
		 
		 System.out.println("My application home page url:" + curl);
		 
		 //System.out.println(driver.getCurrentUrl());
		 
		 Thread.sleep(4000);
		 
		// driver.quit();
		//div[@class='product_label']
		// string text = driver.findElement(By.xpath("//div[@class='product_label']")).getText();
		 
		 String text = driver.findElement(By.xpath("//div[@class='product_label']")).getText();
		 
		 
		 System.out.println("on a Home Product Lable is :" + text);
		
		 
		 Thread.sleep(4000);
		 
		driver.quit();
		 
		 
		 
		
		
	}
}
	   
		

