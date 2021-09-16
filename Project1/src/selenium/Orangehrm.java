package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		driver.findElement(By.xpath("//a[@href='#' and @id='Welcome']")).click();
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
		driver.close();
	}

}


