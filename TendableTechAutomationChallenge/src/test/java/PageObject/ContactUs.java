package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUs extends BasePage {

	public ContactUs(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]")
	private WebElement marketingContactUs;

	@FindBy(xpath = "//*[@id='form-input-fullName']")
	private WebElement fullName;

	@FindBy(xpath = "//*[@id='form-input-organisationName']")
	private WebElement organisationName;

	@FindBy(xpath = "//*[@id='form-input-cellPhone']")
	private WebElement cellPhone;

	@FindBy(xpath = "//*[@id='form-input-email']")
	private WebElement email;

	@FindBy(xpath = "//*[@id='form-input-jobRole']")
	private WebElement jobRole;

	@FindBy(xpath = "//*[@id='form-input-consentAgreed-0']")
	private WebElement agreed;

	@FindBy(xpath = "(//button[@data-loading-text='Loading...'][normalize-space()='Submit'])[1]")
	private WebElement submit;

	@FindBy(xpath = "(//p[contains(text(),'Sorry, there was an error submitting the form. Ple')])[1]")
	private WebElement msgConformation;

	public void clickmarketingContactUs() {
		marketingContactUs.click();
	}

	public void setorganisationName(String oname) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		organisationName.sendKeys(oname);
	}

	public void setFullName(String name) {
		fullName.sendKeys(name);
	}

	public void setcellPhone(String name) {
		cellPhone.sendKeys(name);
	}

	public void setemail(String mail) {
		email.sendKeys(mail);
	}

	public void clickJobRole() {
		Select click = new Select(jobRole);
		click.selectByValue("Executive Board Member");
	}

	public void clickIAgree() {
		agreed.click();
	}

	public void clickOnSubmit() {
		
		JavascriptExecutor button = (JavascriptExecutor) driver;
		button.executeScript("arguments[0].scrollIntoView();", submit);
		button.executeScript("arguments[0].click();", submit);
	}

	public String getConformationMsg() {

		JavascriptExecutor button = (JavascriptExecutor) driver;
		button.executeScript("arguments[0].scrollIntoView();", msgConformation);

		try {
			return (msgConformation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
