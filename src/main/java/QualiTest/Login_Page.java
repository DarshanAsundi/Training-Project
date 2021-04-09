package QualiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class Login_Page {
	public WebDriver driver;
	By username=By.xpath("//body/div[2]/form[1]/input[1]");
	By password=By.xpath("//body/div[2]/form[1]/input[2]");
	By loginbtn=By.xpath("//button[contains(text(),'Login')]");
	
	By bdcolour_Gold=By.xpath("//body/div[1]");
	By bdcolour_Navy=By.xpath("//button[contains(text(),'Login')]");
	By bdcolour_White=By.xpath("//body/div[2]");
	
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	}
	///1.1.1
	public WebElement SendUserName() {
		return driver.findElement(username);
		
	}
	public WebElement SendPassword(){
		return driver.findElement(password);
	}
	public WebElement ClickLogin(){
		return driver.findElement(loginbtn);
	}
	
	///1.1.3
	public WebElement Gold(){
		return driver.findElement(bdcolour_Gold);
	}
	
	public WebElement Navy(){
		return driver.findElement(bdcolour_Navy);
	}
	
	public WebElement White(){
		return driver.findElement(bdcolour_White);
	}
	
	

}
