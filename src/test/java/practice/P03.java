package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
      /* ...Exercise3...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculater under Micro Apps
// Type any number in the first input
// Type any number in the second input
// Click on Calculate
// Get the result
// Print the result
      */
      public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// Navigate to  https://testpages.herokuapp.com/styled/index.html
            driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
            Thread.sleep(2000);

// Click on  Calculater under Micro Apps
            driver.findElement(By.xpath("//*[@id='calculatetest']")).click();
            Thread.sleep(2000);

// Type any number in the first input
            driver.findElement(By.xpath("//*[@id='number1']")).sendKeys("24");
            Thread.sleep(2000);

// Type any number in the second input
            driver.findElement(By.xpath("//*[@id='number2']")).sendKeys("36");
            Thread.sleep(2000);

// Click on Calculate
            driver.findElement(By.xpath("//*[@id='calculate']")).click();
            Thread.sleep(2000);

// Get the result
            WebElement sonuc = driver.findElement(By.xpath("/html/body/div/div[3]/div/p "));
            String result = driver.findElement(By.xpath("/html/body/div/div[3]/div/p ")).getText();
            Thread.sleep(2000);

// Print the result
            System.out.println(result);
            driver.close();



      }
}
