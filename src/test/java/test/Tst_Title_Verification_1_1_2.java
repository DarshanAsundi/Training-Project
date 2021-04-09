package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;
import junit.framework.Assert;

public class Tst_Title_Verification_1_1_2 extends Base {
 void Access() throws IOException {
		driver=initilizeDriver();
	}
 
 
//1.1.2
		@Test
		public void CheckTitle() throws IOException {
			driver=initilizeDriver();
			//Assert.assertEquals(driver.getTitle(),"QTRecognition");
			
			if((driver.getTitle().equals("QTRecognition"))) {
				log1.info("Title is Verified");
			}
			else
			{
				log1.info("Title is not Verified");
			}
			
			driver.close();
		}
}
