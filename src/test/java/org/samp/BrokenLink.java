package org.samp;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

    public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		int size = findElements.size();
		System.out.println(size);
		for (WebElement x : findElements) {
			String attribute = x.getAttribute("href");
			if(attribute!=null) {
				URL u = new URL(attribute);
				URLConnection openConnection = u.openConnection();
				HttpsURLConnection hp = (HttpsURLConnection)openConnection;
				int responseCode = hp.getResponseCode();
				System.out.println(responseCode);
			if (responseCode>=400) {
				System.out.println(attribute);
				
			}
				}
				
				
			}
			
		}
			
		}
		
		
		
		
	

