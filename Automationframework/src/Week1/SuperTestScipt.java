    
package Week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class SuperTestScipt 
{
 
	public static WebDriver driver;
	
	@BeforeTest
	public void preConfig()
	{
		String URL;//read it from excel,Preconfig sheet
		String browser;// read it from excel, preconfig sheet
		
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "path of gecko driver");
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "path of chrome driver");
			driver=new ChromeDriver();
			
			
			
		}
		else
		{
			
			System.out.println("Invalid browser");
		}
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	@AfterTest
	public void postConfig()
	{
		driver.close();
		
	}
	
	
}
