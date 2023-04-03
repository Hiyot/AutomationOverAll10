import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sync extends BasePage{

    private WebDriver driver;
    private static WebDriverWait wait;

    public Sync(WebDriver driver){
        this.driver = driver;
    }

    public void syncClick(){
        clickSync();
        removeCheckBox();
    }

    public void shows() throws InterruptedException {
        showHidden();
        Thread.sleep(10);
        newHideElement();
    }


    public void render(){
        renderButton();
    }
    private void clickSync(){
        clickElement(By.id("btn"));
    }
    private void removeCheckBox(){
        clickElement(By.id("message"));
    }

    private void showHidden(){
        clickElement(By.id("hidden"));
    }
    private void newHideElement(){
        clickElement(By.id("contact_info_left"));
    }

    private void renderButton(){
        clickElement(By.id("rendered"));
    }
}
