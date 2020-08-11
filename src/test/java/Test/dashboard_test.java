package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import Util.Excel_Reader;
import page.DashboardPage;
import page.LoginPage;

public class dashboard_test {
	
	WebDriver driver;
	Excel_Reader reader=new Excel_Reader("Data\\Opensource.xlsx");
	DashboardPage dashboardpage;
	
	@BeforeTest
	public void browse() {
		driver=BrowserFactory.launchbrowser();
		
	}
	
	@DataProvider(name="opensorce")//any name//data provider for excel annotation//
	public String[][] readdata(){
		   String [][] data=reader.getAllData("LoginSheet");//---sheet name of excel sheet//
		return data;	
		
	}
	
	
	@Test(dataProvider="opensorce")
	public void login(String name,String password) throws InterruptedException {
	LoginPage login=PageFactory.initElements(driver,LoginPage.class );
	login.username(name);
	login.password(password);
	login.login();
	login.newuser();
	login.addnewuser();

	}
	
	@DataProvider(name="openSourceAddUser")
	public  String [][] addnewtest(){
		    String [][] data=reader.getAllData("Sheet1");
		return data;
	}
	
	@Test(dependsOnMethods="login",dataProvider="openSourceAddUser")

	public void addcontact(String name1,String email,String name,String name2,String website) throws InterruptedException {
		
		DashboardPage	 addnew=PageFactory.initElements(driver,DashboardPage .class);
		Thread.sleep(3000);
		

		Thread.sleep(3000);
		addnew.loginusername(name1);
		Thread.sleep(3000);
		addnew.emailuser(email);
		Thread.sleep(3000);
		addnew.firstname(name);
		Thread.sleep(3000);
		addnew.lastname(name2);
		Thread.sleep(3000);
		addnew.websitename(website);
		Thread.sleep(3000);
		addnew.rolemodel();
		Thread.sleep(3000);
		addnew.atlastnewuseradded();
		
	}		
		
	}

	