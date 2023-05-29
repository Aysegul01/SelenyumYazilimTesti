package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUyarıTesti {
	public static void LoginUyarıTesti(WebDriver surucu) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
		
		surucu.get("https://www.w3schools.com/");
	Thread.sleep(1000);
	  WebElement customButton = surucu.findElement(By.id("w3loginbtn"));
      customButton.click();
      Thread.sleep(1000);
      String expectedUrl = "https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
      String actualUrl = surucu.getCurrentUrl();
      Thread.sleep(1000);
      WebElement Button = surucu.findElement(By.id("modalusername"));
      Button.click();
      Thread.sleep(1000);
	surucu.findElement(By.id("modalusername")).sendKeys("aysegl@gmail.com");
	Thread.sleep(1000);
	
	WebElement div=surucu.findElement(By.id("modalusername") );
	Thread.sleep(3000);
	String email=div.getText();
	//gönderdiğimiz mail adresini submit ediyoruz giriş yapmak için ve giriş butonu çalışıyor mu diye test ediyoruz//
	  WebElement btn = surucu.findElement(By.className("LoginModal_cta_bottom_box_button_login__5Fbwv"));
      btn.click();
      Thread.sleep(1000);
     WebElement form=surucu.findElement(By.xpath("//xmlns[@action='http://www.w3.org/2000/svg']"));
		form.submit();
		 Thread.sleep(1000);
		 WebElement alertElement = surucu.findElement(By.xpath("//div[contains(@class, 'Alert_iwrp__5q1xH')]/font/font"));

	        // Yazıyı al ve ekrana yazdır
	        String alertText = alertElement.getText();
	        System.out.println(alertText);
         surucu.quit();
}
}