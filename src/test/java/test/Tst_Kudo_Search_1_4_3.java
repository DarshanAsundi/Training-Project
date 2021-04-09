package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.testng.annotations.Test;

import QualiTest.Kudo_Search;
import Resources.Base;
import junit.framework.Assert;

public class Tst_Kudo_Search_1_4_3 extends Base {
	@Test
	public void KudoSearch() throws IOException, AWTException, InterruptedException {
		lgin();
		Kudo_Search ks=new Kudo_Search(driver);
		ks.SEARCH_KUDO().click();
		ks.SEARCH_FEILD().click();
		Thread.sleep(5000);
		ks.SEARCH_FEILD().sendKeys("Shrini");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		ks.SEARCH_BUTTON().click();
		String ab=ks.SEARCH_RESULT().getText();
		
		//Assert.assertTrue(ab.contains("Shriniketan Shetty has sent")||ab.contains("Shriniketan Shetty on "));
		if(ab.contains("Shriniketan Shetty has sent")||ab.contains("Shriniketan Shetty on ")){
			log1.info("Pass");
		}
		else {
			log1.info("Fail");
		}
	}
}
