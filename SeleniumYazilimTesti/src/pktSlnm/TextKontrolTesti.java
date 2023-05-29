package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextKontrolTesti {  
	public static void TextKontrolTesti(WebDriver surucu) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
	
	surucu.get("https://www.w3schools.com/");
	Thread.sleep(2000);
	surucu.findElement(By.id("search2")).sendKeys("html");
	Thread.sleep(1000);
	WebElement div=surucu.findElement(By.id("displayName"));
	Thread.sleep(3000);
	String displayName=div.getText();
	
	surucu.quit();
	if(displayName.equals("html")) {
		System.out.println("Test Başarılı.");
	}
	else{
		System.out.println("Test Başarısız.");
	}
 }
}