package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://petstore.octoperf.com/");
        driver.manage().window().maximize();
        
        WebElement store=    driver.findElement(By.linkText("Enter the Store"));
        store.click();
        
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys("j2ee10");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("j2ee10");
        driver.findElement(By.xpath("//input[@name='signon']")).click();
        
        driver.findElement(By.xpath("//div[2]/div/div/a[5]/img")).click();
        driver.findElement(By.linkText("AV-SB-02")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
	}

}
