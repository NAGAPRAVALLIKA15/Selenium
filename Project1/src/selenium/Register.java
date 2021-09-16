package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();

		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("ravi");
		driver.findElement(By.id("LastName")).sendKeys("kumar");
		driver.findElement(By.id("Email")).sendKeys("ravikumar1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("ravikumar123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("ravikumar123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();



	}

}
