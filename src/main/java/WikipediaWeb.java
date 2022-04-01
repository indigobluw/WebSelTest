import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WikipediaWeb {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.safaridriver().setup();
        WebDriverManager.chromedriver().setup();

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://sv.wikipedia.org/wiki/Sverige");


        System.out.println(driver.getTitle());

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.name("go"));
        searchBox.sendKeys("Norge");

        System.out.println(searchBox.getAttribute("value"));

        searchBox.click();

        searchButton.getText();
        searchBox = driver.findElement(By.name("search"));
        searchBox.getAttribute("value");


        driver.quit();
    }
}
