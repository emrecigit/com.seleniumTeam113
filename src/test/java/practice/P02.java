package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
     /*
     . .Exercise2...
// 1-Driver oluşturalim
// 2-Java class'imiza chnomedriver. exetyi tanitalim
// 3-Driver'in tum ekranı kaplamasini sagu ayalim
// 4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
// 5-"https://www.otta.de" adresine gidelim
// 6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
// 7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
// 8-Ardindan "https://wisequarter.com/" adresine gidip
// 9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
// 10-Bir onceki web sayfamiza geri donelim
// 11-Sayfayı yenileyelim
// 12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
// 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
     public static void main(String[] args) throws InterruptedException {
// 1-Java class'imiza chnomedriver. exetyi tanitalim

         System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

// 2-Driver oluşturalim
         WebDriver driver = new ChromeDriver();

// 3-Driver'in tum ekranı kaplamasini saglayalim
         driver.manage().window().maximize();
// 4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
// Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// 5-"https://www.otta.de" adresine gidelim
         driver.get("https://www.otta.de");

// 6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
         String ottoTitle = driver.getTitle();
         System.out.println("ottoTitle : "+ottoTitle);
         String ottoUrl = driver.getCurrentUrl();
         System.out.println("ottoUrl : "+ottoUrl);

// 7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
         if (ottoUrl.contains("OTTO") && ottoTitle.contains("OTTO") ){
             System.out.println("OTTO yazisi her ikisinde de vardir, Test PASSED");
         }else {
             System.out.println("OTTO yazisi en az birisinde yoktur, Test PASSED");
         }

// 8-Ardindan "https://wisequarter.com/" adresine gidip
         driver.navigate().to("https://wisequarter.com/");

// 9-BU adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini kontrol edelim
         String wqTitle = driver.getTitle();
         System.out.println("wqTitle=" + wqTitle);
         boolean isTrue = wqTitle.contains("Quarter"); // true - false
         if (isTrue){
             System.out.println("Your TEST PASSED");
         }else{
             System.out.println("Your TEST FAILED");
         }
// 10-Bir onceki web sayfamiza geri donelim
         driver.navigate().back();
         Thread.sleep(2000);

// 11-Sayfayı yenileyelim
         driver.navigate().refresh();
         Thread.sleep(2000);

// 12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
         driver.navigate().forward();
         Thread.sleep(2000);
         System.out.println("All is well!");
         driver.close();
// 13- En son adim olarak butun sayfalarimizi kapatmis olalim
         driver.quit();
     }
}
