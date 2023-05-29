package pktSlnm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class MenüNavigasyonTesti{
	public static void MenüNavigasyonTestii(WebDriver surucu)throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
	
	surucu.get("https://www.w3schools.com/");
	Thread.sleep(2000);
	        // Menü öğesini bulma ve tıklama
	        WebElement menuElement = surucu.findElement(By.linkText("Learn HTML"));
	        menuElement.click();

	        // Yeni sayfanın URL'sini kontrol etme
	        String expectedUrl = "https://www.w3schools.com/html/default.asp";
	        String actualUrl = surucu.getCurrentUrl();

	        if (actualUrl.equals(expectedUrl)) {
	            System.out.println("Menü navigasyonu başarılı.");
	        } else {
	            System.out.println("Menü navigasyonu başarısız.");
	        }

	        // WebDriver'ı kapatma
	        surucu.quit();
	    }

	}

