package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_edevlet {
    //1- https://www.turkiye.gov.tr/ sayfasına gidin.
    //2- Arama kutusuna “city bike” yazip aratin
    //3- Görüntülenen sonuçların sayısını yazdırın
    //4- Listeden ilk urunun resmine tıklayın.
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.turkiye.gov.tr/ sayfasına gidin.
        driver.get("https://www.turkiye.gov.tr/");
        Thread.sleep(3000);
        //2- SAyfayi Yenileyin
        driver.navigate().refresh();
        //3- Kapat Butonuna Tiklayin
        Thread.sleep(3000);
        //4- Giriş Yap Butonuna Tiklayin
        driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[5]/a")).click();
        Thread.sleep(3000);
        //5- T.C Kimlik No TextBox'ina 11 Haneli T.C Kimlik No'nuzu giriniz
        String tc ="53536100508";
        driver.findElement(By.xpath("//*[@id='tridField']")).sendKeys(tc);
        //6- Sifre No TextBox'ina Key giriniz
        String key = "A120180c";
        driver.findElement(By.xpath("//*[@id='egpField']")).sendKeys(key);
        Thread.sleep(2000);
        //7- Giris Yap Butonuna Basiniz
        driver.findElement(By.xpath("//*[@id='loginForm']/div[2]/input[4]")).click();
        Thread.sleep(2000);
        //8- Arama TexBox'ina 'Yurt İçi Seçmen Kaydı' Yaziniz
        String aranacakMetin = "Yurt İçi Seçmen Kaydı";
        driver.findElement(By.xpath("//*[@id='searchField']")).sendKeys(aranacakMetin);
        Thread.sleep(2000);
        //9- Arama Butonuna Basiniz
        driver.findElement(By.xpath("//*[@id='searchButton']")).click();
        Thread.sleep(2000);
        //10 - 'Yurt İçi Seçmen Kaydı' linkine Tiklayiniz
        driver.findElement(By.xpath("//*[@id='s01']/div[2]/ul/li/a")).click();
        Thread.sleep(10000);
        //11- Seçmen Bilgi Kağıdını İndir Linkine Tiklayiniz.
        driver.findElement(By.xpath("//*[@id='showPdfLink']")).click();
        Thread.sleep(3000);
        //12- Emre Menusune Tiklayin
        driver.findElement(By.xpath("//*[@id='userMenu']/a")).click();
        Thread.sleep(3000);
        //13- Guvenli Çıkış Linkine Tıklayiniz.
        driver.findElement(By.xpath("//*[@id='userContextMenuList']/li[8]/a")).click();
        //14- Web Sayfasini Kapatin
        Thread.sleep(3000);
        driver.close();
    }
}