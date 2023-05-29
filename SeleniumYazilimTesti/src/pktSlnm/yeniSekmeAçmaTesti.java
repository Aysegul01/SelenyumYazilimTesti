package pktSlnm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class yeniSekmeAçmaTesti {
	public static void yeniSekmeAçmaTesti(WebDriver surucu) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");

	surucu.get("https://www.w3schools.com/");	
	        String currentWindowHandle = surucu.getWindowHandle();
	        ((JavascriptExecutor) surucu).executeScript("window.open()");
	        
	        for (String windowHandle : surucu.getWindowHandles()) {
	            if (!windowHandle.equals(currentWindowHandle)) {
	            	surucu.switchTo().window(windowHandle);
	                break;
	            }
	        }
	        
	        surucu.get("https://www.w3schools.com/pro/index.php");
	        
	        surucu.quit();
	    }
	}



