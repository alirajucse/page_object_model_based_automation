package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {

    private WebDriver driver;
    WebDriverWait wait;

    public SignupPage(WebDriver driver)
    {
        this.driver=driver;
        wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="a[href='/login']")
    @CacheLookup
    WebElement signUPLink;

    @FindBy(css="[type='text']")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(xpath="//input[@data-qa='signup-email']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath="//button[contains(text(),'Signup')]")
    @CacheLookup
    WebElement btnSignup;


    @FindBy(css = "#id_gender1")
    @CacheLookup
    WebElement titleChkbox;

    @FindBy(css = "#password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(css = "#days")
    @CacheLookup
    WebElement selectBirthday;

    @FindBy(css = "#months")
    @CacheLookup
    WebElement selectBirthMonth;

    @FindBy(css = "#years")
    @CacheLookup
    WebElement selectBirthYear;

    @FindBy(css = "#first_name")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(css = "#last_name")
    @CacheLookup
    WebElement txtLasttName;

    @FindBy(css = "#address1")
    @CacheLookup
    WebElement txtAddress;

    @FindBy(css = "#country")
    @CacheLookup
    WebElement selectCountry;

    @FindBy(css = "#state")
    @CacheLookup
    WebElement txtState;

    @FindBy(css = "#city")
    @CacheLookup
    WebElement txtCity;

    @FindBy(css = "#zipcode")
    @CacheLookup
    WebElement zipCode;

    @FindBy(css = "#mobile_number")
    @CacheLookup
    WebElement txtMobile;

    @FindBy(css = "button[data-qa='create-account']")
    @CacheLookup
    WebElement createAccountButton;

    public void navigateToSignup()
    {
        wait.until(ExpectedConditions.elementToBeClickable(signUPLink));
        signUPLink.click();
    }

    public void setUserName(String uname)
    {
        wait.until(ExpectedConditions.elementToBeClickable(txtUserName));
        txtUserName.sendKeys(uname);
    }

    public void setEmail(String email)
    {
        wait.until(ExpectedConditions.elementToBeClickable((By) txtEmail));
        txtEmail.sendKeys(email);
    }

    public void clickSignupButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable((By) btnSignup));
        btnSignup.click();
    }

    public void clickTitle()
    {
        wait.until(ExpectedConditions.elementToBeClickable((By) titleChkbox));
        titleChkbox.click();
    }

    public void setPassword(String pwd)
    {
        wait.until(ExpectedConditions.elementToBeClickable((By) txtPassword));
        txtPassword.sendKeys(pwd);
    }

    public void setDayOfBirth()
    {
        wait.until(ExpectedConditions.elementToBeClickable((By) selectBirthday));
        selectBirthday.click();
        Select se = new Select(driver.findElement((By) selectBirthday));
        se.selectByIndex(4);
    }

    public void setMonthOfBirth()
    {
        wait.until(ExpectedConditions.elementToBeClickable((By) signUPLink));
        selectBirthday.click();
        Select se = new Select(driver.findElement((By) selectBirthMonth));
        se.selectByIndex(4);
    }

    public void setYearOfBirth()
    {
        selectBirthYear.click();
        Select se = new Select(driver.findElement((By) selectBirthYear));
        se.selectByIndex(4);
    }

    public void setFirstName(String name)
    {
        txtFirstName.sendKeys(name);
    }

    public void setLasttName(String name)
    {
        txtLasttName.sendKeys(name);
    }

    public void setAddress(String address)
    {
        txtAddress.sendKeys(address);
    }

    public void selectCountry()
    {
        selectCountry.click();
        Select se = new Select(driver.findElement((By) selectCountry));
        se.selectByIndex(4);
    }

    public void setState(String state)
    {
        txtState.sendKeys(state);
    }

    public void setCity(String city)
    {
        txtCity.sendKeys(city);
    }

    public void setZipCode(String zip)
    {
        zipCode.sendKeys(zip);
    }

    public void setMobile(String mob)
    {
        txtMobile.sendKeys(mob);
    }

    public void createAccount()
    {
        createAccountButton.click();
    }

}

