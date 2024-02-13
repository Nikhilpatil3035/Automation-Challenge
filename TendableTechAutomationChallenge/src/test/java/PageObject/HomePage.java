package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[text()='Our Story']")
	private WebElement lnkMyStory;

	@FindBy(xpath = "//*[text()='Our Solution']")
	private WebElement lnkOurSoluation;

	@FindBy(xpath = "//*[text()='Why Tendable?']")
	private WebElement lnkWhyTendable;
	
	@FindBy(xpath = "//*[text()='Request A Demo']")
	private WebElement lnkRequestDemo;
	
	@FindBy(xpath = "//*[text()='About Us']")
	private WebElement lnkAboutUs;
	
	@FindBy(xpath = "//*[text()='Contact us']")
	private WebElement lnkContactUs;
	
	

	public boolean isVisibleOurStory() {
		return lnkMyStory.isDisplayed();
	}

	public boolean isEnabledOurStory() {
		return lnkMyStory.isEnabled();
	}

	public void clickOurStory() {
		lnkMyStory.click();
	}

	public boolean isVisibleOurSoluation() {
		return lnkOurSoluation.isDisplayed();
	}

	public boolean isEnabledOurSoluation() {
		return lnkOurSoluation.isEnabled();
	}
	public void clickOurSoluation() {
		lnkOurSoluation.click();
	}
	public boolean isVisiableCheckWhyTendable() {
		return lnkWhyTendable.isDisplayed();
	}

	public boolean isEnabledCheckWhyTendable() {
		return lnkWhyTendable.isEnabled();
	}
	public void clickWhyTendable() {
		lnkWhyTendable.click();
	}
	
	public boolean isVisibleRequestDemo() {
		return lnkRequestDemo.isDisplayed();
	}

	public boolean isEnabledRequestDemo() {
		return lnkRequestDemo.isEnabled();
	}

	public void clickRequestDemo() {
		lnkRequestDemo.click();
	}
	
	public void clickContactUs() {
		lnkContactUs.click();
	
	}
	
	public void mouseHoverAboutUs()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkAboutUs).perform();;
	}
}
