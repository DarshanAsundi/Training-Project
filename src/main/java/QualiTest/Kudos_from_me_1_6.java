package QualiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Kudos_from_me_1_6 {
	public WebDriver driver;
//1.6.1
	By kudos_frm_me=By.xpath("//span[contains(text(),'Kudos from me')]");
	By sendername=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[1]");
	By result1=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]");
	
//1.6.2	
	By kudos_to_me=By.xpath("//span[contains(text(),'Kudos to me')]");
	By recivername=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[1]");
	By result2=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]");

//1.6.4
	By kudoscount=By.xpath("//h5[@id='todayCount']");
	By sk=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
	By selectemail= By.xpath("//input[@id='email_address']");
	By kudo_one =By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	By yourcomment=By.xpath("//textarea[@id='comment']");
	By sendbtn=By.xpath("//button[contains(text(),'Send')]");
	By hassent=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[1]");
	By hasrecived=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");
	
	public Kudos_from_me_1_6(WebDriver driver) {
		this.driver=driver;
	}
//1.6.1	
	public WebElement KUDOS_FRM_ME() {
		return driver.findElement(kudos_frm_me);
	}
	public WebElement SENDERNAME() {
		return driver.findElement(sendername);
	}
	public WebElement RESULT1() {
		return driver.findElement(result1);
	}
//1.6.2	
	public WebElement KUDOS_TO_ME() {
		return driver.findElement(kudos_to_me);
	}
	public WebElement RECIVERNAME() {
		return driver.findElement(recivername);
	}
	public WebElement RESULT2() {
		return driver.findElement(result2);
	}
//1.6.4
	public WebElement KUDOSCOUNT() {
		return driver.findElement(kudoscount);
	}
	public WebElement SK() {
		return driver.findElement(sk);
	}
	public WebElement SELECTMAIL() {
		return driver.findElement(selectemail);
	}
	public WebElement KUDO_ONE() {
		return driver.findElement(kudo_one);
	}
	public WebElement YOURCOMMENT() {
		return driver.findElement(yourcomment);
	}
	public WebElement SENDBTN() {
		return driver.findElement(sendbtn);
	}
	public WebElement HASSENT() {
		return driver.findElement(hassent);
	}
	public WebElement HASRECIVED() {
		return driver.findElement(hasrecived);
	}
	
}
