package training;

import java.io.IOException;

public class callwrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		wrappermethod wm = new wrappermethod();
		wm.launchapp("https://www.linkedin.com/");
		wm.clickbyxpath("/html/body/nav/a[3]");
		wm.enterbyid("username"," santhosh");
		wm.enterbyid("password", "12345");
		wm.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
		wm.screenshot("C:\\Users\\BLTuser.BLT1223\\eclipse-workspace\\Selenium\\screenshot\\1.png");
		wm.closeapp();

	}

}
