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
        driver.get("http://htmlbook.ru/");


        String verifiedLink = driver.findElement(By.xpath("//aside//a")).getAttribute("href");
        String correctLink = "http://htmlbook.ru/html";


        if (verifiedLink.equals(correctLink)) {
            System.out.println("Фактическая и ожидаемая сcылки совпадают.");
        } else {
            System.out.println("Ссылки не совпадают.");
            System.out.println("Фактическая ссылка: " + verifiedLink+"." + " Ожидаемая ссылка: "+ correctLink +".");
        }



        driver.quit();







    }
}