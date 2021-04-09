package test;

import java.io.IOException;

import org.testng.annotations.Test;

import QualiTest.Kudos_from_me_1_6;
import Resources.Base;

public class Tst_Kudos_From_me_1_6_1 extends Base {
	@Test
	public void Kudos_frm_me() throws IOException, InterruptedException {
		lgin();
		Kudos_from_me_1_6 km=new Kudos_from_me_1_6(driver);
		km.KUDOS_FRM_ME().click();
		String sname=km.SENDERNAME().getText();
		String ba=km.RESULT1().getText();
		
		
		if(ba.contains("Darshan Asundi has sent an appreciation to")){
			log1.info("Sender is able to see Kudos sent from him to other employees");
		}
		else {
			log1.info("Sender is NOT able to see Kudos sent from him to other employees");
		}
		
		
		
//		if(sname.equals(prop.getProperty("sendername1"))) {
//			log1.info("Sender is able to see Kudos sent from him to other employees");
//		}
//		else {
//			log1.info("Sender is NOT able to see Kudos sent from him to other employees");
//		}
		Thread.sleep(10000);
		driver.close();
		
		
	}
}
