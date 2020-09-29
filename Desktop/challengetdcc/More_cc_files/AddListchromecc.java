//---------------------------------------------------------------------------------------------------------------
// -Eclipse IDE for Java Developers
// -Apache Maven 3.6.3
// -Selenium-java-4-0-0-alpha-6
// - Cucumber-java-1.2.5
// - Cucumber-junit-1.2.5
//---------------------------------------------------------------------------------------------------------------
// -Testing Browser:
// -Google Chrome: 85.0.4183.121 (64-bit)
// -Selenium-chrome-driver: 4.0.0-alpha-6
// -Driver name: chromedriver.exe
//---------------------------------------------------------------------------------------------------------------
// -Project: challengetdcc
// -Autor: Oliveira
// -Date: 28.09.2020
// -Version: 0.1
//---------------------------------------------------------------------------------------------------------------
package challengetdcc;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddListchromecc {
	static String url;
	static WebDriver driver;
		
	@Before
	public static void setUpBeforeClass() throws Exception {
		url = "https://www.getminimalist.com/";
		//Here we can select the browser driver.
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\myProject\\challengetdcc\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}    
	@Test
	public void test() {
		//fail("Not yet implemented");
}
	@After
	public static void tearDownAfterClass() throws Exception {
		// Selenium will be quited.
		Thread.sleep(4000);
	    driver.quit();		
}
	@Given("^I refresh the todo list, to erase old register$")
	public void i_refresh_the_todo_list_to_erase_old_register() throws Throwable {
		//This method refresh the List.
		driver.get(url);
		driver.findElement(By.cssSelector("div.refresh")).click();
		System.out.println("Step 1 - The refresh was performed successfully!");
		
}
	@When("^I click in the field Add to your list$")
	public void i_click_in_the_field_Add_to_your_list() throws Throwable {
		// This method set the focus
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).click();
		System.out.println("Step 2 - The focus was defined to the field successfully!");

}
	
	@Then("^I can insert into the list \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_can_insert_into_the_list_and(String arg1, String arg2, String arg3) throws Throwable {
		//This method add 3 Items in the List
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(arg1);
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(arg2);
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(arg3);
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(Keys.ENTER);
		System.out.println("Step 3 - The Item 01, Item 02 and Item 03 were added successfully!");		
}
	@Then("^I can ckeck all tasks into the list$")
	public void i_can_ckeck_all_tasks_into_the_list() throws Throwable {
		//This method check all Items in the List
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#item-list > li:nth-child(1) > button > svg")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#item-list > li:nth-child(2) > button > svg")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#item-list > li:nth-child(3) > button > svg")).click();
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).click();
		System.out.println("Step 4 - The Item 01, Item 02 and Item 03 were checked successfully!");		
}
	@Then("^I can finalize the test automation$")
	public void i_can_finalize_the_test_automation() throws Throwable {
		//This method will show the final message into the list
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).click();
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys("This automation is finished!");
		System.out.println("Step 5 - The automation Selenium with Cucumber war done successfully!");			
}
}	
