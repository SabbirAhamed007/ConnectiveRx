package stEpdEfination;

import java.util.Currency;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Boosting_adherence_via_prescriberTest {
	public static WebDriver driver;

	@Given("^I open connetiverx Website$")
	public void i_open_connetiverx_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://www.connectiverx.com");

	}

	@Given("^I click on Resources$")
	public void i_click_on_Resources() throws Throwable {

		driver.findElement(By.xpath("//a[@class='page-scroll text-sm'][text()='Resources']")).click();

	}

	@Given("^I verify the Boosting adherence via prescriber text$")
	public void i_verify_the_Boosting_adherence_via_prescriber_text() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//a[@class='whitepapershow'][@href='#']"));

		System.out.println(element.getText());

	}

	@Given("^I click on Boosting adherence via prescriber link$")
	public void i_click_on_Boosting_adherence_via_prescriber_link() throws Throwable {
		
		//create instance of JavaScript executor
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
				
	   //Identify the WebElement which will appear after scrolling down
				
		WebElement element = driver.findElement(By.xpath("//a[@class='whitepapershow'][@href='#']"));
			
	  // now execute query which actually will scroll until that element is not appeared on page
		
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		// Extract the text and verify
		
		System.out.println(element.getText());
		
				

		
		

		driver.findElement(By.xpath("//a[@class='whitepapershow'][@href='#']")).click();
		
       
	}

	@When("^I fillup the form$")
	public void i_fillup_the_form() throws Throwable {
		

		long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("Justin" + currentTime);

		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("Morrow" + currentTime);

		driver.findElement(By.id("LeadEmail")).clear();
		driver.findElement(By.id("LeadEmail")).sendKeys("justinm@gmail.com" + currentTime);

		driver.findElement(By.id("LeadCompany")).clear();
		driver.findElement(By.id("LeadCompany")).sendKeys("QA Test" + currentTime);

	}

	@Then("^I click on Submit & download button$")
	public void i_click_on_Submit_download_button() throws Throwable {

		driver.findElement(By.id("LeadFormSubmitBtn")).click();

	}

}
