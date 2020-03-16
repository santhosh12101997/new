package com.Excelutility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData 
{
	//To read and get email id
	public String excel_username(int i) throws IOException
	{
		
		FileInputStream file= new FileInputStream("C:\\Users\\BLTuser.BLT1216\\Desktop\\PracticeAutomationProject(PAP)\\src\\test\\resources\\Testdata\\Excelpage.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("testdata");
		int count= sheet.getLastRowNum();
		System.out.println(count);
			
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell= row.getCell(0);
			String un= cell.getStringCellValue();
			
			return un;
	}	
	public int coun() throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\BLTuser.BLT1216\\Desktop\\PracticeAutomationProject(PAP)\\src\\test\\resources\\Testdata\\Excelpage.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("testdata");
		int count= sheet.getLastRowNum();
		System.out.println(count);
		return count;
	}
	//To read and get password
	public String excel_password(int i) throws IOException
	{
		
		FileInputStream file= new FileInputStream("C:\\Users\\BLTuser.BLT1216\\Desktop\\PracticeAutomationProject(PAP)\\src\\test\\resources\\Testdata\\Excelpage.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("testdata");
		int count= sheet.getLastRowNum();
		
			
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell1= row.getCell(1);
			String pwd= cell1.getStringCellValue();
			
			return pwd;
	}		
}
