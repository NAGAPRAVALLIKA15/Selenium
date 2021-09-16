package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifyregister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		WebElement year = driver.findElement(By.xpath("//*[@placeholder='Year']"));
		Select yr=new Select(year);
		List<WebElement>yearcount=yr.getOptions();
		System.out.println(yearcount.size());	
		
		for(int i=0;i<yearcount.size();i++)
		{
			System.out.println(yearcount.get(i).getText());
		}
		yr.selectByIndex(9);
		
		
		WebElement month = driver.findElement(By.xpath("//*[@placeholder='Month']"));
		Select mt=new Select(month);
		List<WebElement>monthcount=mt.getOptions();
		System.out.println(monthcount.size());	
		
		for(int i=0;i<monthcount.size();i++)
		{
			System.out.println(monthcount.get(i).getText());
		}
		mt.selectByVisibleText("April");
		
		WebElement day = driver.findElement(By.xpath("//*[@placeholder='Day']"));
		Select day1=new Select(day);
		List<WebElement>daycount=day1.getOptions();
		System.out.println(daycount.size());	
		
		for(int i=0;i<daycount.size();i++)
		{
			System.out.println(daycount.get(i).getText());
		}
		day1.selectByValue("15");
		
		
		
		
		
		
		
	}

}
