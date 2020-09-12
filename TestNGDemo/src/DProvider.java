import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {

	@DataProvider (name = "data-provider")
	 public Object[][] dpMethod(){
	 return new Object[][] {{"ravinangre","12345678"}, {5, 7, 9}, {12, 12, 24},{5,8,13}};
	 }
	 
	   @Test (dataProvider = "data-provider")
	     public void myTest (String  username, String passwd) {
	         
	     }
}
