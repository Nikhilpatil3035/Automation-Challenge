package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;

public class RequestDemoTestCase extends BaseClass {

	public void verifyRequestDemoEnable() {
		try {
			HomePage Home = new HomePage(driver);
			boolean ActualResult = Home.isEnabledRequestDemo();
			Assert.assertTrue(ActualResult, "Request a Demo button is not enabled");
		} catch (Exception e) {
			System.out.println("Request demo button is enable");
		}
	}

	public void verifyRequestDemoClickable() {
		try {
			HomePage Home = new HomePage(driver);
			if (Home.isEnabledRequestDemo() && Home.isVisibleRequestDemo()) {
				Home.clickRequestDemo();
			} else {
				Assert.assertTrue(false, "Request a Demo button is not enabled/visible");
			}

		} catch (Exception e) {
			System.out.println("Request demo button is not clickable");
		}

	}

	@Test
	public void verifyRequestDemoOnOurStory() {
		try {
			HomePage Home = new HomePage(driver);
			Home.clickOurStory();
			verifyRequestDemoClickable();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("Request demo button is not available on OurStory");
		}

	}

	@Test
	public void verifyRequestDemoOnOurSolution() {
		try {
			HomePage Home = new HomePage(driver);
			Home.clickOurSoluation();
			verifyRequestDemoClickable();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("Request demo button is not available on OurSolution");
		}

	}

	@Test
	public void verifyRequestDemoOnWhyTendable() {
		try {
			HomePage Home = new HomePage(driver);
			Home.clickWhyTendable();
			verifyRequestDemoClickable();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("Request demo button is not available on WhyTendable");
		}

	}

}
