import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/downloads/");


        String verifiedLink = driver.findElement(By.xpath("//div[6]//p/a")).getAttribute("href");
        String correctLink = "https://www.selenium.dev/maven";


        if (verifiedLink.equals(correctLink)) {
            System.out.println("Фактическая и ожидаемая сcылки совпадают.");
        } else {
            System.out.println("Ссылки не совпадают.");
            System.out.println("Фактическая ссылка: " + verifiedLink+"." + " Ожидаемая ссылка: "+ correctLink +".");
        }



        driver.quit();







    }
}