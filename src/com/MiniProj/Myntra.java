package com.MiniProj;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspaces\\Selenium_Project\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    driver.manage().window().maximize();
	   
	    Actions ac = new Actions(driver);
	    
	    Thread.sleep(2000);
	    WebElement profile = driver.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
	    ac.moveToElement(profile).build().perform();
	    WebElement login = driver.findElement(By.xpath("//a[text()='login / Signup']"));
	    login.click();
	    
	    WebElement phnno = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	    phnno.sendKeys("8072579268");

	    WebElement cont = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	    cont.click();
	    Thread.sleep(35000);
	    WebElement bottombut = driver.findElement(By.xpath("(//div[@class='bottomeLink'])[1]/span"));
	    bottombut.click();
	    Thread.sleep(2000);
	    WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("Selenium1304@");
	    
	    
	    
	    
//	    Thread.sleep(2000);
//	    WebElement name = driver.findElement(By.xpath("//input[@name='emailMobile']"));
//	    name.sendKeys("8072579268");
//	    WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
//	    submit.click();
	    
	   
//	    WebElement makeup = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
//	    ac.moveToElement(makeup);
	   
	    
	    
	    
	    
	    
	    
	    System.out.println("Finished=======================");
	    WebElement mob = driver.findElement(By.xpath("//input[@placeholder='Enter Email ID or Phone Number']"));
		mob.sendKeys("8072579268");
		
		WebElement procee = driver.findElement(By.xpath("//button[@type='submit']"));
		procee.click();
		
		WebElement fill = driver.findElement(By.xpath("//input[@type='number']"));
		fill.click();
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the OTP");
		String otp = sc.next();
		fill.sendKeys(otp);
		
		WebElement verif = driver.findElement(By.xpath("//button[@type='submit']"));
		verif.click();
		
		
		
		
		
		
		
		
		
		
	}

}
