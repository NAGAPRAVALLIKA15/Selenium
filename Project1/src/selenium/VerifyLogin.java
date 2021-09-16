package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("You are on correct page");
			driver.findElement(By.id("Email")).sendKeys("phanipavan1@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("password123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			//driver.findElement(By.className("button-1 login-button")).click();
			driver.findElement(By.linkText("Log out")).click();
			//driver.findElement(By.xpath("//a[@href='/logout']")).click();
			driver.close();
		}
		else
		{
			
			System.out.println("You are on wrong page");
			driver.close();

		}
		
	}

}
