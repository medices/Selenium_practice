package com.edureka.basics;




import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		/*C:\\Users\\Natalya\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe*/
		/*C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe*/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com");
		
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);
		
		//URL launch
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
		
		
		/*WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("name@gmail.com");
		
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
		
		
/*		//find element by partial link text
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
		
/*		WebElement mobile = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")); - By.className?
		mobile.sendKeys("6453678909");
		
		
		//xpath - //tagname[@attr='value']
        //cssSelector - tagname[attr='value'] - for InternetExplore
		
		/*WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("myemail@gmail.com");*/
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		//Search Employee by Name
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		name.sendKeys("Billie");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")));
		
		
		
		//Click on Search button
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		search.click();       
		
				
/*		//Find Employee by id
		
		/*WebElement id = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")); 
		id.sendKeys("2768");
		
		//Click on Search button
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		search.click();*/
		
		
		
		//Add Employee
		
/*WebElement add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		add.click();
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Billie");
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("Eilish");
		
		//WebElement photo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button"));
		//photo.click();
		
			
		WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		save.click();
		
		
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
		dropdown.click();
		
		
		
		//WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
		//logout.click();            */
		
		
		
/*		WebElement email = driver.findElement(By.cssSelector("input[data-testid=\'royal_email\']"));
		email.sendKeys("myemail@gmail.com");  */
	}

	
		
	}
		
		
		
	
	


