package chapternine;

import general.TestShopScenario;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestShopScenario {

    @Test
    public void loginPage(){

        // Go go login page from home page
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();

        // On the login page, enter the credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("bootcamper@feelthepain.com", "1qazxsw2");
        loginPage.clickSubmitLoginButton();

        // Check if login was successful
        loginPage.validateSuccessfulLogin();
    }

}
