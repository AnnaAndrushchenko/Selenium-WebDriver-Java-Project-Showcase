package My_Maven.My_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MT_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://shop.bugred.ru/shop/4");
		
		//1.Select Specific Checkbox

		WebElement chckbx=driver.findElement(By.xpath("//p[contains(text(), 'ORANGE')]/input[@value='7']"));

		chckbx.click();
		System.out.println(chckbx.isSelected());

		//2. Select all checkboxes

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"colors\"]"));

		checkboxes.size();

		System.out.println("Total number of checkboxes:" +checkboxes.size());

		//Using for loop

		for (int i=0; i<checkboxes.size();i++)
		{
		checkboxes.get(i).click();
		System.out.println("Checkbox " + (i + 1) + " clicked");
		}

		//Using for each loop

		for (WebElement chkbx:checkboxes)
		{
		chkbx.click();
		String colorName = chkbx.findElement(By.xpath("./parent::p")).getText().trim();
        System.out.println("Color name: " + colorName);
		System.out.println(chkbx.getAttribute("value"));
		}

		//Select multiple checkboxes by choice

		for (WebElement chkbx:checkboxes) {
		
		String checkboxname=chkbx.getAttribute("value");
		if(checkboxname.equals("3") || checkboxname.equals("7")){
	
			if (!chkbx.isSelected()) {
		chkbx.click();
		System.out.println(chkbx.isSelected());
		}
		}	
	}
	}
}
