import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {


    public void clickElement(By locator){
        getWebElement(locator).click();
    }

    public void sendKeys(By locator, String text){
        getWebElement(locator).sendKeys(text);

    }

    private WebElement getWebElement(By locator){
        return DriverSingleton.getDriver().findElement(locator);
    }
}
