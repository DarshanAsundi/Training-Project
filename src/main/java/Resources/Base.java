package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.Configuration;

import QualiTest.Login_Page;

public class Base {
	public WebDriver driver;
	public static org.apache.logging.log4j.Logger log1;
	public Properties prop;
	
	@BeforeSuite
	public void bsuite() throws FileNotFoundException, IOException {
		String log4jconfigfile="C:\\Users\\Qualitest\\QTproject\\src\\main\\java\\Resources\\log4j.xml";
		ConfigurationSource source=new ConfigurationSource(new FileInputStream(log4jconfigfile));
		Configurator.initialize(null,source);
		log1=LogManager.getLogger(Base.class.getName());
	}
	
	public WebDriver initilizeDriver() throws IOException {
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\QTproject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","./exe/chromedriver.exe");
			driver=new ChromeDriver();
			String urlname=prop.getProperty("url");
			driver.manage().window().maximize();
			driver.get(urlname);
		}
		else if(browsername.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else {
			driver=new InternetExplorerDriver();
		}
			
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}
	public void lgin() throws IOException {
		driver=initilizeDriver();
		Login_Page LP=new Login_Page(driver);
		LP.SendUserName().sendKeys(prop.getProperty("un"));
		LP.SendPassword().sendKeys(prop.getProperty("pwd"));
		LP.ClickLogin().click();
		
	}

}
