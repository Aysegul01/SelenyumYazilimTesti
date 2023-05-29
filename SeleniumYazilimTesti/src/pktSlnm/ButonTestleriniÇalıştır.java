package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButonTestleriniÇalıştır {
	  public static void ButonTestleriniÇalıştırr(WebDriver surucu)throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
	    	
	    	surucu.get("https://www.w3schools.com/");
	    	Thread.sleep(2000);
	     // Butonu bulma ve tıklama
	        WebElement customButton = surucu.findElement(By.className("ws-btn tut-button ga-fp"));
	        customButton.click();

	        String expectedUrl = "https://www.w3schools.com/pro/index.php";
	        String actualUrl = surucu.getCurrentUrl();
	        
	        if (actualUrl.equals(expectedUrl)) {
	            System.out.println("Butona tıklandı ve doğru sayfaya yönlendirildi: " + actualUrl);
	        } else {
	            System.out.println("Butona tıklama başarısız. Beklenen: " + expectedUrl + ", Alınan: " + actualUrl);
	        }
	        
	       surucu.quit();
	    }
	}

  

       