package test;

import java.io.IOException;
import org.testng.annotations.Test;
import QualiTest.Login_Page;
import QualiTest.Send_Kudos;
import Resources.Base;
import junit.framework.Assert;

@Test
public class Tst_CanSend_Act_1_3_1 extends Base{
	public void Access() throws IOException {
		driver=initilizeDriver();
		Login_Page LP=new Login_Page(driver);
		LP.SendUserName().sendKeys(prop.getProperty("un"));
		LP.SendPassword().sendKeys(prop.getProperty("pwd"));
		
		LP.ClickLogin().click();
		Send_Kudos k = new Send_Kudos(driver);
		k.sendkudos().click();
		if(driver.getCurrentUrl()=="https://qtrecognition.testqtwiz.com/Activity.php") {
		//Assert.assertEquals(driver.getCurrentUrl(),"https://qtrecognition.testqtwiz.com/Activity.php");
		log1.info("User is able to send kudos form Activity page");
	}
}

}
