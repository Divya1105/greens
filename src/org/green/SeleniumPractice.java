package org.green;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationTesting.in/Alerts.html");
		
		WebElement simpleA = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		simpleA.click();
		
		WebElement simpleA1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		simpleA1.click();
		
		Alert a= driver.switchTo().alert();
		a.sendKeys("aaaaaaaaaaaa");
		
		Thread.sleep(3000);
		a.accept();
		
		System.out.println("Done....");
		
	}
}
