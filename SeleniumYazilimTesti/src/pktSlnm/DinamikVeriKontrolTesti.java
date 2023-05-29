package pktSlnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DinamikVeriKontrolTesti {
	public static void DinamikVeriKontrolTestii(WebDriver surucu) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
	
	surucu.get("https://www.w3schools.com/");
	Thread.sleep(2000);
    int sonucSayisi=popUpAramaSonucSayisi(surucu);
	 Thread.sleep(2000);
	 System.out.println("Bulunan sonuc sayısı: " +sonucSayisi);
	 surucu.quit();

	}
	 public static int popUpAramaSonucSayisi(WebDriver surucu)  throws InterruptedException
		{//search butonun text kısmını yazmak için kontrol ediyor test 1
		    surucu.findElement(By.id("search2")).sendKeys("next");
		    Thread.sleep(1000);
		    //Gönderilen kelimeyi aratıyor test2
			WebElement btn=surucu.findElement(By.id("learntocode_searchbtn"));
			btn.click();
	    	Thread.sleep(1000);
	    	//ve google searchde arıyor kelimeyi kendi sayfasında olmadığı için sonucu googledan gösteriyor test3
		    WebElement div=surucu.findElement(By.id("listofsearchresults"));
			Thread.sleep(1000);
			String displayName=div.getText();
			WebElement form=surucu.findElement(By.id("googleSearch"));
			form.submit();
			Thread.sleep(2000);
			//Ve arama sonuc sayisini çekiyor test4
			WebElement resultDiv=surucu.findElement(By.id("resInfo-0"));
		    String text =resultDiv.getText();
		    String[] texts =text.split(" ");
			return Integer.parseInt(texts[1]);
		 }
	 
}
