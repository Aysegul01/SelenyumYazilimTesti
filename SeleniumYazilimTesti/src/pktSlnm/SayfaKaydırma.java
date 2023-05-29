package pktSlnm;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SayfaKaydırma {
	    public static void SayfaKaydırmaTesti(WebDriver surucu) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
			
	        surucu.get("https://www.w3schools.com/");
	        Thread.sleep(1000);
	        JavascriptExecutor js = (JavascriptExecutor) surucu;
	        js.executeScript("window.scrollBy(0, 500)");
	        Thread.sleep(1000);
	       surucu.quit();
	    }
	}


