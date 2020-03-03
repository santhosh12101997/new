package testcase;

import java.io.IOException;

import dataNG.ExcelData;
import keyword.ObjDen;

public class DriverScrp {

	public static void main(String[] args) {
	
		ExcelData da=new ExcelData();
		ExcelData dak=new ExcelData();
		ObjDen idm=new ObjDen();
		try {
			da.Excel("C:\\Users\\BLTuser.BLT1223\\Desktop\\tot.xlsx");
			dak.Excel("C:\\Users\\BLTuser.BLT1223\\Desktop\\keyword.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0;i<=da.rowco();i++)
		{
		 String SearchString=da.getCellVa(i,0);
		
		for (int j=1;j<=dak.rowco();j++)
		{
		 String keyword1=dak.getCellVa(j,2);
		 if (keyword1.equalsIgnoreCase("OpenBrow"))
		 {
			idm.OpenBrow(); 
		 }
		 else if (keyword1.equalsIgnoreCase("SetUrl"))
			 
		 {
			 idm.SetUrl();
		 }
		 else if(keyword1.equalsIgnoreCase("Search"))
		 {
			 idm.Search(SearchString);
		 }
		 
		 else if (keyword1.equalsIgnoreCase("closeBrow"))
		 {
			 idm.closeBrow();
		 }
		}
		}
	}
}

