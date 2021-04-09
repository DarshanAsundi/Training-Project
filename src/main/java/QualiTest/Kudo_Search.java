package QualiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Kudo_Search {
	public WebDriver driver;
	By search_kudos=By.xpath("//span[contains(text(),'Kudos Search')]");
	By search_field=By.xpath("//input[@id='s_e_add']");
	By search_button=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]");
	By search_result=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]");
	
	
	public Kudo_Search(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement SEARCH_KUDO() {
		return driver.findElement(search_kudos);
	}
	public WebElement SEARCH_FEILD() {
		return driver.findElement(search_field);
	}
	public WebElement SEARCH_BUTTON() {
		return driver.findElement(search_button);
	}
	public WebElement SEARCH_RESULT() {
		return driver.findElement(search_result);
	}
}
