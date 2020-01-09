package org.cts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srsuresh\\eclipse-workspace\\suresh\\SeleniumSampl2\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.location = 'https://www.toolsqa.com/';");
	
	//driver.get("https://www.toolsqa.com/");
	//driver.navigate().to("https://www.facebook.com/");
	WebElement lnkTutorial = driver.findElement(By.xpath("(//a/child::span/child::span[text()='Selenium Training'])[1]"));
	
	js.executeScript("arguments[0].click();", lnkTutorial);
	
	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	
	js.executeScript("window.scrollBy(0,-10000);");
	

	
}

}
