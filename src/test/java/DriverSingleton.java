import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSingleton {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            System.setProperty("webdriver.chrome.driver", Constant.CHROME_PATH);
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
