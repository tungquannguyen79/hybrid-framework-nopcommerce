package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.user.LoginPageUI;

public class UserLoginPageObject  extends BasePage{
	private WebDriver driver;
	public UserLoginPageObject(WebDriver driver) {
		this.driver = driver;		
	}
	public UserHomePageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);	
		return PageGeneratorManager.getUserHomePage(driver);
	}
	public String getEmailErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
	}
	public void inputToEmailTextBox(String email) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}
	public void inputToPasswordTextBox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
		
	}
	public String getValidationMessage() {
		waitForAllElementVisibile(driver, LoginPageUI.EMAIL_VALIDATION_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_VALIDATION_MESSAGE);
	}
	public UserHomePageObject loginAsUser(String emailAddress,String password) {
		inputToEmailTextBox(emailAddress);
		inputToPasswordTextBox(password);
		return clickToLoginButton();
		
	}

	
}
