package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import Util.Excel_Reader;
import page.LoginPage;

public class Login_Test {

	 WebDriver driver;
	// Excel_Reader reader;//invoke
	Excel_Reader reader = new Excel_Reader(".\\Data\\Opensource.xlsx");

	
	@BeforeTest
	public  void openbrowser() {
		driver = BrowserFactory.launchbrowser();
	}
	
	
	@DataProvider(name = "getAllInfo")
	public String[][] opensorcepage() {
		
		String[][] data = reader.getAllData("LoginSheet");	//getalldata is method of excel class//
		return data;
	}

	@Test(dataProvider = "getAllInfo")
	public  void logintest(String username,String password) {
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.username(username);
		login.password(password);
		login.login();
		System.out.println(driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("password"));
	}

}
