package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	
	
	
	public static  void waitelement(WebDriver driver,int timesecond , By locator) {
		
		WebDriverWait wait=new WebDriverWait(driver , timesecond);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
//	public static void waitforElement(WebDriver driver, int timeInSeconds , By locator) {
//		  WebDriverWait wait=new WebDriverWait(driver, timeInSeconds);
//		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//	}

}
