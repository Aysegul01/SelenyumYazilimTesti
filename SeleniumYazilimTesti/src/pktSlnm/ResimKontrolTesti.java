package pktSlnm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResimKontrolTesti {
	

	    public static void ResimKontrolTestii(WebDriver surucu) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
	      surucu.get("https://www.w3schools.com/");
	    	Thread.sleep(2000);
	        // Resmi bulma ve kontrol etme
	        WebElement imageElement = surucu.findElement(By.cssSelector("img[src='/w3images/w3schoolscom_gray.gif']"));

	        if (imageElement.isDisplayed()) {
	            System.out.println("Resim bulundu.");
	        } else {
	            System.out.println("Resim bulunamadı.");
	        }

	        // WebDriver'ı kapatma
	        surucu.quit();
	    }
	}


