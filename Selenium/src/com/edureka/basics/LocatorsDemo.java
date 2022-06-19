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
		
		
		//find element by partial link text
		driver.findElement(By.partialLinkText("account")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/input[@value='1']")));
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//span/input[@value='1']"));
		femaleRadioBtn.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname' and @aria-label='First name']"));
		fname.sendKeys("Natalie");
		
		/*WebElement fname = driver.findElement(By.xpath("//input[@name='firstname' or @aria-label='First name' and @id='u_2_b_lO']"));
		fname.sendKeys("Natalie");*/
		
		
		/*Dynamic Value*/
		/* starts-with and contains*/
		//tagname[starts-with(@attr,'partial value')]
		//tagname[starts-with(text(),'partial text']
		
		/*WebElement welcomeMsg=driver.findElement(By.xpath("//div[starts-with(text().'Connect your')]"));
		System.out.println(welcomeMsg.getText()); //just an example, doesn't work at FB*/
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		mobile.sendKeys("6453678909");
		
		//xpath - //tagname[@attr='value']
        //cssSelector - tagname[attr='value'] - for InternetExplore
		
		/*WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("myemail@gmail.com");*/
		
		WebElement email = driver.findElement(By.cssSelector("input[data-testid=\'royal_email\']"));
		email.sendKeys("myemail@gmail.com");
	}

	
		
	}
		
		
		
	
	


