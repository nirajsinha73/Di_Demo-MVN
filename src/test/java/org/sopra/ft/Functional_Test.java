package org.sopra.ft;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
from selenium import webdriver;
from selenium.webdriver.chrome.options import Options;

public class Functional_Test {

	@Test
	public void functionalTest() throws InterruptedException {
		
		
		options = Options()
		options.headless = True
		driver = webdriver.Chrome(options=options)
		driver.get("https://www.youtube.com/")
		element_text = driver.find_element_by_id("title").text
		print(element_text)
	//System.setProperty("webdriver.chrome.driver", "C:\\Office Work\\Software\\chromedriver.exe");
    	//ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        //options.addArguments("--disable-gpu");
		//WebDriver driver = new ChromeDriver();
		// Launch website
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().refresh();
		//TimeUnit.SECONDS.sleep(30);
		// Click on the search text box and send value
		//WebElement divElement = driver.findElement(By.id("header_h1"));
		//String str = divElement.getText();
		//System.out.println(str);
		//assertEquals("Welcome to DI-India", str);
	}
}
