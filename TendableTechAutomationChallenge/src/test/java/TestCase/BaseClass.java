package TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\TendableTechAutomationChallenge\\DRIVER\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\test_chrome\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(option);
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
