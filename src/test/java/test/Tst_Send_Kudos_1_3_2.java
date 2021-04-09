package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import QualiTest.Login_Page;
import QualiTest.Send_Kudos;
import Resources.Base;


public class Tst_Send_Kudos_1_3_2 extends Base{
	@Test(dataProvider="getData2")
	public void Access(String a, String b) throws IOException, AWTException, InterruptedException {
//		driver=initilizeDriver();
//		Login_Page LP=new Login_Page(driver);
//		LP.SendUserName().sendKeys(prop.getProperty("un"));
//		LP.SendPassword().sendKeys(prop.getProperty("pwd"));
//		LP.ClickLogin().click();
		
		lgin();
		Send_Kudos k = new Send_Kudos(driver);
		k.sendkudos().click();
		k.SK().sendKeys(a);
		
		Robot R=new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		
		k.s_k().click();
		k.ycomment().sendKeys(b);
		Thread.sleep(1000);
		k.snd().click();
		driver.close();
		
	}
	
		@DataProvider
		public Object[][] getData2() {
			Object[][] data=new Object[6][2];
			
			data[0][0]="prajwal";
			data[0][1]="Test";
			
			data[1][0]="prajwal.lokesh@qualitestgroup.com";
			data[1][1]="Test1.1";
			
			data[2][0]="PRAJWAL.LOKESH@QUALITESTGROUP.COM";
			data[2][1]="Test1.2";
			
		
	//Defect			
			data[3][0]="prajwallokesh@qualitestgroup.com";
			data[3][1]="Test1.3";
			
			data[4][0]="";
			data[4][1]="Test1.4";
			
			data[5][0]="PRAJWALLOKESH@QUALITESTGROUP.COM";
			data[5][1]="Test1.5";
			
			return data;
			}
	
}
