package Tests;
import Base.TestBase;
import PageObjects.SignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SignupTest extends TestBase {
    private WebDriver driver;
    private SignupPage signupPage;


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver();
        signupPage=new SignupPage(driver);
    }
    @Parameters({ "caseID","email","password" })
    @Test(priority = 2, groups = {"smoke"},dependsOnMethods = { "LandingPageTest" })
    public void signUpWithValidCredentialsTest(String caseID,String email,String password) throws InterruptedException {
    }
}
