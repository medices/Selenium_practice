package com.edureka.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		/*
		 * driver.navigate().to("https://www.facebook.com"); 
		 * driver.navigate().back();
		 * driver.navigate().forward(); 
		 * driver.navigate().refresh();
		 */
		
		
		String browserId = driver.getWindowHandle();
		System.out.println(browserId);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		//driver.close(); // close current page
		//driver.quit(); // close browser
		
		
	}

}
