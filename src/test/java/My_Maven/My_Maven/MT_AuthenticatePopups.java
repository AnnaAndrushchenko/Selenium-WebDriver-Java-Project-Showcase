package My_Maven.My_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MT_AuthenticatePopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://authorized:password001n@testpages.eviltester.com/styled/auth/basic-auth-results.html");
		
		driver.quit();

	}

}
