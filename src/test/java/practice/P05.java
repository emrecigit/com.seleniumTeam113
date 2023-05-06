package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {
    /*
//  1-Driver oluşturalim
//  2-Java class'imiza chnomedriver. exetyi tanitalim
//  3-Driver'in tum ekranı kaplamasini sagu ayalim
//  4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
//   Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
//  5-Navigate to http://www.babayigit.net/murat/testpage.html
//  6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
//      alanlarına gerekli bilgileri yazsın
//  7-Submit tuşuna bassın.
//  8- All information was entered correctly.. yazısının göründüğünü test etsin
//  9- Clear butonu ile tüm butonları temizlesin
//  10- Manuel olarak temizlendiğini görecek kadar beklesin
//  11- Sayfayı kapatsın
//  10-8. maddededeki Test sonucunu yazdırsın
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
