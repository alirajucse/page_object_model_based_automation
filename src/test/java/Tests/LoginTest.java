package Tests;

import Base.TestBase;
import PageObjects.LoginPage;

import PageObjects.SignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    private WebDriver driver;
    private LoginPage loginPage;
    private SignupPage signupPage;


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver();
        loginPage=new LoginPage(driver);
        signupPage=new SignupPage(driver);
    }
    @Parameters({ "email", "password" })
    @Test(priority = 1, groups = {"login","smoke"})
    public void loginWithValidCredentialsTest(String email,String password) throws InterruptedException {

        signupPage.navigateToSignup();
        loginPage.enterUserEmail(email);
        loginPage.enterUserPassword(password);
        loginPage.clickLogin();
        loginPage.loginVerify();
        //signoutPage.signOut();
    }
}

