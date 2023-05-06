package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class P04 {
       /*
// Navigate to website https://testpages.herokuapp.com/styled/index.html
// Under the ORIGINAL CONTENTS
// click on Alerts
// print the URL
// navigate back
// print the URL
// Click on Basic Ajax
// print the URL
// enter value 20 and ENTER
// and then verify Submitted Values is displayed open page
// close driver
 */
       public static void main(String[] args) throws InterruptedException {
           System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// Navigate to website https://testpages.herokuapp.com/styled/index.html
           driver.get("https://testpages.herokuapp.com/styled/index.html");
           Thread.sleep(2000);
// Under the ORIGINAL CONTENTS
// click on Alerts
           driver.findElement(By.xpath(" //*[@id='alert']")).click();

// print the URL
        String currentUrl =  driver.getCurrentUrl();
           System.out.println(currentUrl);

// navigate back
           driver.navigate().back();

// print the URL
           String currentUrl2 =  driver.getCurrentUrl();
           System.out.println(currentUrl2);

// Click on Basic Ajax
           driver.findElement(By.xpath("//*[@id='basicajax']")).click();

// print the URL
           String currentUrl3 =  driver.getCurrentUrl();
           System.out.println(currentUrl3);

// enter value 20 and ENTER
           driver.findElement(By.xpath("//*[@id='lteq30']")).sendKeys("20"+ Keys.ENTER);

// and then verify Submitted Values is displayed open page
           String expected = "Submitted Values";
           String actualResult = driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();
           if (expected.equals(actualResult)){
               System.out.println("Test PASSED");
           }else {
               System.out.println("Test FAILED");
           }
// close driver
           driver.close();



       }
}
