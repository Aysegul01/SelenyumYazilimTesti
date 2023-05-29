package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTesti {
	public static void  LoginTestii(WebDriver surucu) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
		
		surucu.get("https://www.w3schools.com/");
	Thread.sleep(1000);
	//Login butonunu bulup tıklıyor test1
	  WebElement customButton = surucu.findElement(By.id("w3loginbtn"));
      customButton.click();
      Thread.sleep(1000);
      //ve başka sayfaya yönlendiriyor yani butondaki link çalışıyor test2
      String expectedUrl = "https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
      String actualUrl = surucu.getCurrentUrl();
      Thread.sleep(1000);
      //mail yazmak için text kutusuna tıklanıyor burda da hata yok test3
      WebElement Button = surucu.findElement(By.id("modalusername"));
      Button.click();
      Thread.sleep(1000);
	surucu.findElement(By.id("modalusername")).sendKeys("aysegl@gmail.com");
	Thread.sleep(1000);
	//gönderdiğimiz mail adresi doğru şekilde iletiliyor test5
	WebElement div=surucu.findElement(By.id("modalusername") );
	Thread.sleep(3000);
	String email=div.getText();
	
	surucu.quit();
	if(email.equals("aysegl@gmail.com")) {
		System.out.println("Test Başarılı.");
	}
	else{
		System.out.println("Test Başarısız.");
	}
	}
}
