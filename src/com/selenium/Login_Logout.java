package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Login_Logout {

 

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

 

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://petstore.octoperf.com/");
        driver.manage().window().maximize();
        
        WebElement store=    driver.findElement(By.linkText("Enter the Store"));
        store.click();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys("j2ee");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("j2ee");
        driver.findElement(By.xpath("//input[@name='signon']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//a[@href='/actions/Account.action?signoff=']")).click();
        
    }

 

}