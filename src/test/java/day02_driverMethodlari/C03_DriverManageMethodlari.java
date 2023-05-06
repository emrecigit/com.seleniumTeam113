package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
        Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi
        Kodlar calismaya basladiginda biz driver icin yol gostermezsek
        Selenium kendi driver'ini devreye sokuyor
        Ama baslangicta driver ayari aradigi icin biraz yavas calisir

        driver.manage.window.istenen ayar ile window'umuzu istedigimiz boyuta getirebilir
        veya window'un konum ve buyukluk bilgilerine ulasabiliriz

        Biz genelde bir teste baslamadan once window'u maximize yapmayi tercih ederiz
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        Implicitly wait bir web sayfasi acilincaya veya
        aradigimiz elementler bulununcaya kadar
        driver'in bekleyecegi maximum sureyi belirler
         */
        driver.get("https://www.amazon.com");
        System.out.println("Baslangicta konum : "+driver.manage().window().getPosition());// Baslangicta konum : (9, 9)
        System.out.println("Baslangicta boyut : "+driver.manage().window().getSize()); // Baslangicta boyut : (1051, 798)
        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println("Maximize konum : "+driver.manage().window().getPosition());// Maximize konum : (-8, -8)
        System.out.println("Maximize boyut : "+driver.manage().window().getSize()); // Maximize boyut : (1552, 832)
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum : "+driver.manage().window().getPosition());// Fullscreen konum : (0, 0)
        System.out.println("Fullscreen boyut : "+driver.manage().window().getSize()); // Fullscreen boyut : (1536, 864)
        Thread.sleep(1000);
        driver.manage().window().minimize();
        System.out.println("Minimize konum : "+driver.manage().window().getPosition());// Minimize konum : (9, 9)
        System.out.println("Minimize boyut : "+driver.manage().window().getSize()); // Minimize boyut : (1051, 798)
        // pencereyi istedigimiz konum ve boyuta getirelim
        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(200,500));
        System.out.println("İstedigimiz konum : "+driver.manage().window().getPosition());// İstedigimiz konum : (48, 48)
        System.out.println("İstedigimiz boyut: "+driver.manage().window().getSize()); // İstedigimiz boyut: (516, 502)

        Thread.sleep(3000);
        driver.close();
    }
}
