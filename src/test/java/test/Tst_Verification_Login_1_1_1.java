 package test;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import QualiTest.Login_Page;
import Resources.Base;
import junit.framework.Assert;


public class Tst_Verification_Login_1_1_1 extends Base {
	
	@Test
	public void Access() throws IOException {
		driver=initilizeDriver();
	}
	
	
	@Test(dataProvider="getData1")
	public void Login (String SendUserName,String SendPassword) throws IOException {
		driver=initilizeDriver();
		Login_Page LP=new Login_Page(driver);
		LP.SendUserName().sendKeys(SendUserName);
		LP.SendPassword().sendKeys(SendPassword);
		LP.ClickLogin().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://qtrecognition.testqtwiz.com/Activity.php");
		log1.info("Logged in successfully");
		driver.close();
	}
	
	//1.1.1
	@DataProvider
	public Object[][] getData1() {
		Object[][] data=new Object[10][2];
		
		data[0][0]="darshan.asundi@qualitestgroup.com"; //valid email and valid password
		data[0][1]="P@ssw0rd";
				
		data[1][0]="darshan.asundi@qualitestgroup.com"; //valid email and invalid password
		data[1][1]="P@SSW0RD";
		
		data[2][0]="darshanasundi@qualitestgroup.com"; //invalid email and valid password
		data[2][1]="P@SSW0RD";
		
		data[3][0]="darshanasundi@qualitestgroup.com"; //invalid email and invalid password
		data[3][1]="PASSW0RD";
		
		data[4][0]="darshan.asundi@qualitestgroup.com"; //valid email and invalid password
		data[4][1]="";
		
		data[5][0]=""; 									//invalid email and valid password
		data[5][1]="P@ssw0rd";
		
		data[6][0]=""; 									//invalid email and invalid password
		data[6][1]="";
		
		data[7][0]="DARSHAN.ASUNDI@QUALITESTGROUP.COM"; //valid email in capital and valid password
		data[7][1]="P@ssw0rd";
		
		data[8][0]="DARSHAN.ASUNDI@QUALITESTGROUP.COM"; //valid email in capital and valid password in capital
		data[8][1]="P@SSW0RD";
		
		data[9][0]="darshan.asundi@qualitestgroup.com"; //valid email and valid password capital
		data[9][1]="P@SSW0RD";
		return data;
	}
}
