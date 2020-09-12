package Zerodhabank.investmentbank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropetiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sharayu\\investmentbank\\data.properties");
		Properties prop=new Properties();
		prop.load(file);
		String s=prop.getProperty("username");
		System.out.println(s);
		String s1=prop.getProperty("password");
		System.out.println(s1);
	}

}
