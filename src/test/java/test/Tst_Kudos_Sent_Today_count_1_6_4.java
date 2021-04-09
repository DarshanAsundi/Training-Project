package test;
import java.io.IOException;

import org.testng.annotations.Test;

import QualiTest.Kudos_from_me_1_6;
import Resources.Base;

public class Tst_Kudos_Sent_Today_count_1_6_4  extends Base{
	@Test
	public void Kudos_frm_me2() throws IOException {
		lgin();
		Kudos_from_me_1_6 km=new Kudos_from_me_1_6(driver);
		String number=km.KUDOSCOUNT().getText();
		System.out.println(number);
		km.SK().click();
		km.SELECTMAIL().sendKeys("Kaivalya Sinha  (kaivalya.sinha@qualitestgroup.com)");
		km.KUDO_ONE().click();
		km.YOURCOMMENT().sendKeys("Awesome");
		km.SENDBTN().click();
		String number1=km.KUDOSCOUNT().getText();
		System.out.println(number1);
		if(number==number1) {
			log1.info("Kudos Sent Today is Not Updated");
		}
		else
		{
			log1.info("“Kudos Sent Today is Updated");
		}
		
	}

}
