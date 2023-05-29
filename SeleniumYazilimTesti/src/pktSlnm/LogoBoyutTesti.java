package pktSlnm;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LogoBoyutTesti {
       public static void LogoBoyutTesti (WebDriver surucu)throws InterruptedException {
   		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
 
   		  // w3schools web sitesini açma
	      surucu.get("https://www.w3schools.com/");
	      Thread.sleep(1000);
           // Logo elementini bulma
	        WebElement logo =surucu.findElement(By.xpath("//i[@class='fa fa-logo ws-text-green ws-hover-text-green']"));

	        // Logo boyutunu ölçme
	        Dimension size = logo.getSize();
	        int width = size.getWidth();
	        int height = size.getHeight();

	        // Sonuçları yazdırma
	        System.out.println("Logo Width: " + width);
	        System.out.println("Logo Height: " + height);

	        // WebDriver'ı kapatma
	      surucu.quit();
	    }
	}


