package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//Alert with ok
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		
		alert.accept();
		//Alert with ok and cancel
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert1=driver.switchTo().alert();
		String alertmessage1=driver.switchTo().alert().getText();
		System.out.println(alertmessage1);
		 alert1.dismiss();
		 //Alert with textbox
		 driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Alert alert2=driver.switchTo().alert();
			String alertmessage2=driver.switchTo().alert().getText();
			System.out.println(alertmessage2);
			alert2.sendKeys("tester");
			 alert2.accept();
	}

}
