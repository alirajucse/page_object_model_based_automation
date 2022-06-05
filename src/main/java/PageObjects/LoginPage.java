package PageObjects;

import Utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    WebDriverWait wait;
    //WaitForElement t = new WaitForElement(driver);

    public LoginPage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input[data-qa='login-email']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(css = "input[placeholder='Password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(css = "button[data-qa='login-button']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(css = "li:nth-child(9) a:nth-child(1)")
    @CacheLookup
    WebElement loginVerify;

    @FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
    @CacheLookup
    WebElement lnkLogout;



    public void enterUserEmail(String email)
    {
        wait.until(ExpectedConditions.elementToBeClickable(txtEmail));
        txtEmail.sendKeys(email);
    }

    public void enterUserPassword(String pwd)
    {
        wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        txtPassword.sendKeys(pwd);
    }


    public void clickLogin()
    {
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
    }

    public void loginVerify()
    {
        wait.until(ExpectedConditions.elementToBeClickable(loginVerify));
    }

    public void clickLogout()
    {
        lnkLogout.click();
    }
}
