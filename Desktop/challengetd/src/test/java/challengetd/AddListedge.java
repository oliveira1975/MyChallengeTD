//---------------------------------------------------------------------------------------------------------------
// -Eclipse IDE for Java Developers
// -Apache Maven 3.6.3
// -Selenium-java-4-0-0-alpha-6
//---------------------------------------------------------------------------------------------------------------
// -Testing Browser:
// -Microsoft Edge 85.0.564.63 (64-bit)
// -Selenium-edge-driver: 4.0.0-alpha-6
// -Driver name: msedgedriver.exe
//---------------------------------------------------------------------------------------------------------------
// -Project: challengetd
// -Autor: Oliveira
// -Date: 28.09.2020
// -Version: 0.1
//---------------------------------------------------------------------------------------------------------------
package challengetd;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddListedge {
	static String url;
	static WebDriver driver;
		
	@BeforeClass
	public static void setUpBeforeClass() throws InterruptedException {
		url = "https://www.getminimalist.com/";
		//Here we can select the browser driver.
		System.setProperty("webdriver.edge.driver", "D:\\eclipse\\myProject\\challengetd\\drivers\\edge\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@Test
	public void refreshList() throws InterruptedException {
		//This method refresh the List.
		driver.get(url);
		driver.findElement(By.cssSelector("div.refresh")).click();
		System.out.println("Step 1 - The refresh was performed successfully!");
}
	@Test
	public void addItem() throws InterruptedException {
		//This method add Items in the List
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).click();
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys("My task 01/03");
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys("My task 02/03");
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys("My task 03/03");
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys(Keys.ENTER);
		System.out.println("Step 2 - The Items were added successfully!");
}
	@Test	
	public void checkItem() throws InterruptedException {
		//This method will check the Items in the List
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#item-list > li:nth-child(1) > button > svg")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#item-list > li:nth-child(2) > button > svg")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#item-list > li:nth-child(3) > button > svg")).click();
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).click();
		driver.findElement(By.cssSelector("input#new-item.chromeless-input")).sendKeys("This automation is finished!");
		System.out.println("Step 3 - The Item 01, Item 02 and Item 03 were checked successfully!");		
}
	@AfterClass
	public static void tearDownAfterClass() throws InterruptedException {
		// Selenium will be quited.
		Thread.sleep(4000);
	    driver.quit();		
}	
}
