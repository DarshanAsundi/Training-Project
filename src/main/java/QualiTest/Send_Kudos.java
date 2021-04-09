package QualiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Send_Kudos {
	public WebDriver driver;
	By SK=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
	By Selectemail= By.xpath("//input[@id='email_address']");
	
	By kudo_one =By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	By kudo_two=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[1]");
	By kudo_three=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[3]/div[1]/div[1]");
	By yourcomment=By.xpath("//textarea[@id='comment']");
	
	By noCmt= By.xpath("//center[contains(text(),'Please enter any comment.')]");
	By cmnt= By.xpath("//*[@id=\'display_message\']/span/center");
	
	By rcntkudos= By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h5[1]/small[1]/a[1]/i[1]");
	
	By ref=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");
	By ref2=By.xpath("//small[contains(text(),'Sending KUDOS to - Kaivalya Sinha')]");
	
	By send=By.xpath("//button[contains(text(),'Send')]");
	public Send_Kudos(WebDriver driver) {
		this.driver=driver;
	}
	//1.3.1
	public WebElement sendkudos(){
		return driver.findElement(SK);
	}
	public WebElement SK() {
		
		return driver.findElement(Selectemail);
	}
	 public WebElement s_k() {
		 return driver.findElement(kudo_one);
	 }
	 public WebElement s_k2() {
		 return driver.findElement(kudo_two);
	 }
	 public WebElement s_k3() {
		 return driver.findElement(kudo_three);
	 }
	 public WebElement ycomment() {
		return driver.findElement(yourcomment);
	 }
	 public WebElement snd() {
		 return driver.findElement(send);
	 }
	 public WebElement cmt() {
		 return driver.findElement(noCmt);
	 }
	 public WebElement txt() {
		 return driver.findElement(cmnt);
	 }
	
	 public WebElement rctkudo() {
		 return driver.findElement(rcntkudos);
	 }
	 
	 public WebElement REF() {
		 return driver.findElement(ref);
	 }
	 public WebElement REF2() {
		 return driver.findElement(ref2);
	 }

}
