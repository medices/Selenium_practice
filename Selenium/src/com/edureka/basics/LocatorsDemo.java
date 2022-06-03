package com.edureka.basics;




import java.time.Duration;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LocatorsDemo {
	
	public static WebDriver driver = null; 

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		/*WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("nataly-m@tut.by");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("your_password");
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		for(WebElement link: allLinks) {
			String text = link.getText();
			System.out.println(text);
		}*/
		
		//driver.findElement(By.linkText("Forgot password?")).click(); // the same as next
		//driver.findElement(By.partialLinkText("password")).click(); // the same as previous
		
		driver.findElement(By.partialLinkText("account")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/input[@value='1']")));
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//span/input[@value='1']"));
		femaleRadioBtn.click();
		
			
	}

	
		
	}
		
		
		
		/*WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("myemail@gmail.com");*/
		
	//}

	
	


