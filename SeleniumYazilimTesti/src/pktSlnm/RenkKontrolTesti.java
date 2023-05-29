package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RenkKontrolTesti {
	public static void RenkKontrolTesti(WebDriver surucu) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
		
	surucu.get("https://www.w3schools.com/");
	surucu.manage().window().maximize();
	Thread.sleep(2000);
	  // Arka plan rengini test etmek için gerekli öğeyi bulma
	 WebElement backgroundColorElement = surucu.findElement(By.cssSelector("div.w3-center"));
	 // Arka plan rengini almak için 'background-color' stilini kullanma
     String backgroundColor = backgroundColorElement.getCssValue("background-color");
     // Arka plan rengini konsolda yazdırma
     System.out.println("Background Color: " + backgroundColor);

     // WebDriver'ı kapatma 
    surucu.quit();
  }
 
}

 