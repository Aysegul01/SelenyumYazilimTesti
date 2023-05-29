package pktSlnm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TranslateButonunuSeçme {

	    public static void TranslateButonunuSeçme(	WebDriver surucu)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
			
	        // Web sitesini aç
	        surucu.get("https://www.w3schools.com/");
	        Thread.sleep(1000);
	        // "id=nav_translate_btn" özelliğine sahip düğmeyi bul
	        WebElement translateBtn=surucu.findElement(By.id("nav_translate_btn"));
	        //test1
	        // Düğmeye tıkla
	        translateBtn.click();
	        Thread.sleep(1000);
	        //test2
	        //Dil seçenek butonunu bul
	        WebElement secenekBtn=surucu.findElement(By.id(":0.targetLanguage"));
	        // Düğmeye tıkla
	        secenekBtn.click();
	        Thread.sleep(1000);
	       
	        // WebDriver'ı kapat 
	        surucu.quit();
	        
}
}

