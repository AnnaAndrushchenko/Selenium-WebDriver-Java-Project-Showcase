package My_Maven.My_Maven;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MT_IncognitoWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://driver//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addArguments(Arrays.asList("--incognito","--start-maximized"));

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.expressway.ie/");

	}

}
