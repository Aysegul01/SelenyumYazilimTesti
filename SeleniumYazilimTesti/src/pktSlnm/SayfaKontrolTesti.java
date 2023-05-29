package pktSlnm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SayfaKontrolTesti {
	    public static void SayfaKontrolTesti(WebDriver surucu) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
	    	
	    	surucu.get("https://www.w3schools.com/");
	    	Thread.sleep(2000);
	       // Sayfa kaynak kodunu alıp kontrol etme
	        String pageSource =surucu.getPageSource();
	        String expectedText = "W3Schools Online Web Tutorials";

	        if (pageSource.contains(expectedText)) {
	            System.out.println("Sayfa kaynak kodu doğru.");
	        } else {
	            System.out.println("Sayfa kaynak kodu yanlış.");
	        }

	        // WebDriver'ı kapatma
	        surucu.quit();
	    }
	}


