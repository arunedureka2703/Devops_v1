package edu.co;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");  
		//WebDriver driver = new ChromeDriver();  
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(chromeOptions); 
	      
	// Launch website  
	    driver.navigate().to("http://www.edureka.co/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();  
	    
	    
	    driver.close();
	      
	    }  

	}


