 package My_Maven.My_Maven;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MT_DataPickerwithDropdown {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver","C://driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement dateInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateInput);

        Select mnth_dropdown = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
        mnth_dropdown.selectByVisibleText("June");

        Select year_dropdown = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
        year_dropdown.selectByVisibleText("1993");

        String date = "21";
        List<WebElement> allDates = driver.findElements(By.xpath("//div[contains(@class,'react-datepicker__day')]"));

        for (WebElement ele : allDates) {
            String dt = ele.getText();
            if (dt.equals(date)) {
                ele.click();
                break;
            }
        }
        
        driver.quit();
    }
}

