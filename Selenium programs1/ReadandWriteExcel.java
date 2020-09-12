package Zerodhabank.investmentbank;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteExcel {

	public static void main(String[] args) {
		try {
			  
			   FileInputStream fis=new FileInputStream("I:\\testData\\TestData.xlsx");
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   XSSFSheet sh1= wb.getSheet("Sheet1");
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());	 
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue()); 
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			  } catch (Exception e) {
			   System.out.println(e.getMessage());
			  }  
			 }
	}

