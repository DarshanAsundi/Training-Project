package StepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import QualiTest.Login_Page;
import Resources.Base;

@RunWith(Cucumber.class)
public class StepDefination extends Base {

    @Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
    	driver=initilizeDriver();
    }
    
    @And("^navagate to \"([^\"]*)\" site$")
    public void navagate_to_something_site(String strArg1) throws Throwable {
       driver.get(strArg1);
    }

    @When("^click on (.+) and (.+)$")
    public void click_on_and(String un, String pwd) throws Throwable {
    	Login_Page LP=new Login_Page(driver);
    	LP.SendUserName().sendKeys(un);
		LP.SendPassword().sendKeys(pwd);
    }

    @Then("^click on login button$")
    public void click_on_login_button() throws Throwable {
    	Login_Page LP=new Login_Page(driver);
    	LP.ClickLogin().click();
    	driver.close();
    }

    


}