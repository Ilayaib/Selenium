package com.MiniProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspaces\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");

		driver.findElement(By.xpath("//img[@alt='Vaathi']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@data-phase='postRelease'])[1]")).click();

		Thread.sleep(5000);
		WebElement frame = driver.findElement(By.xpath("//div[@class='wzrk-alert wiz-show-animate']"));

		if (frame.isDisplayed() == true) {

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Not Now']")).click();
		}
		System.out.println("=========================== pop up cancelled by IF condition");

		driver.findElement(By.xpath("(//div[@class='date-day'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement Venue = driver.findElement(By.xpath("(//a[@data-venue-code='VRCM'])[3]"));
		Venue.click();
		
		driver.findElement(By.id("btnPopupAccept")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("proceed-Qty")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'7')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@onclick=\"fnSelectSeat('A_3_023')\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='dismiss']")).click();

//		WebElement frame = driver.findElement(By.xpath("//div[@class='wzrk-alert wiz-show-animate']"));
//		
//		if(frame.isDisplayed()==true) {
//			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[text()='Not Now']")).click();
//		}

		System.out.println("DONEEEEEE");

	}

}
