package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver hDriver;

    public HomePage(WebDriver rdriver)
    {
        hDriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(linkText="Signup / Log")
    @CacheLookup
    WebElement SignupORLogin;


    public void setSignupLoginLink(String uname)
    {
        SignupORLogin.click();
    }

}
