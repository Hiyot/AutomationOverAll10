
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SynchronizationTest {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static ChromeOptions options;

    @BeforeClass
    public void SynchronizationTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        this.driver = DriverSingleton.getDriver();
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test01(){
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.id("checkbox")).click();
    }



}
