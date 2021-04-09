package QualiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Integration_3 {
	public WebDriver driver;
///Integration 3.1
	By clk_send_kudos=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
	By clk_on_email=By.xpath("//input[@id='email_address']");
	By clk_on_kudo=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[7]/div[1]/div[1]/center[1]");
	By clk_on_cmt=By.xpath("//textarea[@id='comment']");
	By clk_on_sendbtn=By.xpath("//button[contains(text(),'Send')]");
	
//	By select_img=By.xpath("//center[contains(text(),'Please select any image.')]");
	
	By body_click=By.xpath("//body");
	
	
///Integration 3.3
	By recent_contact= By.cssSelector("div.container:nth-child(2) div.row:nth-child(1) div.col-md-4:nth-child(3) div.jumbotron div.media:nth-child(5) div.media-body h5.header-font-size small:nth-child(2) a:nth-child(2) > i.fas.fa-paper-plane");
	
public Integration_3(WebDriver driver) {
	this.driver=driver;
}

public WebElement CLK_SEND_KUDOS() {
	return driver.findElement(clk_send_kudos);
 }
public WebElement CLK_ON_EMAIL() {
	return driver.findElement(clk_on_email);
}
public WebElement CLK_ON_KUDO() {
	return driver.findElement(clk_on_kudo);
}
public WebElement CLK_ON_CMT() {
	return driver.findElement(clk_on_cmt);
}
public WebElement CLK_ON_SENDBTN() {
	return driver.findElement(clk_on_sendbtn);
}
public WebElement RECENT_CONTACT() {
	return driver.findElement(recent_contact);
}
public WebElement BODY_CLICK() {
	return driver.findElement(body_click);
}


}
