package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement {

    private WebDriver driver;

    public WaitForElement(WebDriver driver){
        this.driver=driver;
    }

    public WebElement waitForElement(By locator, int timeout)
    {
        WebElement element = new WebDriverWait(driver, timeout).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
}
