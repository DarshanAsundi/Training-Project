package test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import QualiTest.Login_Page;
import QualiTest.Send_Kudos;
import Resources.Base;


public class Txt_SendKudo_RecentContact_1_3_5 extends Base {
	
	//@Test
//	public void Access() throws IOException, AWTException {
//		driver=initilizeDriver();
//		Login_Page LP=new Login_Page(driver);
//		LP.SendUserName().sendKeys(prop.getProperty("un"));
//		LP.SendPassword().sendKeys(prop.getProperty("pwd"));
//		LP.ClickLogin().click();
//	}
//	
	@Test
	public void sendkudo() throws IOException {
		lgin();
		Send_Kudos sk=new Send_Kudos(driver);
		sk.rctkudo().click();
		sk.s_k2().click();
		sk.ycomment().sendKeys("Test");
		sk.snd().click();
		log1.info("Kudos Sent Successfully from recent contacts by clicking send icon");
		
		if(sk.REF().getText().contains(prop.getProperty("partial"))) {
			log1.info("Kudos sent sucessfully");			
		}
		else
		{
			log1.info("Kudos not sent ");
		}
	}
}
