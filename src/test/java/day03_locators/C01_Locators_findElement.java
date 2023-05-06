package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators_findElement {
    public static void main(String[] args) throws InterruptedException {

        /* Locators olarak ; //driver.findElement(By.id()
        1-id,
        2-class,
        3-link,
        4-linkin bir kısmı, (partial)
        5-tag name, unique bulmaz genelde a tag'i ile Link (text) sayisi bulmak icin
        6-name
        7-xpath, %90    // ilk 6 ile bulunamadiysa kullanilir
        8-cssSelector   // ilk 6 ile bulunamadiysa kullanilir
         */

        /*
        amazon anasayfasina gidin
        arama sayfasina Nutella yazdirin
        Enter tusuna basarak arama yapin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfasina gidin
        driver.get("https://amazon.com");

        // arama sayfasina Nutella yazdirin
        /*
        Test Otomasyonu yaprken
        bir web elementi kullabmak istersek 2 seye ihtiyacımiz var
        1 - o web elemeti benzersiz olarak tarif edebilecegimiz bir locator
        Ornegin Amazon sitesindeki arama kutusunun unique tarif edicisi olarak
        id = "twotabsearchtextbox" kullanabilirz

        2 - bu locator'i soyledigimizde bize web elemeti bulup getirecek method
         */

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
     /*
      data turu   objenin adi        = findElement : webElementi bulan method
                                       By : webElementi bulacagimiz lacator'in turunu yazdigimiz method
                                       twotabsearchtextbox : unique tarif icin id attribute degeri
     */
        /*
        findElement() verdigimiz locator turu ve o locator icin
        verdigimiz degere gore webElement'i arar
        locator icin verdigimiz deger hataliysa  veya
        locator stratejisinde hata yaptiysak
        aranan web elementi imlicitlyWait olarak tanimladigimiz
        maximum sure boyunca arar
        bulamadigi icin "NosuchElementException" firlatir
        ve kodlarin kalanini calistirmaz
         */

        aramaKutusuElementi.sendKeys("Zehra");
        // istenen webElemente istenen yaziyi gonderir
        //Enter tusuna basarak arama yapin

        aramaKutusuElementi.submit();
        // istenen webElementi uzerinde Enter tusuna basar

        Thread.sleep(7000);
        driver.close();

    }
}
