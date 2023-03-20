package com.MiniProj;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	
	public static void main(String[]args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspaces\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.nykaa.com/");
		
		Actions ac = new Actions(driver);
		
		WebElement sig = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		ac.moveToElement(sig).build().perform();
		sig.click();
		
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
		
		WebElement hair = driver.findElement(By.xpath("//a[text()='hair']"));
		ac.moveToElement(hair).build().perform();
		
			
		WebElement opt = driver.findElement(By.xpath("(//a[text()='Hair Color'])[1]"));
		
		opt.click();
		
		String s1 =driver.getWindowHandle();
		
		String s2 = ""; 
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String title:windowHandles) {
			
			if(!title.equals(s1)) {
		
				s2=title;
				
				driver.switchTo().window(title);
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		WebElement color = driver.findElement(By.xpath("//div[contains(text(),'BBLUNT Salon Secret High Shine')]"));
		color.click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		for(String title2:windowHandles1) {
			
			if(!title2.equals(s1) && !title2.equals(s2)) {
				
				driver.switchTo().window(title2);
				
			}
		}
		
//		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(1000);

		WebElement bag = driver.findElement(By.xpath("(//span[text()='Add to Bag']//parent::button[@type='button'])[1]"));
		bag.click();
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//span[@class='cart-count']"));
		cart.click();
		

		driver.switchTo().frame(0);
		WebElement pro =driver.findElement(By.xpath("//span[text()='Proceed']"));
		pro.click();
		driver.switchTo().defaultContent();
				
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		Thread.sleep(2000);
		
		ac.moveToElement(pincode).build().perform();
		
		Thread.sleep(2000);
		pincode.click();
		
		Thread.sleep(2000);
		pincode.sendKeys("638009");
		
		Thread.sleep(2000);
		WebElement houseno = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		houseno.sendKeys("200/B");
		
		Thread.sleep(2000);
		WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"
				+ ""));
		area.sendKeys("Kasipalayam,");
		
		Thread.sleep(2000);
		WebElement phnno = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phnno.sendKeys("8072579268");
		
		
		WebElement order = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
		order.click();
		
		

		
		
		
		
		
		
		
		
		System.out.println("================================================Finished");
	}
}
