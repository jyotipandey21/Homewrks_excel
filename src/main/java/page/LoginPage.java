package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public void login(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='user_login']")
	WebElement UserName_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='user_pass']")
	WebElement Password_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='wp-submit']")
	WebElement LogIn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-users\"]/a/div[2]")
	WebElement NEW_USER;
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-users\"]/ul/li[3]/a")
	WebElement ADD_NEW_BUTTON;

	public void username(String name) {
		UserName_Locator.sendKeys(name);

	}

	public void password(String password) {
		Password_Locator.sendKeys(password);

	}

	public void login() {
		LogIn.click();
	}

	public void newuser() {
		NEW_USER.click();
	}

	public void addnewuser() {
		ADD_NEW_BUTTON.click();
	}

}
