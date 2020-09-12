import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readproperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sharayu\\eclipse-workspace\\TestNGDemo\\src\\simple.properties");
		Properties prop=new Properties();
		prop.load(file);
		String browsertype = prop.getProperty("browser");
		System.out.println(browsertype);
		String url =prop.getProperty("url");
		System.out.println(url);
		
		String username = prop.getProperty("username");
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		   
		WebDriver driver = new ChromeDriver();
		 
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		

	}

}
