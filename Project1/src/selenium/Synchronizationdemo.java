package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Synchronizationdemo {
	
			    public static void main(String[] args) {
			        System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
			        WebDriver driver=new ChromeDriver();
			        driver.get("http://demowebshop.tricentis.com/login");
			         driver.manage().window().maximize();
			         //Implicit wait
			         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			         
			         driver.findElement(By.id("Email")).sendKeys("phanipavan1@gmail.com");
					driver.findElement(By.name("Password")).sendKeys("password123");
					driver.findElement(By.xpath("//input[@value='Log in']")).click();
					
					WebDriverWait Mywait=new WebDriverWait(driver,10);
					Mywait.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Log out"))));
					
					
					//driver.findElement(By.className("button-1 login-button")).click();
					driver.findElement(By.linkText("Log out")).click();
					driver.close();
			         
			         
			    }         
			         
			         
}
