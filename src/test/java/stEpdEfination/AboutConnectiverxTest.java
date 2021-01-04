package stEpdEfination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutConnectiverxTest {
	public static WebDriver driver;

	@Given("^I open Connectiverx website$")
	public void i_open_Connectiverx_website() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://www.connectiverx.com/");

	}

	@When("^I click on About$")
	public void i_click_on_About() throws Throwable {

		driver.findElement(By.xpath("//a[@class='page-scroll text-sm'][text()='About']")).click();

	}

	@When("^verify the information$")
	public void verify_the_information() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//div[@class='text-lg']"));

		System.out.println(element.getText());

	}

	@Then("^I close the website$")
	public void i_close_the_website() throws Throwable {

		driver.quit();

	}

}
