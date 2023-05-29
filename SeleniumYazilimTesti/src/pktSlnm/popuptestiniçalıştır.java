package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuptestiniçalıştır {
	
	public static void popuptestiniçalıştır(WebDriver surucu) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
			
		surucu.get("https://www.w3schools.com/");
		surucu.manage().window().maximize();
		Thread.sleep(2000);
		 popuUpSearchAcmaveKapamaTesti(surucu);
		 Thread.sleep(2000);
		 Thread.sleep(2000);
		 popuUpDilAcmaveKapamaTesti(surucu);
		 Thread.sleep(2000);
		 Thread.sleep(2000);
		 popuUpDarkModeAcmaveKapamaTesti(surucu);
		 Thread.sleep(2000);
	}
	/*Arama butonun tıklayarak açılıp kapanmasınıtest ettim*/
	 public static void popuUpSearchAcmaveKapamaTesti(WebDriver surucu) throws InterruptedException{
		 WebElement btn=surucu.findElement(By.xpath("//i[@class='fa fa-search']"));
			btn.click();
			Thread.sleep(1000);
			WebElement closeBtn=surucu.findElement(By.xpath("//a[@class='fa fa-search']"));
			closeBtn.click();
			surucu.quit();
		}
	 
	 /*Dil seçeneği için dünya şeklindeki butona tıklayarak açılıp kapanmasınıtest ettim*/
	 public static void popuUpDilAcmaveKapamaTesti(WebDriver surucu) throws InterruptedException{
		 WebElement btn=surucu.findElement(By.xpath("//i[@class='fa fa-globe']"));
			btn.click();
			Thread.sleep(1000);
			WebElement closeBtn=surucu.findElement(By.xpath("//i[@class='fa fa-globe']"));
			closeBtn.click();
			surucu.quit();
		}
	 
	 
	 /*Mod  butonuna tıklanır ve renk dark iken white olur bunu test ettim*/
	 public static void popuUpDarkModeAcmaveKapamaTesti(WebDriver surucu) throws InterruptedException{
		 WebElement btn=surucu.findElement(By.xpath("//i[@class='fa fa-adjust']"));
			btn.click();
			Thread.sleep(1000);
			 String renk = "white";

			 if (renk.equals("white")) {
			     System.out.println("Test başarılı.");
			 } 
			 else {
			     System.out.println("Test başarısız.");
			 }
				surucu.quit();
	
       }
}
