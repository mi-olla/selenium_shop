import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PierwszyTest {
    public static WebDriver driver;

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.selenium-shop.pl/");
        driver.manage().window().maximize();

        System.out.println("Tytuł strony:" + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Selenium Shop Automatyzacja Testów");

        driver.quit();
    }

    @Test
    public void weryfikacjaPodstronySklep(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.selenium-shop.pl/");
        driver.findElement(By.linkText("SKLEP")).click();

        String adresUrl = driver.getCurrentUrl();
        System.out.println("Adres URL: " + adresUrl);

        Assert.assertEquals(adresUrl,"http://www.selenium-shop.pl/sklep/");

        driver.quit();
    }
}
