package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenChrome 
{

public static void main(String[] args)throws InterruptedException
 {
System.setProperty("webdriver.chrome.driver","H:\\automation related software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/user/Desktop/select.html");
WebElement listbox=driver.findElement(By.xpath("//select [@name='employees']"));
Select sel=new Select(listbox);
sel.selectByVisibleText("Barun");
Thread.sleep(9000);
sel.deselectByVisibleText("Barun");

/*driver.findElement(By.id("email")).sendKeys("navin0312kumar@gmail.com");
driver.findElement(By.id("pass")).sendKeys("navin@11N");
driver.findElement(By.id("u_0_b")).click();
Thread.sleep(90000);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
if(driver.getTitle().equals("Facebook – log in or sign up"))
   {
	System.out.println("pass");
   }
   else  
   {
	System.out.println("fail");
   }

 
 */}
}