package test;
import java.io.IOException;
import org.testng.annotations.Test;
import QualiTest.Kudos_from_me_1_6;
import Resources.Base;

public class Tst_Kudos_From_me_1_6_2  extends Base{
	@Test
	public void Kudos_frm_me1() throws IOException, InterruptedException {
		lgin();
		Kudos_from_me_1_6 km=new Kudos_from_me_1_6(driver);
		km.KUDOS_TO_ME().click();
		String rname=km.RECIVERNAME().getText();
		System.out.println(rname);
		
		String aab=km.RESULT2().getText();
		if(aab.contains("Darshan Asundi received an appreciation from")){
			log1.info("Reciver is able to see Kudos sent from other employees to him");
		}
		else {
			log1.info("Reciver is NOT able to see Kudos sent from other employees to him");
		}
		
//		if(rname.equals(prop.getProperty("recivername1"))) {
//			log1.info("Receiver is able to see Kudos sent from other employees to him");
//		}
//		else {
//			log1.info("Receiver is NOT able to see Kudos sent from other employees to him");
//		}
		Thread.sleep(5000);
		driver.close();
	
	}

}
