package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","H:\\automation related software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://facebook.com");
WebElement text=driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
System.out.println(text.getText());
System.out.println(driver.getCurrentUrl());
text.click();
Thread.sleep(5000);
driver.close();


/*WebElement text=driver.findElement(By.linkText("Forgotten account?"));

text.click();
Thread.sleep(5000);
//System.out.println(text.getText());
//WebElement text1=driver.findElement(By.linkText("Forgotten account?"));
System.out.println(driver.findElement(By.linkText("Forgotten account?")));
//System.out.println(text1.getText());
*/	}

}
