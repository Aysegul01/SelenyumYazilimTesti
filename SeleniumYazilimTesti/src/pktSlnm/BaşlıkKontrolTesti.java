package pktSlnm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaşlıkKontrolTesti {
	    public static void BaşlıkKontrolTestii(WebDriver surucu)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
			
			surucu.get("https://www.w3schools.com/"); 
	        // Sayfa başlığını alıp kontrol etme
	        String expectedTitle = "W3Schools Online Web Tutorials";
	        String actualTitle = surucu.getTitle();

	        if (actualTitle.equals(expectedTitle)) {
	            System.out.println("Başlık doğru.");
	        } else {
	            System.out.println("Başlık yanlış.");
	        }

	        // WebDriver'ı kapatma
	        surucu.quit();
	    }
	

}
