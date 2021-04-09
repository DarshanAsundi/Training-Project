package test;

import java.io.IOException;

import org.testng.annotations.Test;

import QualiTest.Kudo_Search;
import Resources.Base;

public class Tst_Kudo_Search_1_4_1 extends Base {
	
	@Test
	public void kudo_search() throws IOException {
		
		lgin();
		Kudo_Search ks=new Kudo_Search(driver);
		ks.SEARCH_KUDO().click();
		
		if(ks.SEARCH_KUDO().isDisplayed())
		{
			log1.info("Kudos Search Button is Present");
		}
		else
		{
			log1.info("Kudos Search Button is not Present");
		}
			
	}
}
