package My_Maven.My_Maven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MT_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

		//OK button Alert window

		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		driver.switchTo().alert().accept();

		//OK and Cancel Button Alert Window
		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //OK
		//driver.switchTo().alert().dismiss(); //Cancel

		//Alert Window with Input Box and Capture text from Alert
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Thread.sleep(2000);

		Alert alertwindow = driver.switchTo().alert();

		System.out.println("The message:"+ alertwindow.getText());

		alertwindow.sendKeys("Hello");
		Thread.sleep(2000);
		alertwindow.accept();

		}
	{

	}

	}


