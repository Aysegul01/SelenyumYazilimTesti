package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderKontrolTesti {
    public static void SliderKontrolTesti(WebDriver surucu) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
    	
    	surucu.get("https://www.w3schools.com/");
    	Thread.sleep(2000);
    	        // İlk resmi kontrol etme
    	        WebElement firstImage = surucu.findElement(By.tagName("img"));
    	        System.out.println("İlk resim URL'si: " + firstImage.getAttribute("src"));

    	        // Next butonuna tıklama
    	        clickNextImage(surucu);
    	        Thread.sleep(2000);
    	        // İkinci resmi kontrol etme
    	        WebElement secondImage = surucu.findElement(By.className("mySliders"));
    	        System.out.println("İkinci resim URL'si: " + secondImage.getAttribute("src"));

    	        // WebDriver'ı kapatma
    	        surucu.quit();
    	    }

 // Bir sonraki görsele tıklama metodu
    private static void clickNextImage(WebDriver driver) {
        WebElement nextButton = driver.findElement(By.className("next"));
        nextButton.click();
        
        // Resmin yüklenmesini beklemek için kısa bir süre uyuyoruz
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

       
