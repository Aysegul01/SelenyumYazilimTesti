package pktSlnm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AramaKontrolTesti {
    public static void  AramaKontrolTestii(WebDriver surucu) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
		surucu.get("https://www.w3schools.com/"); 
        // Arama alanını bulma ve kontrol etme
        WebElement searchField = surucu.findElement(By.id("gsc-i-id1"));

        if (searchField.isDisplayed()) {
            System.out.println("Arama alanı bulundu.");
        } else {
            System.out.println("Arama alanı bulunamadı.");
        }

        // WebDriver'ı kapatma
       surucu.quit();
    }
}



