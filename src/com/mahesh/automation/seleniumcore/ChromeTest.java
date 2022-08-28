package com.mahesh.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class ChromeTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmvdu\\Documents\\JAVA WITH SELENIUM By RAMESH ANAPATI\\ECLIPSE FILES\\MDL\\Drivers\\chromedriver.exe");
// System.setProperty ---> Used to set the path of Drivers
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.youtube.com/");  // to get URL
	WebElement text = driver.findElement(By.xpath("//input[@id='search']"));
	text.clear();
	//Thread.sleep(5000);
	text.sendKeys("Naa Peru Seesa Song [4K] - Ramarao On Duty");

	WebElement text1 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	
	text1.click();
	

	WebElement text2 = driver.findElement(By.linkText("Naa Peru Seesa - Full Video Song [4K] | Ramarao On Duty | Ravi Teja | Anveshi Jain | Shreya Ghoshal"));
	text2.click();
	/*WebElement text3 = driver.findElement(By.className("style-scope ytd-video-renderer"));
	Actions actions =new Actions(driver);
	actions.click().build().perform();*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*driver.get("https://www.gmail.com/");  // to get URL
	//WebElement text = driver.findElement(By.name("identifier"));
	WebElement text = driver.findElement(By.xpath("//input[@id='identifierId']"));
	text.clear();
	text.sendKeys("abcdefg@gmail.com");
	// WebElement text1 = driver.findElement(By.id("identifierNext"));
	WebElement text1 = driver.findElement(By.xpath("//div[@id='identifierNext']"));
	text1.click();*/
	
	
	
	
	
}
}