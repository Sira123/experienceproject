package Week1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe"); 
       
		FirefoxDriver rv1=new FirefoxDriver();
	     rv1.get("http://jqueryui.com/resources/demos/droppable/default.html");
	     rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	     
//        WebElement source = rv1.findElement(By.id("draggable"));
//	   WebElement target = rv1.findElement(By.id("droppable"));
//	   
//	   Actions a1=new Actions(rv1);
//	   a1.dragAndDrop(source, target).build().perform();
//	   
	     Robot r1=new Robot();
	     
	}

}
