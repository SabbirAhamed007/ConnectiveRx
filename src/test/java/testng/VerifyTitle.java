package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

	@Test
	public void verifyApplicationTitle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.connectiverx.com/");

		// Actual title
		String my_title = driver.getTitle();
		System.out.println("Title is " + my_title);

		String expected_title = "American Well: Telemedicine Technology Solutions";

		Assert.assertEquals(my_title, expected_title);

		System.out.println("Test completed");

		driver.quit();

	}

}
