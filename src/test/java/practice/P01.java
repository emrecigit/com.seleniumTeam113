package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {
    /*
    /....Exercise-1:...
 //Create a new class with main method
 //         Set Path
 //         Create a chrome driver
 //         Maximize window
 //         Open google home page https://www.google.com
 // On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
 // Wait about 4 sn
 // Navigate forward to amazon
 // Refresh page
 // Close/quit the browser
 // And Last step print "All is well" on console

 */
       //Create a new class with main method
    public static void main(String[] args) throws InterruptedException {

        //         Set Path (BU satirda driver'imizi tanittik ve yolunu gosterdik)
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        //         Create a chrome driver (Calisacagimiz tarayiciyi belirledik)
        WebDriver driver = new ChromeDriver();

        //         Maximize window (Bu satirda acilan penceremizi max. boyuta ulastirdik.(fullscreen degil)
        driver.manage().window().maximize();

        //         Open google home page https://www.google.com
        driver.get("https://www.google.com"); //Burada gidecegimiz adresi belirledik
        //Get ile navigate komutlarini kullanirken get komutu daha hizli calistigi icin tercih edilir
        //Navigate komutu ise daha çok bagimli durumlarda tercih edilir.


        // On the same class, navigate to amazon home page https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        // and navigate back to google
        driver.navigate().back();

        // Wait about 4 sn
        Thread.sleep(4000);

        // Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(2000);

        // Refresh page
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Close/quit the browser
        driver.quit(); //close ile quit arasındaki fark :
        // Close son acik sekmeyi kapatir,quit ise tüm sayfalari yani pencereyi kapatir

        // And Last step print "All is well" on console
        System.out.println("All is well");

    }
}
