package chapternine;

import general.TestShopScenario;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestDataDriven extends TestShopScenario {

    @Parameters({"email", "password"})
    @Test
    public void loginPage(String email, String password){

        // Go go login page from home page
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();

        // On the login page, enter the credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials(email, password);
        loginPage.clickSubmitLoginButton();

        // Check if login was successful
        loginPage.validateSuccessfulLogin();
    }

}
