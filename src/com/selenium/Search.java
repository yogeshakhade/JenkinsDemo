package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://petstore.octoperf.com/");
        driver.manage().window().maximize();
        
        WebElement store=    driver.findElement(By.linkText("Enter the Store"));
        store.click();
        
        driver.findElement(By.name("keyword")).click();
        driver.findElement(By.name("keyword")).sendKeys("bulldog");
        
        driver.findElement(By.name("searchProducts")).click();
	}

}
