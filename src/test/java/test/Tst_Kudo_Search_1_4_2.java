package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import QualiTest.Kudo_Search;
import Resources.Base;
@Test
public class Tst_Kudo_Search_1_4_2 extends Base{
	
	public void KudoSearch() throws IOException, AWTException, InterruptedException {
		lgin();
		Kudo_Search ks=new Kudo_Search(driver);
		ks.SEARCH_KUDO().click();
		ks.SEARCH_FEILD().click();
		Thread.sleep(5000);
		ks.SEARCH_FEILD().sendKeys("Shrini");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		
		
		
	}
}
