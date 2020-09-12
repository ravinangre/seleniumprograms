import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9423111564");
		driver.findElement(By.name("pass")).sendKeys("9423111564");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		WebElement selectdate= driver.findElement(By.xpath("//select[@id='day']"));
		Select date=new Select(selectdate);
		date.selectByValue("13");
		
		WebElement selectmonth= driver.findElement(By.xpath(" //select[@id='month']"));
		Select month=new Select(selectmonth);
		month.selectByVisibleText("Jun");
		
		WebElement selectyear= driver.findElement(By.xpath(" //select[@id='year']"));
		Select year=new Select(selectyear);
		year.selectByIndex(10);
		
		driver.close();
	}

}
