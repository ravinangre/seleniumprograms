package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboarddemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		WebElement userName=driver.findElement(By.id("userName"));
		WebElement currentAdd=driver.findElement(By.id("currentAddress"));
		WebElement permAdd=driver.findElement(By.id("permanentAddress"));
		WebElement submitBtn=driver.findElement(By.id("submit"));
		
		Actions act = new Actions(driver);
		act.sendKeys(userName, "Ravi Nangare").perform();
	
		act.click(currentAdd).sendKeys("At Post Lokhandi Sawargaon Tq Ambajogai Dist Beed Pin 431517").perform();
		
		act.keyDown(currentAdd, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permAdd,Keys.CONTROL).perform();	
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		submitBtn.click();
		
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
