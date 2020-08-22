package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender
{
	public static void main(String[]args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "H:/automation related software/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://americanairlines.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
	driver.findElement(By.xpath("//a[@title='Next']")).click();//for next month
	driver.findElement(By.xpath("//a[.='31']")).click();//31/07/20
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();//going to return cal.
	driver.findElement(By.xpath("(//a[.='31'])[2]")).click();//31/08/20
	WebElement dropdown =driver.findElement(By.id("flightSearchForm.childPassengerCount"));
	dropdown.click();
	Select sel=new Select(dropdown);
	sel.selectByValue("4");
	System.out.println("4 child got sucessfully selected");
	
	
		
		
		
		

	}

}
