
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        this.driver = DriverSingleton.getDriver();
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        NgWebDriver ngWebDriver = new NgWebDriver(driver);
        ngWebDriver.waitForAngularRequestsToFinish();
    }

    @Test
    public void test01(){
        Sync s = new Sync(driver);
        s.syncClick();
    }

    @Test
    public void show() throws InterruptedException {
        Sync ss = new Sync(driver);
        ss.shows();
    }

    @Test
    public void test3(){
        Sync c = new Sync(driver);
        c.render();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/h4")));
    }




}
