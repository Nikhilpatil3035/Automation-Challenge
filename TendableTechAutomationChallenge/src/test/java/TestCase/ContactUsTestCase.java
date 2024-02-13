package TestCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.ContactUs;
import PageObject.HomePage;

public class ContactUsTestCase extends BaseClass {

	public void verifyContactUs() {
		try {
			HomePage home = new HomePage(driver);
			home.mouseHoverAboutUs();
			home.clickContactUs();
		} catch (Exception e) {
			System.out.println("test fail on ContactUs");
		}

	}

	public void verifyMarkatingContactUs() {
		try {
			ContactUs contact = new ContactUs(driver);
			contact.clickmarketingContactUs();
			contact.setFullName("Nikhil Patil");
			contact.setorganisationName("Tendable Technology");
			contact.setcellPhone("8855883035");
			contact.setemail("nikhilpatil3035@gmail.com");
			contact.clickJobRole();
			contact.clickIAgree();
			contact.clickOnSubmit();

			{
				String confmsg = contact.getConformationMsg();
				Assert.assertEquals(confmsg, "Sorry, there was an error submitting the form. Please try again.");
				System.out.println("Markating Contact Us Test Pass");
			}
		} catch (Exception e) {
			System.out.println("test fail On Marketing ContactUs");

		}
	}

}
