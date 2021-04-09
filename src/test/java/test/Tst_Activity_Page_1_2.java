package test;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import QualiTest.Login_Page;
import Resources.Base;
import junit.framework.Assert;

public class Tst_Activity_Page_1_2 extends Base{
	public void login() throws IOException {
	driver=initilizeDriver();
	Login_Page LP=new Login_Page(driver);
	LP.SendUserName().sendKeys(prop.getProperty("un"));
	LP.SendPassword().sendKeys(prop.getProperty("pwd"));
	LP.ClickLogin().click();
	}
	
	//1.2.1
	@Test
	public void NameInLeft() throws IOException {
		login();
		WebElement el=driver.findElement(By.xpath("//body//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
		Point pt=el.getLocation();
		int xcrod=pt.getX();
		System.out.println("Position from Left Side is:"+xcrod);
		int ycrod=pt.getY();
		System.out.println("Position from Right Side is:"+ycrod);
		if(xcrod<=450 && ycrod<=200) {
			//System.out.println("Name is in the left-hand side of the screen");
			log1.info("Name is in the left-hand side of the screen");
		}
		else
		{
			//System.out.println("Name is Not in the left-hand side of the screen");
			log1.info("Name is Not in the left-hand side of the screen");
		}
}
	
	//1.2.2
	@Test
	public void CheckTitle() throws IOException {
		driver=initilizeDriver();
		Assert.assertEquals(driver.getTitle(),"QTRecognition");
		driver.close();
	}
}
