package com.edureka.basics;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.concurrent.TimeUnit;
	import java.util.List;

	public class FindElement {
		
				public static void main(String[] args) {
			      System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			      WebDriver driver = new ChromeDriver(); 
			      //implicit wait
			      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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




