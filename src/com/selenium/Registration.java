package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://petstore.octoperf.com/");
        driver.manage().window().maximize();
        
        WebElement store=    driver.findElement(By.linkText("Enter the Store"));
        store.click();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.linkText("Register Now!")).click();
        driver.findElement(By.name("username")).sendKeys("j2ee4");
        
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("j2ee4");
        
        driver.findElement(By.name("repeatedPassword")).click();
        driver.findElement(By.name("repeatedPassword")).sendKeys("j2ee4");
        
        driver.findElement(By.name("account.firstName")).click();
        driver.findElement(By.name("account.firstName")).sendKeys("Kunal");
        
        driver.findElement(By.name("account.lastName")).click();
        driver.findElement(By.name("account.lastName")).sendKeys("Patil");
        
        driver.findElement(By.name("account.email")).click();
        driver.findElement(By.name("account.email")).sendKeys("kunal@gmail.com");
        
        driver.findElement(By.name("account.phone")).click();
        driver.findElement(By.name("account.phone")).sendKeys("1234567890");
        
        driver.findElement(By.name("account.address1")).click();
        driver.findElement(By.name("account.address1")).sendKeys("ravindra nagar");
        
        driver.findElement(By.name("account.address2")).click();
        driver.findElement(By.name("account.address2")).sendKeys("Kuwarbav");
        
        driver.findElement(By.name("account.city")).click();
        driver.findElement(By.name("account.city")).sendKeys("Ratnagiri");
        
        driver.findElement(By.name("account.state")).click();
        driver.findElement(By.name("account.state")).sendKeys("Maharashtra");
        
        driver.findElement(By.name("account.zip")).click();
        driver.findElement(By.name("account.zip")).sendKeys("415639");
        
        driver.findElement(By.name("account.country")).click();
        driver.findElement(By.name("account.country")).sendKeys("India");
        
        driver.findElement(By.name("newAccount")).click();
        
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys("j2ee4");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("j2ee4");
        driver.findElement(By.xpath("//input[@name='signon']")).click();
	}

}
