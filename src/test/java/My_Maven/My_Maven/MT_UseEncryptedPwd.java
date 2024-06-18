package My_Maven.My_Maven;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MT_UseEncryptedPwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.expressway.ie/login");
		driver.manage().window().maximize();

		//driver.findElement(By.linlText("Log in").click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ambaritatoba0@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UXdlcnR5LTcx");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		}

		static String decodedString(String password)
		{
		byte[] decodedString=Base64.decodeBase64(password);

		return(new String(decodedString));

	}

}

