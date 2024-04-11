package com.seleniumParameter;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Parameter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://petstore.octoperf.com/");
        driver.manage().window().maximize();
        
        FileInputStream f1=new FileInputStream("SeleniumData.xls");
        Workbook w=Workbook.getWorkbook(f1);
        Sheet s=w.getSheet(0);
        
        String username=s.getCell(0,0).getContents();
        String password=s.getCell(1,0).getContents();
        
        WebElement store=driver.findElement(By.linkText("Enter the Store"));
        store.click();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='signon']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//a[@href='/actions/Account.action?signoff=']")).click();
        
	}

}
