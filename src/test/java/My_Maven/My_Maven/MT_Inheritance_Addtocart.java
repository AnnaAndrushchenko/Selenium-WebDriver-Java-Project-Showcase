package My_Maven.My_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MT_Inheritance_Addtocart extends MT_Inheritance_Login {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		
		@Test
	    public void addToCart() throws InterruptedException {
	        setupWebDriver(); // Использование метода родительского класса для настройки WebDriver
	        Thread.sleep(5000);
	        signIn();
	        driver.findElement(By.xpath("//div[@class='col-md-4']/a[contains(@href, '/shop/item/26')]")).click();
	        //driver.findElement(By.xpath("//input[@type='number']")).click();
	        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
	        inputField.sendKeys("1");
	        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	        driver.findElement(By.xpath("//div//i[@class='fas fa-shopping-cart']")).click();
	    }
	}
