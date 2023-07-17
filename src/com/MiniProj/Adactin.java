package com.MiniProj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspaces\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.xpath("(//input[@class='login_input'])[1]")).sendKeys("Madhan321");
		driver.findElement(By.xpath("(//input[@class='login_input'])[2]")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue("Melbourne");
		
		WebElement hot = driver.findElement(By.name("hotels"));
		Select s1 = new  Select(hot);
		s1.selectByVisibleText("Hotel Sunshine");
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select s2 = new Select(type);
		s2.selectByIndex(1);
		
		WebElement roomno = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(roomno);
		s3.selectByValue("6");
		
		WebElement checkin = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
		checkin.click();
		checkin.clear();
		checkin.sendKeys("23/03/2023");
		
		WebElement checkout = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
		checkout.click();
		checkout.clear();
		checkout.sendKeys("26/03/2023");
		
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");
		
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByVisibleText("1 - One");
		
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();

		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("Madhan");
		driver.findElement(By.name("last_name")).sendKeys("A");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("22A"
				+" Peaky Street"
				+" Melbourne"
				+" Australia");
		
		driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByValue("MAST");
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmonth);
		s7.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByValue("2022");
		
		driver.findElement(By.name("cc_cvv")).sendKeys("131");
		
		driver.findElement(By.xpath("//input[contains(@onclick,'book_hotel_validate();')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspaces\\Selenium_Project\\ScreenShot\\ADACTIN.png");
		FileUtils.copyFile(source, dest);

		System.out.println("OOOOOOOOOOOOOOOOOOOOKKKKKKKKKKKKKKKKKK");
	}

}