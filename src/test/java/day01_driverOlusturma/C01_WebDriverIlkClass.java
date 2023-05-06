package day01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class C01_WebDriverIlkClass {
    /*
    main Klasoru devoloperler icindir,
    tester'lar test klasoru altinda package ve class'lar icinde calisiriz
    proje basinda Selenium .jar dosyalari tasinir ve sonra yuklenir
    WebDriver ise her Class icin tekrar yuklenir (windows kullanicilarinda uzanti.exe olup mac te yoktur.)
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr");

        driver.get("file:///C:/Users/emre.cigit/Desktop/myresume/index.html");
    }
}
