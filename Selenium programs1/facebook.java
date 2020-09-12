package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
public class facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("ravi");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("nangare");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ravinangre@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456789");
		
		Select dd=new Select(driver.findElement(By.id("day")));
		//date.selectByIndex("12");
		dd.selectByValue("13");
		Select mm=new Select(driver.findElement(By.id("month")));
		mm.selectByValue("11");
		Select yy=new Select(driver.findElement(by.id("year")));
		yy.SelectByValue("1983");
		
	}

}
