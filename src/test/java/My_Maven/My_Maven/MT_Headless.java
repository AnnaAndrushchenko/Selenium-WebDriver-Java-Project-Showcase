package My_Maven.My_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MT_Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.expressway.ie/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());

	}

}
