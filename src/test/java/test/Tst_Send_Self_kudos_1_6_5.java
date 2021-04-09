package test;

import java.io.IOException;
import org.testng.annotations.Test;
import QualiTest.Kudos_from_me_1_6;
import Resources.Base;

public class Tst_Send_Self_kudos_1_6_5 extends Base {
	@Test
	public void Kudos_frm_me3() throws IOException, InterruptedException {
		lgin();
		Kudos_from_me_1_6 km =new Kudos_from_me_1_6(driver);
		km.SK().click();
		km.SELECTMAIL().sendKeys("Darshan Asundi  (darshan.asundi@qualitestgroup.com)");
		km.KUDO_ONE().click();
		km.YOURCOMMENT().sendKeys("Self Kudo");
		km.SENDBTN().click();
		Thread.sleep(5000);
		km.KUDOS_FRM_ME().click();
		String one_name=km.HASSENT().getText();
		System.out.println(one_name);
		String second_name=km.HASRECIVED().getText();
		System.out.println(second_name);
		if(one_name.equals(second_name)) {
			log1.info("Requirement Failed: User is able to send kudos to him self");
		}
		else {
			log1.info("Requirement Passed:User is not able to send kudos to him self");
		}
		
	}

}
