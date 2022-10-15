package com.edureka.basics;
 

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.concurrent.TimeUnit;
	import javax.xml.datatype.Duration;
	import java.util.List;
	
	public class FindElement {
		
				public static void main(String[] args) {
			      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natalya\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			   
			      //implicit wait
			      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			      //WebDriverWait wait = new WebDriverWait(driver, Duration.OfSeconds(5));
			      
			      //URL launch
			      driver.get("https://www.amazon.com/");
			      //identify single element
			      WebElement elm = driver.findElement(By.tagName("h2"));
			      String s = elm.getText();
			      System.out.println("Get text on element: " + s);
			      //identify all elements with tag name
			      List<WebElement> i = driver.findElements(By.tagName("img"));
			      //count
			      int c = i.size();
			      System.out.println("Number of images: " + c);
			      //browser close
			      driver.close();
			   }

		}




