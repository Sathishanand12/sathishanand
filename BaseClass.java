package com.Maven_Day1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
//	public static WebDriver launchBrowser(String browsername) {
//		
//		if (browsername.equalsIgnoreCase("chrome")) {
//			
//			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\OneDrive\\Desktop\\"
//					+ "Selenium 10AM August\\Maven_Day1\\Drivers\\chromedriver.exe");
//			driver=new ChromeDriver();
//			driver.manage().window().maximize();
//		}
//		else if (browsername.equalsIgnoreCase("edge")) {
//			
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
//			driver=new EdgeDriver();
//			driver.manage().window().maximize();
//		}
//		
//		return driver;
//	}
//	
	public static WebDriver launchBrowser(String chrome) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\OneDrive\\Desktop\\"
				+ "Selenium 10AM August\\Maven_Day1\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void Launchurl(String url) {
	driver.get(url);
}
	public static void Closewindow() {
	driver.close();
}
public static void Quit() {
	driver.quit();
}

public static void NavigateTo(String url) {
driver.navigate().to(url);
}

public static void Navigateback() {
	driver.navigate().back();
}

public static void Navigateforward() {
	driver.navigate().forward();
}

public static void Navigaterefresh() {
	driver.navigate().refresh();
}
public static void Alertaccept() {
	Alert a1= driver.switchTo().alert();
	a1.accept();
}
public void Alertdismiss() {
	Alert a2=driver.switchTo().alert();
	a2.dismiss();
}

public static void passinput(WebElement element,String input) {
	element.sendKeys(input);
}

public static void clickonelement(WebElement element) {
	element.click();
}
public static void gettitlemethod() {
	String title = driver.getTitle();
	System.out.println(title);
}
public static void Dropdown(WebElement element, int index) {
	Select sc = new Select(element);
	sc.selectByIndex(index);
	
}
public static void Dropdown(WebElement element, String value) {
	Select sc = new Select(element);
	sc.selectByValue(value);
	
}
	public static void clear(WebElement element) {
	element.clear();
	}

}
