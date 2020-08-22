package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOption {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\automation related software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(5000);

		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);

		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	/*	WebElement list=driver.findElement(By.id("day"));
		Select sel=new Select(list);
		sel.selectByVisibleText("3");
		WebElement list1=driver.findElement(By.id("month"));
		Select sel1=new Select(list1);
		sel1.selectByVisibleText("Dec");
		WebElement list2=driver.findElement(By.id("year"));
		Select sel2=new Select(list2);
		sel2.selectByVisibleText("1993");
		*/

	}
}
	/*	System.setProperty("webdriver.chrome.driver", "H:\\automation related software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/select.html");
	WebElement list=driver.findElement(By.name("employees"));
	Select sel=new Select(list);
	sel.selectByValue("B");
	Thread.sleep(9000);
	sel.selectByIndex(0);
	Thread.sleep(9000);
	sel.selectByVisibleText("Barun");
	System.out.println(sel.isMultiple());
	List<WebElement> options=sel.getOptions();
	System.out.println(options.size());
	for(int i=0;i<options.size();i++)
	 {
		System.out.println(options.get(i).getText());
		
	 }
	
	
	
	

	}

}*/

