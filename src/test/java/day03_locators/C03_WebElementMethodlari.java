package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon sayfasina gidip arama kutusunu locate edelim
        driver.get("https://www.amazon.com");
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        System.out.println(aramaKutusuElementi.isDisplayed()); // gorunuyor mu true
        System.out.println(aramaKutusuElementi.isEnabled());   // etkinlestirilmis mi true
        System.out.println(aramaKutusuElementi.getText());// varsa webelementin uzerindeki yaziyi getirir
        aramaKutusuElementi.sendKeys("Nutella"); // yazi gonderir.
        Thread.sleep(2000);
        aramaKutusuElementi.clear(); // yazilan yaziyi siler

        System.out.println(aramaKutusuElementi.getSize()); // (789, 38)
        System.out.println(aramaKutusuElementi.getSize().height); // 38

        System.out.println(aramaKutusuElementi.getTagName()); // input
        System.out.println(aramaKutusuElementi.getAttribute("class")); // nav-input nav-progressive-attribute
        System.out.println(aramaKutusuElementi.getLocation()); // (279, 10)
        System.out.println(aramaKutusuElementi.getRect().getDimension()); // (789, 38)


        Thread.sleep(3000);
        driver.close();
    }
}
