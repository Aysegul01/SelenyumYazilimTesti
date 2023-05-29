package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RenKontrolTestiİki {
	public static void RenKontrolTestiİki(WebDriver surucu) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
	
	surucu.get("https://www.w3schools.com/");
	surucu.manage().window().maximize();
	Thread.sleep(2000);
	// Arka plan rengini test etmek için gerekli öğeyi bulma
			 WebElement backgroundColorElement = surucu.findElement(By.id("cert_navbtn"));
			 // Arka plan rengini almak için 'background-color' stilini kullanma
		     String backGroundColor = backgroundColorElement.getCssValue("background-color");
		     // Arka plan rengini konsolda yazdırma
		 	
		     if( backGroundColor.equals("#ffffff")) {
					System.out.println("Test Başarılı.");
				}
				else {
					System.out.println("Test Başarısız."+"Background Color: " +backGroundColor);
				}
				surucu.quit();
		
 }
	}
