import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions actions=new Actions(driver);
	//WebElement ClickMe = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]"));
	//	WebElement RightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	//	WebElement DoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
	//	actions.click(ClickMe).perform();
	//	actions.contextClick(RightClick).perform();
	//	actions.doubleClick(DoubleClick).perform();
		
	/*	WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement LastName =  driver.findElement(By.xpath("//input[@id='lastName']"));
		
		actions.click(FirstName).sendKeys("Ravi").perform();
		
		actions.keyDown(FirstName, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(LastName, Keys.CONTROL).perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform(); */
		
	//	actions.keyDown(element,Keys.SHIFT);
		
	//	actions.sendKeys("Ravi");
		
	//	actions.keyUp(Keys.SHIFT).perform();
	//	WebElement source = driver.findElement(By.id("draggable"));
	//	WebElement target = driver.findElement(By.id("droppable"));
		
	//	actions.dragAndDrop(source, target).perform();
		
	//WebElement ToolTipButton = driver.findElement(By.id("toolTipButton"));
	
	//actions.moveToElement(ToolTipButton).perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//  js.executeScript("document.getElementById('firstName').value='Avinash';");
		
		WebElement DOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		DOB.click();
		
		Select year = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		year.selectByValue("2000");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		month.selectByVisibleText("September");
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--006']")).click();
		
		WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
		
		actions.sendKeys(subject, "English").sendKeys(Keys.ENTER).build().perform();
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//div[@class=' css-1hwfws3']//div[contains(text(),'Select State')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Uttar')]")).click();
		
		
	}

}
