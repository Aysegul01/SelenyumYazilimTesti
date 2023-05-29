package pktSlnm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ImageİkiTesti {

	

	    public static void  ImageİkiTestii (WebDriver surucu) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
		
	        // w3schools web sitesini açma
	        surucu.get("https://www.w3schools.com/");
             
	        // Belirtilen CSS sınıfına sahip elementleri bulma
	        List<WebElement> elements = surucu.findElements(By.cssSelector(".w3-hide-small.grey-color.w3-card-2.w3-round"));

	        // Elementlerin metin içeriğini yazdırma
	        for (WebElement element : elements) {
	            System.out.println("Element Text: " + element.getText());
	        }

	        // WebDriver'ı kapatma
	        surucu.quit();
	    }
	}


