package pktSlnm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AçılırPencere {
	    public static void AçılırPencereTesti(WebDriver surucu) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
			
	        surucu.get("https://www.w3schools.com/");
	        Thread.sleep(2000);
	        WebElement dropdown = surucu.findElement(By.id("myDropdownId"));
	        Select select = new Select(dropdown);
	        select.selectByVisibleText("Option 1");
	        Thread.sleep(1000);
	        surucu.quit();
	    }

		

	}

