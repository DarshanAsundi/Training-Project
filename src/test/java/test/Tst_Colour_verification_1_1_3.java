package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
import QualiTest.Login_Page;
import Resources.Base;
import junit.framework.Assert;

public class Tst_Colour_verification_1_1_3 extends Base{
	
	public void Access() throws IOException {
		driver=initilizeDriver();
	}

//1.1.3
		@Test
		public void Check_Gold() throws IOException{                             //checking Gold color
			driver=initilizeDriver();
			Login_Page lp=new Login_Page(driver);
			WebElement G=lp.Gold();
			String Gvalue=Color.fromString(G.getCssValue("background-color")).asHex();
			Assert.assertEquals(Gvalue,"#fecc160");
			driver.close();	
		}
		
		@Test
		public void Check_Navy() throws IOException {							 //checking Navy color
			driver=initilizeDriver();
			Login_Page lp=new Login_Page(driver);
			WebElement N=lp.Navy();
			String Nvalue=Color.fromString(N.getCssValue("background-color")).asHex();
			Assert.assertEquals(Nvalue,"#2a2559");
			driver.close();
		}
		
		
		@Test
		public void Check_White() throws IOException {							 //checking White color
			driver=initilizeDriver();
			Login_Page lp=new Login_Page(driver);
			WebElement W=lp.White();
			String Wvalue=Color.fromString(W.getCssValue("background-color")).asHex();
			Assert.assertEquals(Wvalue,"#939598");
			driver.close();
		}
}


