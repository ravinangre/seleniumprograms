import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	   
	WebDriver driver = new ChromeDriver();
	 
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	driver.get("https://demoqa.com/alerts");
	
	WebElement SimpleAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
	
	WebElement waitAlert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	
	WebElement ConfirmAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	
	WebElement PromptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
	
	
	SimpleAlert.click();
	
    String Alertmessage = driver.switchTo().alert().getText();
	
	System.out.println(Alertmessage);
	
	driver.switchTo().alert().accept();
	
	waitAlert.click();
	
	Thread.sleep(5000);
	
    String Alertmessage1 = driver.switchTo().alert().getText();
	
	System.out.println(Alertmessage1);
	
	driver.switchTo().alert().accept();
	
	ConfirmAlert.click();
	
    String Alertmessage3 = driver.switchTo().alert().getText();
	
	System.out.println(Alertmessage3);
	
	driver.switchTo().alert().accept();
	
	ConfirmAlert.click();
	
    String Alertmessage4 = driver.switchTo().alert().getText();
	
	System.out.println(Alertmessage4);

	driver.switchTo().alert().dismiss();
	
	PromptAlert.click();
	
	driver.switchTo().alert().sendKeys("Ravi");
	
	driver.switchTo().alert().accept();
	 
}
}
