package test;

import java.io.IOException;
import org.testng.annotations.Test;
import QualiTest.Integration_3;
import Resources.Base;

public class Tst_Integration_3  extends Base{
//Integration 3.1
	@Test
	public void Inte() throws IOException, InterruptedException {
		lgin();
		log1.info("Logged in Successfully");
		Integration_3 i3=new Integration_3(driver);
		i3.CLK_SEND_KUDOS().click();
		i3.CLK_ON_EMAIL().sendKeys("Kaivalya Sinha  (kaivalya.sinha@qualitestgroup.com)");
		i3.CLK_ON_KUDO().click();
		i3.CLK_ON_CMT().sendKeys("Excellent");
		i3.CLK_ON_SENDBTN().click();
		log1.info("Kudo Sent Successfully");
		Thread.sleep(8000);
		
//Integration 3.3
	
		i3.RECENT_CONTACT().click();
		log1.info("Clicked on recent Contact to send Kudo");
		i3.CLK_ON_KUDO().click();
		log1.info("Clicked on Kudo");
		i3.CLK_ON_CMT().sendKeys("Good");
		Thread.sleep(8000);
		i3.CLK_ON_SENDBTN().click();
		log1.info("Kudos sent successfully from recent Contact");
		driver.close();
		
		
		
		
	}

}
