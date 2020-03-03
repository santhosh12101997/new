package training1;

import java.io.IOException;

import training1.MyWrapperMethod1;

public class MyOwnProject1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyWrapperMethod1 mwm = new MyWrapperMethod1();
		mwm.launchapp("https://apply.tnpscexams.in/hall-ticket-download/eyJpdiI6IlhNam9uWTdSOWJHRWtMdUI2WXdWR1E9PSIsInZhbHVlIjoiZm1uTk9FOURHVjdnbWhqV1FESTY3Zz09IiwibWFjIjoiYzA5ZDU3ZjNmMGQzZGUxMzYxY2E0YjkxMjAxMzhiMGNmOGJiMjg2ZGI4NmZmZjk0MGFmNDZiYTliZTIxMTIzMyJ9");
		mwm.clickbyxpath("//*[@id=\"paymentch\"]");
		
		mwm.alert("/html/body/div[3]/div/div/div[3]/button", "");
		mwm.clickbyxpath("//*[@id=\"applicationid\"]");
		
		mwm.enterbyid("applicationid"," 1293072");
		
		mwm.dropdown("//*[@id=\"DD\"]",12);
		mwm.dropdown("//*[@id=\"MM\"]", 10);
		mwm.dropdown("//*[@id=\"YYYY\"]", 25);
	//	wm.enterbyid("password", "12345");
		mwm.clickbyxpath("//*[@id=\"paymentch\"]");
		mwm.screenshot("C:\\Users\\BLTuser.BLT1223\\eclipse-workspace\\Selenium\\screenshot\\alert-tnpsc1.png");
		//mwm.screenshot("C:\\Users\\BLTuser.BLT1223\\eclipse-workspace\\Selenium\\screenshot\\1.png");
		mwm.closeapp();

	}

}
