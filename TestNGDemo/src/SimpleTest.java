import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimpleTest {
	WebDriver driver;
@Test
public void Demo()
{
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	System.out.println("Hello TestnG");
	String ActualTitle = "Google Page";
	String ExpectedTitle = driver.getTitle();
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	System.out.println("Hello TestnG Test");
	driver.close();
	}

@Test
public void Execution()
{
Reporter.log("Execute the logs");
System.out.println("After successfull execution of hard assert it will execute");
}
@Test
public void OpenBrowser() {
	 Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	         Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	         System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	     	 driver=new ChromeDriver();
	         driver.get("https://www.demoqa.com");
	         SoftAssert softassert = new SoftAssert();
	         Reporter.log("The website used was DemoQA for this test", true);
	         String expectedTitle = "Free QA Automation Tools For Everyone";
	         String originalTitle = driver.getTitle();
	         softassert.assertEquals(originalTitle, expectedTitle);
	         System.out.println("*** Checking For The Second Title ***");
	// Checking title for ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation
	         softassert.assertEquals(originalTitle, "ToolsQA" );
	         softassert.assertAll();
	  }

}
