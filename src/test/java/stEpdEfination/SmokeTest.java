package stEpdEfination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	public static WebDriver driver;

	@Given("^I open Chrome Browser$")
	public void i_open_Chrome_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@When("^Type Connectiverx web address$")
	public void type_Connectiverx_web_address() throws Throwable {

		driver.get("http://www.connectiverx.com");

	}

	@When("^verify learn more button$")
	public void verify_learn_more_button() throws Throwable {

		boolean isDisplayed = driver
				.findElement(By.xpath("//a[@class='btn btn-outline-secondary'][text()='Learn More']")).isDisplayed();

		boolean isEnbled = driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary'][text()='Learn More']"))
				.isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}

	}

	@When("^verify the title of the page$")
	public void verify_the_title_of_the_page() throws Throwable {

		// Actual title
		String my_title = driver.getTitle();
		System.out.println("Title is " + my_title);

		String expected_title = "ConnectiveRx";

		Assert.assertEquals(my_title, expected_title);

		System.out.println("Test completed");

	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {

		driver.quit();

	}

}
