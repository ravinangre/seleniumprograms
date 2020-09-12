package simpleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firsttestngfile {
	public String baseUrl = "https:www.facebook.com";
    public WebDriver driver ; 
     
    @Test(dependsOnMethods = {"openBrowser"})
    public void signIn() {
        driver.findElement(By.name("email")).sendKeys("9423111564");
        driver.findElement(By.name("pass")).sendKeys("123456789");
        driver.findElement(By.name("login")).click();
   }
     @Test()
      public void openBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.gecko.driver","I:\\geckodriver.exe");
          driver = new FirefoxDriver();
          driver.get(baseUrl);
          String fbactualtitle="Facebook – log in or sign up";
          String fbexpecttitle=driver.getTitle();
          Assert.assertEquals(fbactualtitle, fbexpecttitle);
      }
      
      @Test(dependsOnMethods = {"signIn"})
      public void terminateBrowser(){
          driver.close();
      }
}
