package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackspaceDelete
{
  public static void main(String[]args)
  {
	  System.setProperty("webdriver.chrome.driver","H:\\automation related software\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement email=driver.findElement(By.id("email"));
	  email.sendKeys("navin");
	  email.clear();
	  email.sendKeys("kumar");
	  email.sendKeys(Keys.CONTROL,"a");
	  email.sendKeys(Keys.BACK_SPACE);
	  //email.sendKeys(Keys.DELETE);
  }
}
