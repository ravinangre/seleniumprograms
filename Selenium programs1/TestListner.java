package ListnerDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerDemo1.Listner.class)

public class TestListner {
	WebDriver driver;
	@Test
	  public void Googletitleverify() {
	   System.out.println("Execution of Main test is carring on");
	   driver.get("http://www.google.com");
	   System.out.println(driver.getTitle());
	  }
	 
	@Test
	public void Titlematch()
	{
		System.out.println("To check title match");
		Assert.assertTrue(false);
	}
	  @BeforeMethod
	 
	  public void beforeMethod() {
	 
	   System.out.println("Execution of Before method is carring on");
	   System.setProperty("webdriver.chrome.driver","I:\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {
	 
	   System.out.println("Execution of After method is carring on");
	 driver.quit();
	  }
}
