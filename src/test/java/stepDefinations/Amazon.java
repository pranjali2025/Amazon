package stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon {
	
	
	String Chrome_key = "webdriver.chrome.driver";
	String Chrome_value = ".\\Drivers\\chromedriver.exe";
	String appUrl = "https://www.flipkart.com/";
	public WebDriver driver = null;
	public Logger log = Logger.getLogger(Amazon.class);

	public Amazon()  {
		System.setProperty(Chrome_key, Chrome_value);
		this.driver = new ChromeDriver();
	}
	
	@Given("^: User launches Chrome Browser$")
	public void user_launches_Chrome_Browser() throws Throwable {
		driver.manage().window().maximize();
	    System.out.println("User Launches Browser");
	}

	@When("^: User navigates to amazon url$")
	public void user_navigates_to_amazon_url() throws Throwable {
		driver.navigate().to("https://www.amazon.com/");
	  System.out.println("User navigates to URL");
	}

	@Then("^: Amazon Website is launched$")
	public void amazon_Website_is_launched() throws Throwable {
		String title=null;
		title=driver.getTitle();
	    System.out.println("Tiltle of the Website launched is  "+title);
	}

	@Then("^: User is able to see the Amazon site$")
	public void user_is_able_to_see_the_Amazon_site() throws Throwable {
	driver.close();	
     System.out.println("Website verified");
	}


}
