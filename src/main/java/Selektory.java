import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selektory {
    public static WebDriver driver;

    @Test
    public void selektory(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.selenium-shop.pl/");

        WebElement sklepMenu = driver.findElement(By.linkText("SKLEP"));
        sklepMenu.click();

    }
}
