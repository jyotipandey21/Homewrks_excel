package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {
         WebDriver driver;
         
      public void dashpage(WebDriver driver) {
    	this.driver=driver;
      }                                     //div[contains(text(),'Users')] or
     
	 	  @FindBy(how=How.XPATH,using="//input[@id=\"user_login\"]")
		WebElement USER_NAME_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"email\"]")
		WebElement EMAIL_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"first_name\"]")
		WebElement FIRST_NAME_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"last_name\"]")
		WebElement LAST_NAME_BUTTON;
		@FindBy(how=How.XPATH,using="//input[@id=\"url\"]")
		WebElement WEBSITE_NAME_BUTTON;
			@FindBy(how=How.XPATH,using="//*[@id=\"role\"]")
		WebElement ROLE_BUTTON;
			@FindBy(how=How.XPATH,using="//input[@id=\"createusersub\"]")
			WebElement ADDED_USERSUBMIT_BUTTON;
		
			
			
			public void loginusername(String name1) {
				USER_NAME_BUTTON.sendKeys(name1);	
			}
			public void emailuser(String email) {
				EMAIL_BUTTON.sendKeys(email);	
			}
			public void firstname(String name) {
				FIRST_NAME_BUTTON.sendKeys(name);
			}
				public void lastname(String name2) {
				LAST_NAME_BUTTON.sendKeys(name2);
			}
			public void websitename(String website) {
				WEBSITE_NAME_BUTTON.sendKeys(website);	
			}
			public void rolemodel() {
				Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"role\"]")));
				sel.selectByVisibleText("Author");
				ROLE_BUTTON.click();
			}
			public void atlastnewuseradded() {
				ADDED_USERSUBMIT_BUTTON.click();
			}
		

	}





