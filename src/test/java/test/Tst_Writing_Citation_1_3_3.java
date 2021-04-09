package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import QualiTest.Login_Page;
import QualiTest.Send_Kudos;
import Resources.Base;

public class Tst_Writing_Citation_1_3_3 extends Base{
	@Test()
	public void Access() throws IOException, AWTException {
//		driver=initilizeDriver();
//		Login_Page LP=new Login_Page(driver);
//		LP.SendUserName().sendKeys(prop.getProperty("un"));
//		LP.SendPassword().sendKeys(prop.getProperty("pwd"));
//		LP.ClickLogin().click();
		lgin();
		Send_Kudos k = new Send_Kudos(driver);
		k.sendkudos().click();
		k.SK().sendKeys("prajwal.lokesh@qualitestgroup.com");
		
		Robot R=new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		
		k.s_k().click();
		//k.ycomment().sendKeys("");
		k.snd().click();
		
		if(k.cmt().equals(k.txt())){
			log1.info("Pass: Failed to send kudos");
		}
		else 
		{
			log1.info("Fail: Kudos was sent ");
		}
	}
	

}
