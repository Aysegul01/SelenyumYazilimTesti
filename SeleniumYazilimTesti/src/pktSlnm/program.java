package pktSlnm;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import com.google.errorprone.annotations.FormatString;
public class program {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDriver\\ChoremeDriver\\chromedriver.exe");
		WebDriver surucu=new ChromeDriver();
		surucu.get("https://www.w3schools.com/");
		surucu.manage().window().maximize();
		Thread.sleep(2000);
		int result;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Çalıştırmak istediğiniz test türlerini seçiniz");
			System.out.println("1-AçılırPencere");
			System.out.println("2-AramaKontrolTesti");
			System.out.println("3-BaşlıkKontrolTesti");
			System.out.println("4-ButonTestleriniÇalıştır");
			System.out.println("5-DinamikVeriKontrolTesti");
			System.out.println("6-ImageİkiTesti");
			System.out.println("7-LoginTesti");
			System.out.println("8-LoginUyarıTesti");
			System.out.println("9-LogoBoyutTesti");
			System.out.println("10-MenüNavigasyonTesti");
			System.out.println("11-popuptestiniçalıştır");
			System.out.println("12-RenkKontrolTesti");
			System.out.println("13-RenKontrolTestiİki");
			System.out.println("14-ResimKontrolTesti");
			System.out.println("15-SayfaKaydırma");
			System.out.println("16-SayfaKontrolTesti");
			System.out.println("17-SliderKontrolTesti");
			System.out.println("18-TextKontrolTesti");
			System.out.println("19-TranslateButonunuSeçme");
			System.out.println("21-YazıRengiTesti");
			System.out.println("22-yeniSekmeAçmaTesti");
			System.out.println("23- Çıkış");
			result=scanner.nextInt();
			if(result==1) {
				AçılırPencere.AçılırPencereTesti(surucu);
			Thread.sleep(1000);
			
			}
			if(result==2) {
				AramaKontrolTesti.AramaKontrolTestii(surucu);
				Thread.sleep(1000);
			}
			if(result==3) {
				BaşlıkKontrolTesti.BaşlıkKontrolTestii(surucu);
				Thread.sleep(1000);
			}
			if(result==4) {
				ButonTestleriniÇalıştır.ButonTestleriniÇalıştırr(surucu);
				Thread.sleep(1000);
			}
			if(result==5) {
				DinamikVeriKontrolTesti.DinamikVeriKontrolTestii(surucu);
				Thread.sleep(1000);
			}
			if(result==6) {
				ImageİkiTesti .ImageİkiTestii (surucu);
				Thread.sleep(1000);
			}
			if(result==7) {
				 LoginTesti. LoginTestii(surucu);
				Thread.sleep(1000);
			}
			if(result==8) {
				LoginUyarıTesti.LoginUyarıTesti(surucu);
				Thread.sleep(1000);
			}
			if(result==9) {
				LogoBoyutTesti .LogoBoyutTesti (surucu);
				Thread.sleep(1000);
			}
			if(result==10) {
				MenüNavigasyonTesti.MenüNavigasyonTestii(surucu);
				Thread.sleep(1000);
			}
			if(result==11) {
				popuptestiniçalıştır.popuptestiniçalıştır(surucu);
				Thread.sleep(1000);
			}
			if(result==12) {
				 RenkKontrolTesti . RenkKontrolTesti (surucu);
				Thread.sleep(1000);
			}
			if(result==13) {
				RenKontrolTestiİki.RenKontrolTestiİki(surucu);
				Thread.sleep(1000);
			}
			
			if(result==14) {
				ResimKontrolTesti.ResimKontrolTestii(surucu);
				Thread.sleep(1000);
			}if(result==15) {
				SayfaKaydırma.SayfaKaydırmaTesti(surucu);
				Thread.sleep(1000);
			}
			
			if(result==16) {
				 SayfaKontrolTesti.SayfaKontrolTesti(surucu);
				Thread.sleep(1000);
			}
			if(result==18) {
				SliderKontrolTesti.SliderKontrolTesti(surucu);
				Thread.sleep(1000);
			}
			if(result==19) {
				TextKontrolTesti.TextKontrolTesti(surucu);
				Thread.sleep(1000);
			}
			if(result==20) {
				TranslateButonunuSeçme.TranslateButonunuSeçme(surucu);
				Thread.sleep(1000);
			}
			if(result==21) {
				YazıRengiTesti.YazıRengiTesti(surucu);
				Thread.sleep(1000);
			}
			if(result==22) {
				yeniSekmeAçmaTesti.yeniSekmeAçmaTesti(surucu);
				Thread.sleep(1000);
			}
			
			
			
		
		}while(result!=23);
        
	}
	}










