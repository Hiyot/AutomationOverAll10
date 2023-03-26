import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", Constant.CHROME_PATH);
            driver = new ChromeDriver();
        }
        return driver;
    }
}
