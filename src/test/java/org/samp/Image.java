package org.samp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
     public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    List<WebElement> findElements = driver.findElements(By.tagName("img"));
	    int size = findElements.size();
	    System.out.println(size);
	    
	    for (int i = 0; i < findElements.size(); i++) {
	    	WebElement webElement = findElements.get(i);
	    	String attribute = webElement.getAttribute("src");
	    	System.out.println(attribute);
			
		}
     
     
     }
}
