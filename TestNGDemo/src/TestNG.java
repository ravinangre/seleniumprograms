import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver; 
	 @Test (priority = 1)
	 public void CloseBrowser() {
	
	 System.out.println("Closing Google Chrome browser");
	 }
	 
	 @Test (priority = 0)
	 public void OpenBrowser() {
	
	 System.out.println("Launching Google Chrome browser"); 
	 }
	 
	 @Test
	 public void AccountTest1(){
	 System.out.println("Some tests for Customer Account");
	 }
	 @Test 
	 public void CloseBrowser2() {

	 System.out.println("Closing Google Chrome browser");
	 }
	 
	 @Test 
	 public void OpenBrowser3() {
	 
	 System.out.println("Launching Google Chrome browser"); 
	 }
	 
	 @Test (priority = 1)
	 public void AccountTest(){
	 System.out.println("Some tests for Customer Account");
	 Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	 }
}
