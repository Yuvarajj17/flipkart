package org.flipkart;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[]args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DEEPAK\\eclipse-workspace\\Flipkart\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("redmi");
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 
	
}
}
