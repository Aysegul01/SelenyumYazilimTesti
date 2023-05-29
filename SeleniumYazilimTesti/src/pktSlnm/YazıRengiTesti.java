package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.InvalidSelectorException;
public class YazıRengiTesti {
	public static void YazıRengiTesti( WebDriver surucu) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");

	 surucu.get("https://www.w3schools.com/");
	 Thread.sleep(1000);
           WebElement textElement = surucu.findElement(By.xpath("//i[@class='fa fa-logo w3-hide']")); /*"//@font[contains(text(), 'Dünyanın en büyük web geliştirici sitesi ile.')]"*/
	         String color = textElement.getCssValue("color");
	         Thread.sleep(1000);
	         if (color.equals("rgba(51, 51, 51, 1)") || color.equals("#333333")) {
	             System.out.println("Yazı rengi doğru: " + color);
	         } else {
	             System.out.println("Yazı rengi yanlış. Beklenen: #333333, Gerçek: " + color);
	         }
	     	surucu.quit(); 
	       }
}  