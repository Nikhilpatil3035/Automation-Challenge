package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;

public class HomePageTestCase extends BaseClass {

	public void verifyMyStory() {
		try {
			HomePage home = new HomePage(driver);
			boolean actualResultVisible = home.isVisibleOurStory();
			boolean actualResultEnable = home.isEnabledOurStory();
			Assert.assertTrue(actualResultVisible, "our Story menu is visiable");
			Assert.assertTrue(actualResultEnable, "our Story menu is Enable");
			System.out.println("Our Story Accessibility test pass");
		} catch (Exception e) {
			System.out.println("Our Story Accessibility test fail");
		}

	}

	public void verifyOurSoluation() {
		try {
			HomePage home = new HomePage(driver);
			boolean OurSoluationVisiable = home.isVisibleOurSoluation();
			boolean OurSoluationEnable = home.isEnabledOurSoluation();
			Assert.assertTrue(OurSoluationVisiable, "our Soluation menu is visiable");
			Assert.assertTrue(OurSoluationEnable, "our Soluation menu is Enable");
			System.out.println("Our Soluation Accessibility test pass");
		} catch (Exception e) {
			System.out.println("Our Soluation Accessibility test fail");
		}
	}

	public void verifyWhyTendable() {
		try {
			HomePage home = new HomePage(driver);
			boolean WhyTendableVisiable = home.isVisiableCheckWhyTendable();
			boolean WhyTendableEnable = home.isEnabledCheckWhyTendable();
			Assert.assertTrue(WhyTendableVisiable, "WhyTendableVisiable menu is Visiable");
			Assert.assertTrue(WhyTendableEnable, "WhyTendableVisiable menu is Enable");
			System.out.println("Why Tendable Accessibility test pass");
		} catch (Exception e) {
			System.out.println("Why Tendable Accessibility test fail");
		}
	}

}
