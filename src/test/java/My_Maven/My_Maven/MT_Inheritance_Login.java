package My_Maven.My_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MT_Inheritance_Login {

    protected WebDriver driver; // Объявление WebDriver как protected для доступа из классов-наследников

    public void signIn() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[@class='nav-link' and @href='/user/login/index']")).click();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("maven@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("qwerty");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(5000);
    }

    public void setupWebDriver() {
        System.setProperty("webdriver.chrome.driver","C://driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://shop.bugred.ru/");

}
}
