package stEpdEfination;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrokenLink_ImageTest {
	public static WebDriver driver;

	@Given("^I open connectiverx website$")
	public void i_open_connectiverx_website() throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Microsoft Edge\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://www.connectiverx.com");

	}

	@When("^I verify links and image$")
	public void i_verify_links_and_image() throws Throwable {
		
		
		// links -- //a href <http://www........com>
		// images --//img href <http://www.......com>

		// 1. get the list of all links and images: suppose 500

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		linkList.addAll(driver.findElements(By.tagName("img")));

		System.out.println("size of full links and images--->" + linkList.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>(); // 450 which
																	// has href

		// 2. iterate linkList : exclude all the links/Images - doesnot have any
		// href attibute

		for (int i = 0; i < linkList.size(); i++) {

			System.out.println(linkList.get(i).getAttribute("href"));

			if (linkList.get(i).getAttribute("href") != null
					&& (!linkList.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(linkList.get(i));

			}

		}

		// get the size of active links list:

		System.out.println("size of active links and images--->" + activeLinks.size());

		// 3. check the href url, with httpconnection api:
		// 200 = OK
		// 404 = not found
		// 500 = internal error
		// 400 = bad request

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();

			connection.connect();

			String response = connection.getResponseMessage(); // OK

			connection.disconnect();

			System.out.println(activeLinks.get(j).getAttribute("href") + "--->" + response);

		}

	}

	

	@Then("^I close it$")
	public void i_close_it() throws Throwable {
		
		driver.quit();

	}

}
