package chapternine;

import general.TestShopScenario;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class NOK_LoginTest extends TestShopScenario {

    @Test
    public void wrongLogin(){

        // Go go login page from home page
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();

        // On the login page, enter the credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("bootcamper@feelthepain", "1qazxsw2");
        loginPage.clickSubmitLoginButton();

        // Check if login failed
        loginPage.validateWrongLogin();

        // Try again with correct credentials
        loginPage.enterCredentials("bootcamper@feelthepain.com", "1qazxsw2");
        loginPage.clickSubmitLoginButton();
        loginPage.validateSuccessfulLogin();
    }
}
