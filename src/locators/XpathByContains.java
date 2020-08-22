package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","H:\\automation related software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.actitime.com ");
	
	driver.findElement(By.id("cookie-button--got-it")).click();//for handling the hidden popup
	//driver.manage().deleteAllCookies();
    Thread.sleep(8000);
    //java.util.Set<String> a=driver.getWindowHandles();
    //System.out.println(a.size());
	driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc')]")).click();
	System.out.println("hii");
	//driver.get("https://www.myntra.com/");
	//driver.findElement(By.xpath("//a[contains(text(),'Home & Living')]")).click();
	//Actions act=new Actions(driver);
	//act.moveToElement(home).perform();

	}

}