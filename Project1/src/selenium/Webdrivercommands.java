package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivercommands {
		    public static void main(String[] args) {
		        System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("http://demowebshop.tricentis.com/");
		        
		    driver.manage().window().maximize();
		    
		    String titlename=driver.getTitle();
		    System.out.println(titlename);
		    
		    System.out.println("The Length of the title is " +titlename.length());
		    
		    String expectedurl="http://demowebshop.tricentis.com/";
		    String actualurl=driver.getCurrentUrl();
		    
		    if(expectedurl.equals(actualurl))
		    {
		        System.out.println("You are on the correct page");
		    }
		    
		    else
		    {
		        System.out.println("You are on the wrong page");
		    }
		    
		    String pagesource=driver.getPageSource();
		    System.out.println("The length of the page source is "+pagesource.length());
		    
		    driver.close();
		    }

	
}
